package com.hadi.archives.presentation.screens.welcome

import android.app.Application
import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.hadi.archives.data.local.SliderData
import com.hadi.archives.data.model.Slider
import com.hadi.archives.presentation.navigation.Screen
import com.hadi.archives.ui.theme.BrutalCyan
import com.hadi.archives.ui.theme.BrutalYellow
import com.hadi.archives.utils.ThemePreferences
import com.hadi.archives.utils.applyBrutalism
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalPagerApi::class)
@Composable
fun WelcomeScreen(
    navController: NavController
) {

    val context = LocalContext.current.applicationContext as Application
    var isCustomTheme by remember { mutableStateOf(false) }

    // Load stored toggle state
    LaunchedEffect(Unit) {
        ThemePreferences.getThemeState(context).collectLatest {
            isCustomTheme = it
        }
    }

    if (isCustomTheme) rememberSystemUiController().setStatusBarColor(Color.Black) else rememberSystemUiController().setStatusBarColor(Color.White)



    val pagerState = rememberPagerState()
    val pages = SliderData.slides

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(if (isCustomTheme) Color.Black else Color.White)
    ) {

        HorizontalPager(
            modifier = Modifier
                .fillMaxWidth()
                .weight(7.5f),
            count = pages.size,
            state = pagerState
        ) { position ->

            Slider(slide = pages[position])

        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(2.5f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            val density = LocalDensity.current
            DotsIndicator(
                modifier = Modifier.padding(top = 36.dp),
                totalDots = 3,
                selectedIndex = pagerState.currentPage,
            )
            FinishButton(
                pagerState, pages.size - 1,
                onFinishClick = {
                    navController.navigate(Screen.Home.route)
                }
            )

        }


    }

}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun FinishButton(
    pagerState: PagerState,
    maxPage: Int,
    onFinishClick: () -> Unit
) {
    val context = LocalContext.current.applicationContext as Application
    var isCustomTheme by remember { mutableStateOf(false) }

    // Load stored toggle state
    LaunchedEffect(Unit) {
        ThemePreferences.getThemeState(context).collectLatest {
            isCustomTheme = it
        }
    }

    AnimatedVisibility(
        visible = pagerState.currentPage == maxPage,
        enter = fadeIn(
            animationSpec = tween(durationMillis = 500),
            initialAlpha = 0.2f
        ),
        exit = fadeOut(
            animationSpec = tween(durationMillis = 250)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(horizontal = 32.dp, vertical = 16.dp)
                    .applyBrutalism(
                        backgroundColor = Color(0xFFFFA500), //soft tangerine
                        borderWidth = 3.dp
                    )
                    .clickable(
                        onClick = onFinishClick,
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "EXPLORE",
                    style = MaterialTheme.typography.h6.copy(
                        color = if (isCustomTheme) Color.White else Color.Black
                    ),
                )
            }
        }


    }
}

@Composable
fun Slider(slide: Slider) {

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val context = LocalContext.current.applicationContext as Application
        var isCustomTheme by remember { mutableStateOf(false) }

        // Load stored toggle state
        LaunchedEffect(Unit) {
            ThemePreferences.getThemeState(context).collectLatest {
                isCustomTheme = it
            }
        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(32.dp)
                .applyBrutalism(
                    backgroundColor = BrutalCyan,
                    borderWidth = 3.dp
                ),
            contentAlignment = Alignment.Center
        ) {

            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(id = slide.image),
                contentScale = ContentScale.Crop,
                contentDescription = null
            )
        }

        Text(
            modifier = Modifier.padding(top = 16.dp, start = 12.dp, end = 12.dp),
            text = slide.quote,
            style = MaterialTheme.typography.subtitle1,
            color = if (isCustomTheme) Color.White else Color.Black,
            textAlign = TextAlign.Center
        )

        Text(
            modifier = Modifier.padding(top = 16.dp),
            text = "- ${slide.author}",
            color = if (isCustomTheme) Color.White else Color.Black,
            style = MaterialTheme.typography.subtitle1,
            textAlign = TextAlign.Center
        )

    }
}

@Composable
fun DotsIndicator(
    modifier: Modifier = Modifier,
    totalDots: Int,
    selectedIndex: Int
) {

    val context = LocalContext.current.applicationContext as Application
    var isCustomTheme by remember { mutableStateOf(false) }

    // Load stored toggle state
    LaunchedEffect(Unit) {
        ThemePreferences.getThemeState(context).collectLatest {
            isCustomTheme = it
        }
    }


    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ) {

        items(totalDots) { index ->
            if (index == selectedIndex) {
                Box(
                    modifier = Modifier
                        .height(15.dp)
                        .width(30.dp)
                        .background(Color(0xFF008080)) //teal
                        .border(
                            width = 2.dp,
                            color = if (isCustomTheme) Color.White else Color.Black
                        )
                )
            } else {
                Box(
                    modifier = Modifier
                        .height(15.dp)
                        .width(15.dp)
                        .background(Color(0xFFFFA500)) //soft tangerine
                        .border(
                            width = 2.dp,
                            color = if (isCustomTheme) Color.White else Color.Black
                        )
                )
            }

            if (index != totalDots - 1) {
                Spacer(modifier = Modifier.padding(horizontal = 2.dp))
            }
        }
    }
}
