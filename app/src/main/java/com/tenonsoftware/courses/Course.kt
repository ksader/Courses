package com.tenonsoftware.courses

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class Course(
    @StringRes val nameResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @IntegerRes val numberResourceId: Int
)