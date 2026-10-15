package com.example.myfirstcomposeapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

data class MyColorSchema(
    val primary: Color,
    val secondary: Color,
    val primaryText: Color,
    val secondaryText: Color
)

private val lightColorSchema = MyColorSchema(
    primary = Color(0xFF8D6C6C),
    secondary = Color(0xFFA62F2F),
    primaryText = Color(0xFF000000),
    secondaryText = Color(0xFF4F4A4A)
)

private val darkColorSchema = MyColorSchema(
    primary = Color(0xFF381C1C),
    secondary = Color(0xFF831B1B),
    primaryText = Color(0xFFFFFFFF),
    secondaryText = Color(0xFF5E5B5B)
)


val LocalAppColors = staticCompositionLocalOf<MyColorSchema> {
    error("AppColors not provided. Wrap your UI in AppTheme { }")
}

val textStyles = AppTextStyles(
    h1 = TextStyle(
        fontFamily = BitCountFont,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 36.sp
    ),
    body =
        TextStyle(fontFamily = BitCountFont, fontSize = 15.sp, lineHeight = 22.sp),
    caption = TextStyle(fontFamily = BitCountFont, fontSize = 12.sp, lineHeight = 16.sp),
    amount = TextStyle(
        fontFamily = BitCountFont,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp
    ),
)

@Composable
fun MyFirstComposeAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) darkColorSchema else lightColorSchema

    val materialScheme = if (darkTheme) {
        darkColorScheme(
            primary = colors.primary,
            secondary = colors.secondary,
            background = Color(0xFF000000),
            surface = Color(0xFF232323),
        )
    } else {
        lightColorScheme(
            primary = colors.primary,
            secondary = colors.secondary,
            background = Color(0xFFFFFFFF),
            surface = Color(0xFFBDBDBD),
        )
    }

    CompositionLocalProvider(
        LocalAppColors provides colors,
        LocalAppTextStyles provides textStyles
    ) {
        MaterialTheme(colorScheme = materialScheme, typography = AppTypography, content = content)
    }

}

object AppTheme {
    val colors: MyColorSchema
        @Composable @ReadOnlyComposable
        get() = LocalAppColors.current
}