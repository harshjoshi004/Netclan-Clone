package com.example.netclan.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.netclan.R
import androidx.compose.ui.text.font.Font

val fbFontFamily = FontFamily(
    Font(R.font.fbsansbold, FontWeight.Bold), //heading
    Font(R.font.fbsansregular, FontWeight.Normal), //body
    Font(R.font.fbsanslight, FontWeight.Light), //label
    Font(R.font.fbsansnarrowapp, FontWeight.Thin), //narrow
)

// Set of Material typography styles to start with
val Typography = Typography(
    //body
    bodyLarge = TextStyle(
        fontFamily = fbFontFamily,//FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    //heading
    titleLarge = TextStyle(
        fontFamily = fbFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    //label
    labelSmall = TextStyle(
        fontFamily = fbFontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = fbFontFamily,
        fontWeight = FontWeight.Thin,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)