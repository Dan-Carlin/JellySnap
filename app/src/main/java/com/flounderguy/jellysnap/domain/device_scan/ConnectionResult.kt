package com.flounderguy.jellysnap.domain.device_scan

sealed interface ConnectionResult {
    object ConnectionEstablished: ConnectionResult
    data class Error(val message: String): ConnectionResult
}
