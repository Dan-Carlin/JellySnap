package com.flounderguy.jellysnap.data.device_scan

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.flounderguy.jellysnap.domain.device_scan.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}