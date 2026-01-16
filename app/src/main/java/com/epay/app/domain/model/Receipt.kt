package com.epay.app.domain.model

import java.util.Date

data class Receipt(
    val id: String,
    val merchantName: String,
    val amount: Double,
    val date: Date,
    val category: String,
    val qrCodeData: String
)
