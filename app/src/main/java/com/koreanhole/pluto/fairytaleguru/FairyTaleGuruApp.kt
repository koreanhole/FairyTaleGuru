package com.koreanhole.pluto.fairytaleguru


import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.compose.rememberNavController
import com.koreanhole.pluto.fairytaleguru.ui.navigation.LocalNavigationController
import com.koreanhole.pluto.fairytaleguru.ui.navigation.NavigationHost

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FairyTaleGuruApp() {
    val navigationController = rememberNavController()
    CompositionLocalProvider(LocalNavigationController provides navigationController) {
        NavigationHost()
    }
}