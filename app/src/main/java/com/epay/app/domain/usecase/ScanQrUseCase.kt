package com.epay.app.domain.usecase

class ScanQrUseCase {
    fun execute(qrData: String): Result<Pair<String, Double>> {
        return try {
            // Format attendu: EPAY;ID_COMMERÇANT;MONTANT
            if (!qrData.startsWith("EPAY")) {
                return Result.failure(Exception("QR Code non valide"))
            }
            
            val parts = qrData.split(";")
            val merchantId = parts[1]
            val amount = parts[2].toDouble()
            
            Result.success(Pair(merchantId, amount))
        } catch (e: Exception) {
            Result.failure(Exception("Erreur de lecture du QR Code"))
        }
    }
}
