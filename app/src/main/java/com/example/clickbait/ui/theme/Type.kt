package com.example.clickbait.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.clickbait.R

val Coustard = FontFamily(
    Font(R.font.coustard_regular),
    Font(R.font.coustard_bold, FontWeight.Bold)
)

val GowanBatang = FontFamily(
    Font(R.font.gowunbatang_regular),
    Font(R.font.gowunbatang_bold, FontWeight.Bold)
)

val Typography = Typography(
    labelMedium = TextStyle(
        fontFamily = GowanBatang,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelLarge = TextStyle(
        fontFamily = Coustard,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = GowanBatang,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)