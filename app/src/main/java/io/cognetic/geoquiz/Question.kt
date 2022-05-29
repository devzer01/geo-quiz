package io.cognetic.geoquiz

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answers: Boolean)
