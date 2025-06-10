package com.koreanhole.pluto.fairytaleguru.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color



// 팔레트 1: 햇살 가득한 오후
private val sunny_yellow_primary = Color(0xFF_FFD97D)
private val sunny_orange_secondary = Color(0xFF_FFB380)
private val sunny_brown_text = Color(0xFF_8B6F55)
private val sunny_cream_background = Color(0xFF_FFF8F0)
// 다크 모드를 위한 색상
private val sunny_dark_background = Color(0xFF_2C2821)
private val sunny_dark_primary = Color(0xFF_FFCB6B) // 다크모드에서 더 잘보이게 살짝 밝게

// 팔레트 2: 아늑한 숲속 오두막
private val forest_orange_primary = Color(0xFF_E58A59)
private val forest_green_secondary = Color(0xFF_8A9A5B)
private val forest_dark_brown_text = Color(0xFF_5C5249)
private val forest_beige_background = Color(0xFF_F5E8D7)
// 다크 모드를 위한 색상
private val forest_dark_background = Color(0xFF_211F1D)
private val forest_dark_primary = Color(0xFF_F2A47C)

// 팔레트 3: 달콤한 복숭아 과수원
private val peach_coral_primary = Color(0xFF_FFC09F)
private val peach_yellow_secondary = Color(0xFF_FDFD96)
private val peach_warm_gray_text = Color(0xFF_A99985)
private val peach_warm_white_background = Color(0xFF_FEF9F3)
// 다크 모드를 위한 색상
private val peach_dark_background = Color(0xFF_2A2624)
private val peach_dark_primary = Color(0xFF_FFDCC9)

// 공통 에러 색상
private val warm_error = Color(0xFF_D9534F)


// --- 1. 햇살 가득한 오후 테마 ---
val SunnyLightColorScheme = lightColorScheme( // private 제거
    primary = sunny_yellow_primary,
    onPrimary = sunny_brown_text, // Primary 색상 위에 오는 콘텐츠 색상
    secondary = sunny_orange_secondary,
    onSecondary = sunny_brown_text,
    background = sunny_cream_background,
    onBackground = sunny_brown_text,
    surface = sunny_cream_background, // Card, Sheet 등의 표면 색상
    onSurface = sunny_brown_text,
    error = warm_error,
    onError = sunny_cream_background
)

val SunnyDarkColorScheme = darkColorScheme( // private 제거
    primary = sunny_dark_primary, // 다크모드에서는 Primary가 더 밝아야 잘 보임
    onPrimary = sunny_dark_background,
    secondary = sunny_orange_secondary,
    onSecondary = sunny_dark_background,
    background = sunny_dark_background,
    onBackground = sunny_cream_background, // 어두운 배경 위에 밝은 텍스트
    surface = sunny_dark_background,
    onSurface = sunny_cream_background,
    error = warm_error,
    onError = sunny_dark_background
)

// --- 2. 아늑한 숲속 오두막 테마 ---
val ForestLightColorScheme = lightColorScheme( // private 제거
    primary = forest_orange_primary,
    onPrimary = forest_beige_background,
    secondary = forest_green_secondary,
    onSecondary = forest_beige_background,
    background = forest_beige_background,
    onBackground = forest_dark_brown_text,
    surface = forest_beige_background,
    onSurface = forest_dark_brown_text,
    error = warm_error,
    onError = forest_beige_background
)

val ForestDarkColorScheme = darkColorScheme( // private 제거
    primary = forest_dark_primary,
    onPrimary = forest_dark_brown_text,
    secondary = forest_green_secondary,
    onSecondary = forest_dark_brown_text,
    background = forest_dark_background,
    onBackground = forest_beige_background,
    surface = forest_dark_background,
    onSurface = forest_beige_background,
    error = warm_error,
    onError = forest_dark_background
)

// --- 3. 달콤한 복숭아 과수원 테마 ---
val PeachLightColorScheme = lightColorScheme( // private 제거
    primary = peach_coral_primary,
    onPrimary = forest_dark_brown_text, // 대비가 좋은 어두운 갈색 사용
    secondary = peach_yellow_secondary,
    onSecondary = peach_warm_gray_text,
    background = peach_warm_white_background,
    onBackground = peach_warm_gray_text,
    surface = peach_warm_white_background,
    onSurface = peach_warm_gray_text,
    error = warm_error,
    onError = peach_warm_white_background
)

val PeachDarkColorScheme = darkColorScheme( // private 제거
    primary = peach_dark_primary,
    onPrimary = peach_dark_background,
    secondary = peach_yellow_secondary,
    onSecondary = peach_dark_background,
    background = peach_dark_background,
    onBackground = peach_warm_white_background,
    surface = peach_dark_background,
    onSurface = peach_warm_white_background,
    error = warm_error,
    onError = peach_dark_background
)