package com.namratha.campuseventexplorer.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val LightColors = lightColorScheme(
    primary = Blue,
    onPrimary = Color.White,
    primaryContainer = LightBlue,
    onPrimaryContainer = Color.Black,

    secondary = DarkBlue,
    onSecondary = Color.White,
    secondaryContainer = LavenderBlue,

    background = BlueBackground,
    onBackground = BlueText,
    surface = LightSurface,
    onSurface = BlueText,
    surfaceVariant = LavenderBlue,
    onSurfaceVariant = MutedBlue
)

private val DarkColors = darkColorScheme(
    primary = Green,
    onPrimary = DeepGreen,
    primaryContainer = DarkGreen,
    onPrimaryContainer = LightGreen,

    secondary = MintGreen,
    onSecondary = DarkMintGreen,
    secondaryContainer = GreenSurface,

    background = BlackBackground,
    onBackground = LightText,
    surface = DarkSurface,
    onSurface = LightText,
    surfaceVariant = GreenSurface,
    onSurfaceVariant = MutedGreen
)



@Composable
fun CampusEventExplorerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content
    )
}
