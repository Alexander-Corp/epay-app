package com.epay.app.ui.receipt

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.epay.app.domain.usecase.CreateReceiptUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ReceiptViewModel(private val createReceiptUseCase: CreateReceiptUseCase) : ViewModel() {

    // État de l'interface (Loading, Success, Error)
    private val _uiState = MutableStateFlow<String>("Attente d'entrée")
    val uiState: StateFlow<String> = _uiState

    fun createNewReceipt(merchant: String, amount: Double, category: String) {
        _uiState.value = "Création en cours..."
        
        viewModelScope.launch {
            val result = createReceiptUseCase(merchant, amount, category)
            
            result.onSuccess { receipt ->
                _uiState.value = "Reçu créé avec succès ! ID: ${receipt.id}"
            }.onFailure { error ->
                _uiState.value = "Erreur : ${error.message}"
            }
        }
    }
}
