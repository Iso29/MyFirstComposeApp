package com.example.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_NO
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {

            }
        }

    }
}

//@Preview(
//    showBackground = true,
//    locale = "ru",
//    showSystemUi = true,
//    backgroundColor = 0xFFD0BCFF,
//    uiMode = UI_MODE_NIGHT_YES
//)
//@Preview(
//    showBackground = true,
//    locale = "ru",
//    showSystemUi = true,
//    backgroundColor = 0xFFD0BCFF,
//    uiMode = UI_MODE_NIGHT_NO
//)
@Composable
fun Layouts() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
    ) {
        Text(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Start,
            maxLines = 1,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(start = 24.dp)
                .clip(
                    shape = RoundedCornerShape(24.dp)
                )
                .background(
                    color = Color.Cyan,
                )
                .padding(vertical = 12.dp)
                .align(Alignment.TopStart),
            text = "Hello Worldadad qecihwc jqcbje qwccqbccjbqjewcql!"
        )
        Text(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Start,
            maxLines = 1,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(start = 24.dp)
                .clip(
                    shape = RoundedCornerShape(24.dp)
                )
                .background(
                    color = Color.Cyan,
                )
                .padding(vertical = 12.dp)
                .align(Alignment.CenterStart),
            text = "Hello Worldadad qecihwc jqcbje qwccqbccjbqjewcql!"
        )
        Text(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Start,
            maxLines = 1,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(start = 24.dp)
                .clip(
                    shape = RoundedCornerShape(24.dp)
                )
                .background(
                    color = Color.Cyan,
                )
                .padding(vertical = 12.dp)
                .align(Alignment.BottomStart),
            text = "Hello Worldadad qecihwc jqcbje qwccqbccjbqjewcql!"
        )
    }
}

@Preview(
    showBackground = true,
    locale = "ru",
    showSystemUi = true,
    backgroundColor = 0xFFD0BCFF,
    uiMode = UI_MODE_NIGHT_YES
)
@Preview(
    showBackground = true,
    locale = "ru",
    showSystemUi = true,
    backgroundColor = 0xFFD0BCFF,
    uiMode = UI_MODE_NIGHT_NO
)
@Composable
fun LinearLayout() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        repeat(30){
            Text(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Start,
                maxLines = 1,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(start = 24.dp)
                    .clip(
                        shape = RoundedCornerShape(24.dp)
                    )
                    .background(
                        color = Color.Cyan,
                    )
                    .padding(vertical = 12.dp),
                text = "Hello Worldadad qecihwc jqcbje qwccqbccjbqjewcql!"
            )
            Text(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Start,
                maxLines = 1,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(start = 24.dp)
                    .clip(
                        shape = RoundedCornerShape(24.dp)
                    )
                    .background(
                        color = Color.Cyan,
                    )
                    .padding(vertical = 12.dp),
                text = "Hello Worldadad qecihwc jqcbje qwccqbccjbqjewcql!"
            )
            Text(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Start,
                maxLines = 1,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(start = 24.dp)
                    .clip(
                        shape = RoundedCornerShape(24.dp)
                    )
                    .background(
                        color = Color.Cyan,
                    )
                    .padding(vertical = 12.dp),
                text = "Hello Worldadad qecihwc jqcbje qwccqbccjbqjewcql!"
            )
        }
    }
}

//@Preview(
//    showBackground = true,
//    locale = "ru",
//    showSystemUi = true,
//    backgroundColor = 0xFFD0BCFF,
//    uiMode = UI_MODE_NIGHT_YES
//)
//@Preview(
//    showBackground = true,
//    locale = "ru",
//    showSystemUi = true,
//    backgroundColor = 0xFFD0BCFF,
//    uiMode = UI_MODE_NIGHT_NO
//)
@Composable
fun RowLayout() {
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
    ) {
        Row(
            modifier = Modifier
                .background(Color.Gray)
                .horizontalScroll(state = scrollState)
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            repeat(12){
                Text(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Start,
                    maxLines = 1,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 24.dp)
                        .clip(
                            shape = RoundedCornerShape(24.dp)
                        )
                        .background(
                            color = Color.Cyan,
                        )
                        .padding(vertical = 12.dp),
                    text = "Hello"
                )
            }
        }
    }

}