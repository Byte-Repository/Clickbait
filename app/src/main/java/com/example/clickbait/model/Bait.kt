package com.example.clickbait.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Bait(
    @DrawableRes val image: Int,
    @StringRes val name: Int,
    @StringRes val description: Int,
    val time: String
)
