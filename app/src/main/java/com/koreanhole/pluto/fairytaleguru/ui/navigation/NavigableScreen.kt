package com.koreanhole.pluto.fairytaleguru.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavigableScreen {
    @Serializable
    data object HomeScreen: NavigableScreen()

    @Serializable
    data object CreateFairyTaleScreen: NavigableScreen()

    @Serializable
    data object PlayFairyTaleScreen: NavigableScreen()
}