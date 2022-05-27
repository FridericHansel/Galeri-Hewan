package org.d3if1012.galerihewan.model

import org.d3if1012.galerihewan.R

data class Hewan(
    val nama: String,
    val namaLatin: String ,
    val jenis: String,
    val imageResId: Int = R.drawable.angsa
)
