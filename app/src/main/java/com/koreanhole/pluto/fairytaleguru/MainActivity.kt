package com.koreanhole.pluto.fairytaleguru

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import com.koreanhole.pluto.fairytaleguru.ui.theme.FairyTaleGuruTheme
import com.koreanhole.pluto.fairytaleguru.ui.theme.LocalThemeStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // 앱의 테마 상태를 관리 (예시)
            FairyTaleGuruTheme(
                themeStyle = LocalThemeStyle.current,
                darkTheme = isSystemInDarkTheme()
            ) {
                FairyTaleGuruApp()
            }
        }
    }
}
