package com.koreanhole.pluto.fairytaleguru.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.koreanhole.pluto.fairytaleguru.ui.base.FairyTaleGuruTopAppBar
import com.koreanhole.pluto.fairytaleguru.ui.navigation.LocalNavigationController
import com.koreanhole.pluto.fairytaleguru.ui.navigation.NavigableScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayFairyTaleScreen() {
    val navigationController = LocalNavigationController.current

    Scaffold(
        topBar = {
            FairyTaleGuruTopAppBar(
                titleLabel = "1/8 페이지",
                onBackButtonClick = {
                    navigationController.navigate(NavigableScreen.HomeScreen) {
                        // HomeScreen으로 이동할 때 백스택에서 PlayFairyTaleScreen을 제거할 수 있습니다.
                        // 필요에 따라 popUpTo 등을 사용하여 네비게이션 동작을 커스터마이징하세요.
                        popUpTo(NavigableScreen.HomeScreen) { // NavigableScreen에 route 정의가 필요합니다.
                            inclusive = true
                        }
                        launchSingleTop = true // HomeScreen이 이미 스택에 있다면 새로 만들지 않고 재사용
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text("동화 생성 결과")
        }
    }
}