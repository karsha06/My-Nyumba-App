package com.karsha.mynyumbaapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Place(
    @DrawableRes val image: Int,
    @StringRes val name : Int
)