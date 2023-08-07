package com.ssafy.froggy.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ssafy.froggy.R

@Preview(showBackground = true)
@Composable
fun OAuthBtn() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            verticalAlignment = CenterVertically
        ) {
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                thickness = 1.dp,
                color = Color.Gray
            )
            Text(
                modifier = Modifier
                    .wrapContentWidth()
                    .weight(1f),
                text = "sns 로그인",
                color = Color.Gray,
                style = TextStyle(
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center
                )
            )
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                thickness = 1.dp,
                color = Color.Gray
            )
        }

        Row(
            modifier = Modifier
                .wrapContentWidth()
                .align(alignment = CenterHorizontally),
            verticalAlignment = CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            OAuthIcon(
                size = 50.dp,
                painter = painterResource(id = R.drawable.kakao_icon),
                description = "카카오 로그인"
            )
            OAuthIcon(
                size = 50.dp,
                painter = painterResource(id = R.drawable.google_icon),
                description = "카카오 로그인"
            )
            OAuthIcon(
                size = 50.dp,
                painter = painterResource(id = R.drawable.naver_icon),
                description = "카카오 로그인"
            )
            OAuthIcon(
                size = 50.dp,
                painter = painterResource(id = R.drawable.ravelry_icon),
                description = "카카오 로그인"
            )
        }
    }
}


@Composable
fun OAuthIcon(
    size : Dp,
    painter : Painter,
    description : String,
    onClick : () -> Unit = {}
) {
    Box(
        modifier = Modifier
            .size(size)
            .clip(CircleShape)
            .clickable(onClick = onClick),
        contentAlignment = Center
    ) {
        Image(
            painter = painter,
            modifier = Modifier.fillMaxSize(),
            alignment = Center,
            contentDescription = description
        )
    }
}