package com.epay.app.utils

import java.text.SimpleDateFormat
import java.util.*

object DateUtils {
    private val formatter = SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault())

    fun formatDisplayDate(date: Date): String {
        return formatter.format(date)
    }
}
