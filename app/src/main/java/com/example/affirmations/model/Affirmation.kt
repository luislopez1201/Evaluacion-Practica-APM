package com.example.affirmations.model
import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringEmpresaId: Int,
    @DrawableRes val imageEmpresaId: Int,
    @IntegerRes val anioEmpresaId: Int
)
