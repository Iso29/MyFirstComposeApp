package com.example.myfirstcomposeapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myfirstcomposeapp.R

val BitCountFont = FontFamily(
    Font(R.font.bitcountink_variable_font, FontWeight.Normal),
    Font(R.font.bitcountink_variable_font, FontWeight.Medium),
    Font(R.font.bitcountink_variable_font, FontWeight.SemiBold),
    Font(R.font.bitcountink_variable_font, FontWeight.Bold),
)

@Immutable
data class AppTextStyles(
    val h1: TextStyle,
    val body: TextStyle,
    val caption: TextStyle,
    val amount: TextStyle,
)

val LocalAppTextStyles = staticCompositionLocalOf<AppTextStyles> {
    error("AppTextStyles not provided")
}

val AppTypography = Typography(
    headlineLarge = TextStyle(
        fontFamily = BitCountFont,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 40.sp
    ),
    titleMedium = TextStyle(
        fontFamily = BitCountFont,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = BitCountFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = BitCountFont,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
    ),
)