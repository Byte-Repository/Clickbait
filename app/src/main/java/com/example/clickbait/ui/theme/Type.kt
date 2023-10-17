package com.example.clickbait.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.clickbait.R

val Custard = FontFamily(
    Font(R.font.coustard_regular),
    Font(R.font.coustard_bold, FontWeight.Bold)
)

val Sunbathing = FontFamily(
    Font(R.font.gowunbatang_regular),
    Font(R.font.gowunbatang_bold, FontWeight.Bold)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Custard,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Sunbathing,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    labelLarge = TextStyle(  // Requirement 2
        fontFamily = Custard,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp
    ),
    bodyMedium = TextStyle(  // Requirement 3
        fontFamily = Sunbathing,
        fontSize = 16.sp
    ),
    labelMedium = TextStyle(  // Requirement 5
        fontFamily = Sunbathing,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp
    )
)