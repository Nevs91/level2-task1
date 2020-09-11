package com.example.madlevel2task1.classes

import androidx.annotation.DrawableRes

data class Place(
    var name: String,
    @DrawableRes var imageResId: Int
)