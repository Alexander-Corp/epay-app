package com.epay.app.data.repository

import com.epay.app.domain.repository.UserRepository
import com.epay.app.data.local.database.UserDao

class UserRepositoryImpl(private val userDao: UserDao) : UserRepository {
    // Implémentation des méthodes de UserRepository
}
