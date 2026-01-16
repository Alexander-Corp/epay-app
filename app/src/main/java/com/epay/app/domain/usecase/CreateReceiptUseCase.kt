package com.epay.app.domain.usecase

import com.epay.app.domain.repository.ReceiptRepository
import com.epay.app.domain.model.Receipt
import java.util.UUID
import java.util.Date

class CreateReceiptUseCase(private val repository: ReceiptRepository) {

    suspend operator fun invoke(merchantName: String, amount: Double, category: String): Result<Receipt> {
        // 1. Validation de sécurité
        if (amount <= 0) {
            return Result.failure(Exception("Le montant doit être supérieur à zéro"))
        }

        if (merchantName.isBlank()) {
            return Result.failure(Exception("Le nom du commerçant est obligatoire"))
        }

        // 2. Création de l'objet métier avec un ID unique (UUID)
        val newReceipt = Receipt(
            id = UUID.randomUUID().toString(),
            merchantName = merchantName,
            amount = amount,
            date = Date(),
            category = category,
            qrCodeData = "EPAY-${UUID.randomUUID()}"
        )

        // 3. Sauvegarde via le repository
        return try {
            repository.insertReceipt(newReceipt)
            Result.success(newReceipt)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
