package com.koreanhole.pluto.fairytaleguru.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.koreanhole.pluto.fairytaleguru.FairyTaleGuruTopAppBar
import com.koreanhole.pluto.fairytaleguru.ui.navigation.NavigableScreen
import com.koreanhole.pluto.fairytaleguru.ui.navigation.LocalNavigationController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    val navigationController = LocalNavigationController.current

    // Scaffold를 사용하면 contentPadding을 통해 자동으로 안전 영역이 확보됩니다.
    Scaffold(
        topBar = {
            FairyTaleGuruTopAppBar(
                title = { Text("동화 앱") }, scrollBehavior = scrollBehavior
            )
        }) { innerPadding -> // Scaffold가 제공하는 contentPadding
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding) // 이 padding을 적용해야 시스템 바에 가려지지 않습니다.
                .padding(16.dp), // 화면 자체의 패딩 추가
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "동화 앱에 오신 것을 환영합니다!",
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = {
                    navigationController.navigate(NavigableScreen.CreateFairyTaleScreen)
                }) {
                Text("시작하기")
            }
        }
    }
}