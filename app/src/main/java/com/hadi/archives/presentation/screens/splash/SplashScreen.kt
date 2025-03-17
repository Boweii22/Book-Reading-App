package com.hadi.archives.presentation.screens.splash

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.hadi.archives.presentation.navigation.Screen
import com.hadi.archives.ui.theme.BrutalYellow
import com.hadi.archives.ui.theme.MonumentTypography
import com.hadi.archives.utils.applyBrutalism

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun SplashScreen(
    navController: NavController
) {
    val textAlpha by animateFloatAsState(
        targetValue = 1f,
        animationSpec = tween(durationMillis = 1500)
    )

    rememberSystemUiController().setStatusBarColor(Color.White)

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(8f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "THE ART OF\nBRUTALI-\nSM",
                style = MonumentTypography.h3.copy(
                    fontSize = 75.sp
                ),
                modifier = Modifier.graphicsLayer(alpha = textAlpha)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(2f),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(horizontal = 32.dp, vertical = 16.dp).applyBrutalism(
                        backgroundColor = BrutalYellow,
                        borderWidth = 3.dp,
                    ).clickable(
                        onClick = {
                            navController.navigate(Screen.Welcome.route)
                        },
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "GET STARTED",
                    style = MaterialTheme.typography.h6.copy(
                        color = Color.Black
                    ),
                )
            }
        }

    }
}
