package com.example.netclan.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val NetclanDarkBlue = Color(0xFF0A2E42)
val NetclanLightBlue = Color(0xFF143E59)
val NetclanGolden = Color(0xFFFCAB3D)
val NetlcanGrey = Color(0xFFB1B8BE)

val CoffeeColor = Color(0xFF473F00)
val CoffeeColorDark = Color(0xFFD6BE01)

val BusinessColor = Color(0xFF580000)
val BusinessColorDark = Color(0xFFF30101)

val FriendshipColor = Color(0xFF006B04)
val FriendshipColorDark = Color(0xFF03FC0D)

val verticalGradientBrush = Brush.verticalGradient(
    colorStops = arrayOf(
        0.0f to NetclanGolden,
        0.8f to NetclanLightBlue,
        1.0f to NetclanDarkBlue
    )
)

val verticalGradientBrushDark = Brush.verticalGradient(
    colorStops = arrayOf(
        0.0f to NetclanGolden,
        1.0f to Color(0x00212121)
    )
)

val horizontalGradientBrush = Brush.horizontalGradient(
    colorStops = arrayOf(
        0.0f to NetclanLightBlue,
        1.0f to NetclanGolden
    )
)

val horizontalGradientBrush2 = Brush.horizontalGradient(
    colorStops = arrayOf(
        0.0f to NetlcanGrey,
        1.0f to NetclanLightBlue
    )
)

val horizontalGradientBrush3 = Brush.horizontalGradient(
    colorStops = arrayOf(
        0.0f to NetclanDarkBlue,
        0.4f to NetclanLightBlue,
        1.0f to NetclanGolden
    )
)
