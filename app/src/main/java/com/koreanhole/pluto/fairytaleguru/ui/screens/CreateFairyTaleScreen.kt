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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.koreanhole.pluto.fairytaleguru.FairyTaleGuruTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateFairyTaleScreen() {
    Scaffold(
        topBar = {
            FairyTaleGuruTopAppBar(
                title = { Text("동화 앱") },
            )
        }
    ) { innerPadding -> // Scaffold가 제공하는 contentPadding
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding) // 이 padding을 적용해야 시스템 바에 가려지지 않습니다.
                .padding(16.dp), // 화면 자체의 패딩 추가
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "다음 페이지",
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = { /*TODO*/ }) {
                Text("시작하기")
            }
        }
    }
}