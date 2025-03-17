package com.hadi.archives.presentation.screens.home

import android.app.Application
import android.widget.Space
import android.widget.Switch
import androidx.compose.animation.animateColor
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.hadi.archives.R
import com.hadi.archives.data.local.getManagementBooks
import com.hadi.archives.data.local.getRecentRead
import com.hadi.archives.data.local.getScienceFictions
import com.hadi.archives.presentation.components.CircularProgressBar
import com.hadi.archives.presentation.navigation.Screen
import com.hadi.archives.ui.theme.*
import com.hadi.archives.utils.ThemePreferences
import com.hadi.archives.utils.applyBrutalism
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@OptIn(ExperimentalCoilApi::class)
@Composable
fun HomeScreen(
    navController: NavController = rememberNavController()
) {

    val context = LocalContext.current.applicationContext as Application
    val coroutineScope = rememberCoroutineScope()
    var isCustomTheme by remember { mutableStateOf(false) }
    val scrollState = rememberScrollState()

    val recentRead = getRecentRead()
    val bgColor by animateColorAsState(
        targetValue = if (isCustomTheme) Color.Black else Color.White
    )
//    val txtColor by animateColorAsState(
//        targetValue = if (isCustomTheme) Color.White else Color.Black
//    )

    val transition = remember { Animatable(0f) }
    val textTransion = remember { Animatable(0f) }

    LaunchedEffect(isCustomTheme) {
        textTransion.animateTo(
            targetValue = 1f,
            animationSpec = tween(durationMillis = 1200, easing = LinearEasing)
        )
    }

    LaunchedEffect(isCustomTheme) {
        transition.animateTo(
            targetValue = 1f,
            animationSpec = tween(durationMillis = 1000, easing = FastOutSlowInEasing)
        )
    }

    val txtColor = if (isCustomTheme) {
        Color.White.copy(alpha = transition.value)
    } else {
        Color.Black.copy(alpha = transition.value)
    }
    val painter = rememberImagePainter(data = recentRead.imageUrl) {
        placeholder(R.drawable.ic_book_placeholder)
        error(R.drawable.ic_book_placeholder)
    }
    rememberSystemUiController().setStatusBarColor(Color(0xFF008080)) //teal

    //state to hold search query
    var searchQuery by remember { mutableStateOf("") }
    var isBrutalismThemeEnabled by remember { mutableStateOf(false) }

    //get filtered lists based on search query
    val filteredManagementBooks = getManagementBooks().filter { it.title.contains(searchQuery, ignoreCase = true) }
    val filteredScienceFictions = getScienceFictions().filter { it.title.contains(searchQuery, ignoreCase = true) }

    // Apply Brutalism theme if enabled
    val backgroundColor = if (isBrutalismThemeEnabled) Color.Black else Color.White
    val textColor = if (isBrutalismThemeEnabled) Color.White else Color.Black
    val buttonBackgroundColor = if (isBrutalismThemeEnabled) Color(0xFFFFA500) else Color(0xFF008080)

    // Load stored toggle state
    LaunchedEffect(Unit) {
        ThemePreferences.getThemeState(context).collectLatest {
            isCustomTheme = it
        }
    }



    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        if (isCustomTheme) Color.DarkGray else Color.LightGray,
                        if (isCustomTheme) Color.Black else Color.White
                    ),
                    start = Offset.Zero,
                    end = Offset(transition.value * 1000f, transition.value * 1000f)    //Animate diagonally
                )
            ),
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFF008080)), //Teal Background
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Row for The Notification and Brutalism Switch
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                //Brutalism theme switch toggle
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    // Use the BrutalismSwitch here
//            var isSwitchChecked by remember { mutableStateOf(false) }
                    CustomBrutalismSwitch(
                        checked = isCustomTheme,
//                        onCheckedChange = { isBrutalismThemeEnabled = it }
                        onCheckedChange = {newValue ->
                            isCustomTheme = newValue
                            coroutineScope.launch {
                                ThemePreferences.saveThemeState(context, newValue)
                            }
                        }
                    )
//            Switch (
//                checked = isBrutalismThemeEnabled,
//                onCheckedChange = { isBrutalismThemeEnabled = it},
//                colors = SwitchDefaults.colors(checkedThumbColor = Color.White, uncheckedThumbColor = Color.Gray)
//            )

                }

                Spacer(modifier = Modifier.width(16.dp)) //the space between the notification icon and the switch


                Box(
                    modifier = Modifier
                        .padding(all = 12.dp)
                        .size(50.dp)
                        .applyBrutalism(
                            backgroundColor = Color(0xFFFFA500), //soft tangerine
                            borderWidth = 3.dp,
                        ),
                    contentAlignment = Alignment.Center
                ) {

                    Icon(
                        modifier = Modifier
                            .size(32.dp)
                            .padding(all = 6.dp),
                        painter = painterResource(id = R.drawable.ic_notification),
                        contentDescription = "Notifications"
                    )
                }

            }
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, end = 12.dp, top = 16.dp),
                text = "Explore thousands of Books in a go",
                style = MonumentTypography.h3.copy(
                    fontSize = 26.sp
                )
            )

        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = (-23).dp)
        ) {
            SearchBox(searchQuery = searchQuery, onSearchQueryChanged = { searchQuery = it })

            // Hide "Continue Reading" section when searchQuery is not empty
            if (searchQuery.isEmpty()) {
                Text(
                    modifier = Modifier.padding(start = 12.dp, top = 8.dp, end = 12.dp),
                    text = "Continue Reading",
                    style = MaterialTheme.typography.h6,
                    color = txtColor
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                        .padding(horizontal = 12.dp, vertical = 8.dp)
                        .applyBrutalism(
                            backgroundColor = Color(0xFFFFA500), //soft tanfgerine
                            borderWidth = 3.dp,
                            cornersRadius = 6.dp
                        )
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(120.dp),
                            painter = painter,
                            contentScale = ContentScale.Crop,
                            contentDescription = "Continue Reading"
                        )

                        Divider(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(4.dp)
                                .background(Color.Black)
                        )

                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(8.dp),
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {

                            Text(
                                text = recentRead.title,
                                style = MaterialTheme.typography.h5,
                                maxLines = 2
                            )
                            Text(
                                text = "By " + recentRead.author,
                                style = MaterialTheme.typography.subtitle2,
                                color = Color.Black.copy(alpha = 0.5f),
                                maxLines = 2
                            )

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(bottom = 4.dp, end = 4.dp)
                                    .applyBrutalism(
                                        backgroundColor = Color(0xFF008080),
                                        borderWidth = 3.dp
                                    )
                                    .clickable {
                                        navController.navigate(
                                            route = Screen.Details.route.plus("/${recentRead.id}")
                                        )
                                    }
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.SpaceAround,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "Continue Reading",
                                        style = MaterialTheme.typography.subtitle1,
                                        color = Color.White
                                    )
                                    CircularProgressBar(
                                        percentage = 0.64f,
                                        radius = 12.dp,
                                        color = Color.White,
                                        strokeWidth = 3.dp,
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Text(
                modifier = Modifier.padding(start = 12.dp, top = 8.dp, end = 12.dp),
                text = "Recommended For You",
                style = MaterialTheme.typography.h6,
                color = if (isCustomTheme) Color.White else Color.Black
            )
            // Shuffle the list once when the composable is first composed
            val shuffledManagementBooks = remember { filteredManagementBooks.shuffled() }

                LazyRow(
                    contentPadding = PaddingValues(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    itemsIndexed(items = shuffledManagementBooks) { index, book ->
                        BookCard(book = book) {
                            navController.navigate(
                                route = Screen.Details.route.plus("/${book.id}")
                            )
                        }
                    }
            }

            Text(
                modifier = Modifier.padding(start = 12.dp, top = 8.dp, end = 12.dp),
                text = "Best Sellers",
                style = MaterialTheme.typography.h6,
                color = if (isCustomTheme) Color.White else Color.Black
            )
            // Shuffle the list once when the composable is first composed
            val shuffledBooks = remember { filteredScienceFictions.shuffled() }

            LazyRow(
                contentPadding = PaddingValues(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                itemsIndexed(items = shuffledBooks) { index, book ->
                    BookCard(book = book) {
                        navController.navigate(
                            route = Screen.Details.route.plus("/${book.id}")
                        )
                    }
                }
            }

        }

    }
}

@Composable
fun BrutalismSwitch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    // Custom colors for the Switch
    val thumbColor = if (checked) Color(0xFFFFA500) else Color.White // Orange when checked, white when unchecked
    val trackColor = if (checked) Color(0xFF008080).copy(alpha = 0.5f) else Color.Gray.copy(alpha = 0.5f) // Teal when checked, gray when unchecked

    // Apply the brutalism effect to the Switch
    Switch(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = Modifier
            .applyBrutalism(
                backgroundColor = Color.White, // Background color of the Switch container
                shadowColor = Color.Black, // Shadow color
                borderWidth = 3.dp, // Border width
                cornersRadius = 16.dp // Rounded corners for the Switch container
            ),
        colors = SwitchDefaults.colors(
            checkedThumbColor = thumbColor, // Custom thumb color when checked
            uncheckedThumbColor = thumbColor, // Custom thumb color when unchecked
            checkedTrackColor = trackColor, // Custom track color when checked
            uncheckedTrackColor = trackColor, // Custom track color when unchecked
            checkedTrackAlpha = 1f, // Opacity of the track when checked
            uncheckedTrackAlpha = 1f // Opacity of the track when unchecked
        )
    )
}

@Composable
fun CustomThumb(isChecked: Boolean) {
    Box(
        modifier = Modifier
            .size(24.dp) // Custom thumb size
            .background(
                color = if (isChecked) Color(0xFFFFA500) else Color.White,
                shape = RoundedCornerShape(12.dp) // Rounded thumb
            )
            .border(
                width = 2.dp,
                color = Color.Black,
                shape = RoundedCornerShape(12.dp)
            )
    )
}

@Composable
fun CustomBrutalismSwitch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    val thumbSize = 24.dp
    val trackWidth = 50.dp
    val trackHeight = 30.dp
    val padding = 4.dp

    // Thumb position (animated)
    val thumbOffset by animateDpAsState(
        targetValue = if (checked) trackWidth - thumbSize - padding else padding,
        animationSpec = tween(durationMillis = 200)
    )

    Box(
        modifier = Modifier
            .size(width = trackWidth, height = trackHeight)
            .applyBrutalism(
                backgroundColor = Color.White,
                shadowColor = Color.Black,
                borderWidth = 2.dp,
                cornersRadius = 16.dp
            )
            .clickable { onCheckedChange(!checked) }
    ) {
        // Track
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = if (checked) Color(0xFF008080) else Color.Gray,
                    shape = RoundedCornerShape(16.dp)
                )
        )

        // Thumb
        Box(
            modifier = Modifier
                .offset(x = thumbOffset, y = padding)
                .size(thumbSize)
                .background(
                    color = if (checked) Color(0xFFFFA500) else Color.White,
                    shape = CircleShape
                )
                .border(
                    width = 2.dp,
                    color = Color.Black,
                    shape = CircleShape
                )
        )
    }
}


@Composable
fun SearchBox(
    searchQuery: String,
    onSearchQueryChanged: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(horizontal = 12.dp)
            .applyBrutalism(
                backgroundColor = SunsetCoral,
                borderWidth = 3.dp,
                cornersRadius = 6.dp
            ),
        contentAlignment = Alignment.CenterStart,
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = { },
            ) {
                Icon(
                    modifier = Modifier
                        .size(36.dp)
                        .padding(start = 6.dp),
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search"
                )
            }

            Box() {
                BasicTextField(
                    value = searchQuery,
                    onValueChange = { newSearchQuery ->
                        onSearchQueryChanged(newSearchQuery)
                    },
                    maxLines = 1,
                    singleLine = true,
                    textStyle = TextStyle(
                        color = Color.Black,
                        fontFamily = GoshaSans,
                        fontSize = 18.sp
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            //keyboardController?.hide()
                        }
                    )
                )
                if (searchQuery.isEmpty()) {
                    Text(
                        text = "Search books...",
                        color = Color.Black.copy(alpha = 0.5f),
                        fontFamily = GoshaSans,
                        fontSize = 18.sp,
                        textAlign = TextAlign.Start
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPrev() {
    HomeScreen()
}
