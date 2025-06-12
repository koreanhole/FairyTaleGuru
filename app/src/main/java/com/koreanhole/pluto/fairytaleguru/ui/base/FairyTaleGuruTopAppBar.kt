package com.koreanhole.pluto.fairytaleguru.ui.base

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.koreanhole.pluto.fairytaleguru.ui.theme.ForestDarkColorScheme
import com.koreanhole.pluto.fairytaleguru.ui.theme.ForestLightColorScheme
import com.koreanhole.pluto.fairytaleguru.ui.theme.LocalThemeStyle
import com.koreanhole.pluto.fairytaleguru.ui.theme.PeachDarkColorScheme
import com.koreanhole.pluto.fairytaleguru.ui.theme.PeachLightColorScheme
import com.koreanhole.pluto.fairytaleguru.ui.theme.SunnyDarkColorScheme
import com.koreanhole.pluto.fairytaleguru.ui.theme.SunnyLightColorScheme
import com.koreanhole.pluto.fairytaleguru.ui.theme.ThemeStyle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FairyTaleGuruTopAppBar(
    modifier: Modifier = Modifier,
    titleLabel: String? = null,
    onBackButtonClick: (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    // 현재 테마 스타일과 다크 모드 여부를 가져옵니다.
    val currentStyle = LocalThemeStyle.current
    val isDarkTheme = isSystemInDarkTheme()

    // 테마와 모드에 맞는 ColorScheme 객체를 직접 선택합니다.
    // (이 로직은 MyFairyTaleTheme에 있는 로직과 중복됩니다.)
    val colorScheme = when (currentStyle) {
        ThemeStyle.Sunny -> if (isDarkTheme) SunnyDarkColorScheme else SunnyLightColorScheme
        ThemeStyle.Forest -> if (isDarkTheme) ForestDarkColorScheme else ForestLightColorScheme
        ThemeStyle.Peach -> if (isDarkTheme) PeachDarkColorScheme else PeachLightColorScheme
    }

    // 위에서 선택한 colorScheme 객체를 사용하여 각 색상 속성을 결정합니다.
    val topAppBarColors = TopAppBarDefaults.topAppBarColors(
        containerColor = Color.Transparent,
        scrolledContainerColor = colorScheme.surfaceColorAtElevation(3.dp),
        titleContentColor = colorScheme.onSurface,
        navigationIconContentColor = colorScheme.onSurface,
        actionIconContentColor = colorScheme.onSurface
    )

    CenterAlignedTopAppBar(
        title = {
            if (titleLabel == null) Unit else Text(titleLabel)
        },
        modifier = modifier,
        navigationIcon = {
            if (onBackButtonClick == null) {
                Unit
            } else {
                IconButton(
                    onClick = onBackButtonClick,
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack, // AutoMirrored 아이콘 사용
                        contentDescription = "뒤로 가기"
                    )
                }
            }
        },
        actions = actions,
        colors = topAppBarColors, // 이 일관된 스타일을 적용
        scrollBehavior = scrollBehavior
    )
}