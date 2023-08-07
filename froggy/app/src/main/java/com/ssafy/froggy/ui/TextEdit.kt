package com.ssafy.froggy.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun loginForm() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var visiablePwd by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.padding(5.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TextEdit(
            text = email,
            onValueChange = { email = it },
            message = "이메일"
        )

        TextEdit(
            text = password,
            onValueChange = { password = it },
            message = "비밀번호",
            visualTransformation = if(visiablePwd) VisualTransformation.None else PasswordVisualTransformation(),
            icon = {
                IconButton(
                    onClick = { visiablePwd = !visiablePwd},
                    content = {
                        Icon(
                            painter = painterResource(id =
                                if(!visiablePwd)
                                    com.google.android.material.R.drawable.design_ic_visibility_off
                                else
                                    com.google.android.material.R.drawable.design_ic_visibility

                            ) ,
                            contentDescription = "비밀번호 블라인드 여부",
                            tint = Color.Gray
                        )
                    }
                )
            }
        )

        TextButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.primaryContainer
            ),
            onClick = { /*TODO*/ }
        ) {
            Text(text = "로그인")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TextEdit(
    text : String = "",
    onValueChange : (String) -> Unit = {},
    visualTransformation: VisualTransformation = VisualTransformation.None,
    message : String = "키워드를 입력해주세요.",
    icon : @Composable () -> Unit = {}
) {
    BasicTextField(
        value = text,
        onValueChange = onValueChange,
        visualTransformation = visualTransformation,
        singleLine = true,
        textStyle = TextStyle(
            color = Color.Black,
            fontSize = 14.sp,
            // fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
        ),
        modifier = Modifier
            .height(40.dp)
            .fillMaxWidth(),
        decorationBox = { innerTextField ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Color(0xffD9D9D9),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(horizontal = 16.dp), // inner padding
                verticalAlignment = Alignment.CenterVertically
            ) {
                //  Spacer(modifier = Modifier.width(width = 8.dp))
                Box(
                    modifier = Modifier
                        .padding(start = 10.dp) // margin left and right
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(horizontal = 10.dp), // inner padding
                    content = {
                        if (text.isEmpty()) {
                            Text(
                                text = message,
                                modifier = Modifier.fillMaxWidth(1f),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.LightGray
                            )
                        }
                        innerTextField()
                    }
                )
                icon()
            }
        }
    )
}