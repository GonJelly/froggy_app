package com.ssafy.froggy.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Forum
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ssafy.froggy.R

@Preview(showBackground = true)
@Composable
@ExperimentalMaterial3Api
fun Article() {

    Column(
        modifier = Modifier
            .width(400.dp)
            .padding(horizontal = 10.dp, vertical = 5.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "개구리master",
            fontSize = 10.sp,
            color = Color(0xFF949494)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(25.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            TextButton(
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.primaryContainer,
                    disabledContainerColor = MaterialTheme.colorScheme.primary,
                    disabledContentColor = MaterialTheme.colorScheme.primaryContainer
                ),
                contentPadding = PaddingValues(horizontal = 10.dp, vertical = 0.dp),
                enabled = false,
                onClick = { /*TODO*/ },
                content = {
                    Text(
                        modifier = Modifier.wrapContentSize(),
                        text = "자유",
                        fontSize = 11.sp,
                        textAlign = TextAlign.Center
                    )
                }
            )
            Text(
                text = "뜨개질 하는 법. 내공 100",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold

            )
        }

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "뜨개질 잘하는법..? 냠냠냠",
            fontSize = 10.sp,
            color = Color(0xFF949494)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ) {

                ArticleIcon(
                    icon = Icons.Default.FavoriteBorder,
                    value = "10"
                )

                ArticleIcon(
                    icon = Icons.Default.Forum,
                    value = "15"
                )

            }

            Text(
                text = "2023.08.23",
                modifier = Modifier
                    .wrapContentSize()
                    .padding(horizontal = 5.dp),
                fontSize = 12.sp,
                color = Color(0xFF949494),
                textAlign = TextAlign.Center
            )

        }

        Divider(

        )

    }
}

@Preview(showBackground = true)
@Composable
fun ArticleIcon(
    icon : ImageVector = Icons.Default.Favorite,
    value : String = "0"
) {
    Row(
        modifier = Modifier.padding(start = 0.dp, end = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Icon(
            modifier = Modifier.size(15.dp),
            imageVector = icon,
            contentDescription = ""
        )
        Text(
            text = value,
            modifier = Modifier.wrapContentSize(),
            fontSize = 10.sp,
            color = Color(0xFF949494),
            textAlign = TextAlign.Center
        )
    }
}