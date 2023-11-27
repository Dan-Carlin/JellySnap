package com.flounderguy.jellysnap.data.bluetooth

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.flounderguy.jellysnap.domain.bluetooth.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}