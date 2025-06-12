package com.koreanhole.pluto.fairytaleguru.ui.navigation

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController

val LocalNavigationController = staticCompositionLocalOf<NavHostController> {
    error("NavController가 제공되지 않았습니다. CompositionLocalProvider를 확인하세요.")
}