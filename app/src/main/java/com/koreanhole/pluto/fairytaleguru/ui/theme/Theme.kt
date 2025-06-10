package com.koreanhole.pluto.fairytaleguru.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf


enum class ThemeStyle {
    Sunny, Forest, Peach
}

val LocalThemeStyle = staticCompositionLocalOf { ThemeStyle.Peach }

@Composable
fun FairyTaleGuruTheme(
    themeStyle: ThemeStyle = ThemeStyle.Sunny, // 기본 테마 설정
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when (themeStyle) {
        ThemeStyle.Sunny -> if (darkTheme) SunnyDarkColorScheme else SunnyLightColorScheme
        ThemeStyle.Forest -> if (darkTheme) ForestDarkColorScheme else ForestLightColorScheme
        ThemeStyle.Peach -> if (darkTheme) PeachDarkColorScheme else PeachLightColorScheme
    }
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography, // Typography 정의가 있다면 추가
        content = content
    )
}