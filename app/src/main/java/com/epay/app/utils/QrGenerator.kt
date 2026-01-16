package com.epay.app.utils

import com.epay.app.domain.model.Receipt

object QrGenerator {
    fun generateStringFromReceipt(receipt: Receipt): String {
        // Crée une chaîne formatée pour le QR Code
        return "EPAY;${receipt.merchantName};${receipt.amount};${receipt.id}"
    }
}
