package com.flounderguy.jellysnap.domain.device_scan

data class BluetoothMessage(
    val message: String,
    val senderName: String,
    val isFromLocalUser: Boolean
)