package com.epay.app.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.epay.app.data.local.entity.ReceiptEntity
import com.epay.app.data.local.entity.UserEntity

@Database(entities = [UserEntity::class, ReceiptEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun receiptDao(): ReceiptDao
}
