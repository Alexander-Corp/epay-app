package com.epay.app.domain.model

import java.util.Date

data class Subscription(
    val userId: String,
    val planType: String, // ex: "FREE", "PREMIUM"
    val expiryDate: Date,
    val isActive: Boolean
)
