package com.flounderguy.jellysnap.domain.bluetooth

data class BluetoothMessage(
    val message: String,
    val senderName: String,
    val isFromLocalUser: Boolean
)