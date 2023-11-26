package com.flounderguy.jellysnap.presentation

import com.flounderguy.jellysnap.domain.device_scan.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList()
)