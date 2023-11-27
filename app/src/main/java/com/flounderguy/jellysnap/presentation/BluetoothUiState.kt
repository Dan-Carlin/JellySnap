package com.flounderguy.jellysnap.presentation

import com.flounderguy.jellysnap.domain.device_scan.BluetoothDevice
import com.flounderguy.jellysnap.domain.device_scan.BluetoothMessage

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMessage: String? = null,
    val messages: List<BluetoothMessage> = emptyList()
)