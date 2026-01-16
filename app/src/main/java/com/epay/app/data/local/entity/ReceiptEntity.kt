package com.epay.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "receipts")
data class ReceiptEntity(
    @PrimaryKey val id: String,
    val merchantName: String,
    val amount: Double,
    val timestamp: Long,
    val category: String
)
