package com.hadi.archives.ui.theme

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.hadi.archives.utils.ThemePreferences
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

private val DefaultColors = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = Color.White,
    onPrimary = Color.Black,
    onBackground = Color.Black
)

private val CustomColors = darkColors(
    primary = BrutalYellow,
    primaryVariant = BrutalBlue,
    secondary = BrutalPink,
    background = Color.Black,
    onPrimary = Color.Black,
    onBackground = Color.White
)

@Composable
fun ArchivesTheme(
    context: Context,
    content: @Composable () -> Unit
) {
    val coroutineScope = rememberCoroutineScope()
    var isCustomTheme by remember { mutableStateOf(false) }

    // Get stored theme state
    LaunchedEffect(Unit) {
        ThemePreferences.getThemeState(context).collectLatest {
            isCustomTheme = it
        }
    }

    val colors = if (isCustomTheme) CustomColors else DefaultColors

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes
    ) {
        Box(modifier = Modifier.background(colors.background)) {
            content()
        }
    }
}
