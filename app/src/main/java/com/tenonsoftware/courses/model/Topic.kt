package com.tenonsoftware.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val nameResourceId: Int,
    val topicId: Int,
    @DrawableRes val imageResourceId: Int
)
