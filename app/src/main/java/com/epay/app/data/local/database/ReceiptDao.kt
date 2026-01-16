package com.epay.app.data.local.database

import androidx.room.*
import com.epay.app.data.local.entity.ReceiptEntity

@Dao
interface ReceiptDao {
    @Query("SELECT * FROM receipts ORDER BY timestamp DESC")
    suspend fun getAllReceipts(): List<ReceiptEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertReceipt(receipt: ReceiptEntity)
}
