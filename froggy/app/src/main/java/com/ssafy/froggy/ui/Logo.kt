package com.ssafy.froggy.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.ssafy.froggy.R

@Preview
@Composable
@ExperimentalMaterial3Api
fun logo() {
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Froggy로고",
        alignment = Alignment.Center,
        modifier = Modifier.wrapContentSize()
    )
}
