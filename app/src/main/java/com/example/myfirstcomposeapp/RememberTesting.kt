package com.example.myfirstcomposeapp

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_NO
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.UUID
import kotlin.random.Random

//@Preview(
//    showBackground = true,
//    locale = "ru",
//    showSystemUi = true,
//    backgroundColor = 0xFFD0BCFF,
//    uiMode = UI_MODE_NIGHT_NO
//)
@Composable
fun TestRemember() {
    val context = LocalContext.current
    var counter by remember {
        mutableStateOf(0)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                modifier = Modifier
                    .width(60.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(Color.White)
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(24.dp)
                    ),
                textAlign = TextAlign.Center,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                text = counter.toString(),
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                ElevatedButton(
                    modifier = Modifier,
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 16.dp,
                    ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color.Black
                    ),
                    shape = RoundedCornerShape(12.dp),
                    contentPadding = PaddingValues(horizontal = 8.dp),
                    onClick = {
                        counter += 1
                        Toast.makeText(context, "${counter}", Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Icon(
                        modifier = Modifier
                            .size(48.dp),
                        painter = painterResource(R.drawable.ic_launcher_foreground),
                        contentDescription = null,
                        tint = Color.Gray
                    )
                    Text(
                        fontSize = 24.sp,
                        text = "+"
                    )
                }
                ElevatedButton(
                    modifier = Modifier,
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 10.dp,
                    ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color.Black
                    ),
                    shape = RoundedCornerShape(12.dp),
                    contentPadding = PaddingValues(horizontal = 8.dp),
                    onClick = {
                        counter = -1
                        Toast.makeText(context, "${counter}", Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Icon(
                        modifier = Modifier
                            .size(48.dp),
                        painter = painterResource(R.drawable.ic_launcher_foreground),
                        contentDescription = null,
                        tint = Color.Gray
                    )
                    Text(
                        fontSize = 24.sp,
                        text = "-"
                    )
                }
            }
        }
    }
}


@Composable
fun MyFirstListView(
    listItems: List<ContactItems> = emptyList()
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 36.dp, horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(
                items = listItems,
                key = {
                    it.id
                },
                contentType = {
                    it::class.java
                }
            ){ item ->
                ElevatedCard() {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(48.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color.Black)
                                .border(
                                    width = 1.dp,
                                    color = Color.Yellow,
                                    shape = RoundedCornerShape(16.dp)
                                ),
                            painter = painterResource(R.drawable.ic_launcher_foreground),
                            tint = Color.White,
                            contentDescription = null,
                        )
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .padding(horizontal = 12.dp)
                        ) {
                            Text(
                                text = item.name,
                                maxLines = 1
                            )
                            Text(
                                text = item.number,
                                maxLines = 1
                            )
                        }
                        Icon(
                            modifier = Modifier
                                .size(48.dp)
                                .padding(12.dp),
                            painter = painterResource(R.drawable.outline_auto_delete_24),
                            tint = Color.Black,
                            contentDescription = null,
                        )
                        Icon(
                            modifier = Modifier
                                .size(48.dp)
                                .padding(12.dp),
                            painter = painterResource(R.drawable.outline_background_dot_large_24),
                            tint = Color.Black,
                            contentDescription = null,
                        )

                    }
                }
            }
        }
    }
}

data class ContactItems(
    val id: Long,
    val number: String,
    val name: String
)

@Preview(
    showBackground = true,
    locale = "ru",
    showSystemUi = true,
    backgroundColor = 0xFFD0BCFF,
    uiMode = UI_MODE_NIGHT_NO
)
@Composable
fun ListViewPreview() {
    val contacts by remember {
        mutableStateOf(
            buildList {
                repeat(40) {
                    add(
                        ContactItems(
                            id = it.toLong(),
                            number = "+994 ${Random.nextInt()}",
                            name = UUID.randomUUID().toString()
                        )
                    )
                }
            }
        )
    }
    MyFirstListView(
        contacts
    )
}