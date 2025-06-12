package com.koreanhole.pluto.fairytaleguru.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.koreanhole.pluto.fairytaleguru.ui.navigation.LocalNavigationController
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.text.font.FontWeight
import androidx.lifecycle.viewmodel.compose.viewModel
import com.koreanhole.pluto.fairytaleguru.ui.navigation.NavigableScreen
import com.koreanhole.pluto.fairytaleguru.viewmodel.CreateFairyTaleViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateFairyTaleScreen(
    viewModel: CreateFairyTaleViewModel = viewModel()
) {
    val navigationController = LocalNavigationController.current

    LaunchedEffect(Unit) {
        viewModel.createFairyTale(
            onFinished = {
                navigationController.navigate(NavigableScreen.PlayFairyTaleScreen)
            }
        )
    }

    Scaffold { innerPadding -> // Scaffold가 제공하는 contentPadding
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding), // 이 padding을 적용해야 시스템 바에 가려지지 않습니다.
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "동화 생성 중",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground,
                fontWeight = FontWeight.Bold,
            )
            Spacer(modifier = Modifier.height(32.dp))
            CircularProgressIndicator(
                modifier = Modifier
                    .size(56.dp), //CircularProgressIndicator 주변에 약간의 여백을 줍니다.
                color = MaterialTheme.colorScheme.primary, //선택적으로 색상을 지정할 수 있습니다.
                strokeWidth = 6.dp
            )
        }
    }
}