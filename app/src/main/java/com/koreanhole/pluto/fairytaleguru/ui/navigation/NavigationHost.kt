package com.koreanhole.pluto.fairytaleguru.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.koreanhole.pluto.fairytaleguru.ui.screens.CreateFairyTaleScreen
import com.koreanhole.pluto.fairytaleguru.ui.screens.HomeScreen
import com.koreanhole.pluto.fairytaleguru.ui.screens.PlayFairyTaleScreen

@Composable
fun NavigationHost() {
    val navController = LocalNavigationController.current

    NavHost(
        navController = navController,
        startDestination = NavigableScreen.HomeScreen
    ) {
        composable<NavigableScreen.HomeScreen> {
            HomeScreen()
        }
        composable<NavigableScreen.CreateFairyTaleScreen> {
            CreateFairyTaleScreen()
        }
        composable<NavigableScreen.PlayFairyTaleScreen> {
            PlayFairyTaleScreen()
        }
    }
}