package com.epay.app.domain.usecase

import com.epay.app.domain.repository.UserRepository
import java.util.Calendar
import java.util.Date

class SubscribeUseCase(private val userRepository: UserRepository) {
    suspend fun execute(userId: String, plan: String): Result<Boolean> {
        return try {
            // Logique : On ajoute 30 jours à la date actuelle
            val calendar = Calendar.getInstance()
            calendar.add(Calendar.DAY_OF_MONTH, 30)
            val expiryDate = calendar.time
            
            // Mise à jour via le repository (à implémenter dans le repo)
            Result.success(true)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
