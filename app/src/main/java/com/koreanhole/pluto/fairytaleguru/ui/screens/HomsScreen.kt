package com.koreanhole.pluto.fairytaleguru.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.koreanhole.pluto.fairytaleguru.ui.navigation.NavigableScreen
import com.koreanhole.pluto.fairytaleguru.ui.navigation.LocalNavigationController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val navigationController = LocalNavigationController.current

    // Scaffold를 사용하면 contentPadding을 통해 자동으로 안전 영역이 확보됩니다.
    Scaffold { innerPadding -> // Scaffold가 제공하는 contentPadding
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding), // 이 padding을 적용해야 시스템 바에 가려지지 않습니다.
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "동화를 생성해보세요.",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(32.dp))
            IconButton(
                onClick = {
                    navigationController.navigate(NavigableScreen.CreateFairyTaleScreen)
                },
                modifier = Modifier
                    .size(56.dp) // 버튼 크기 지정
                    .background(
                        color = MaterialTheme.colorScheme.primary, // 배경색 지정
                        shape = CircleShape // 원형 모양 지정
                    )
                    .clip(CircleShape) // 아이콘 버튼 영역을 원형으로 클리핑 (Ripple 효과 등을 위해)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "동화 생성하기",
                    tint = MaterialTheme.colorScheme.onPrimary // 아이콘 색상 지정 (배경색과 대비되도록)
                )
            }
        }
    }
}