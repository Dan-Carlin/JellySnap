package com.flounderguy.jellysnap.data.bluetooth

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Test

class AndroidBluetoothControllerTest {

    private lateinit var context: Context
    private lateinit var bluetoothManager: BluetoothManager
    private lateinit var bluetoothAdapter: BluetoothAdapter

    @BeforeEach
    fun setUp() {
        context = InstrumentationRegistry.getInstrumentation().context
        bluetoothManager = context.getSystemService(BluetoothManager::class.java)
        bluetoothAdapter = bluetoothManager.adapter
    }

    @Test
    fun startDiscovery() {
    }

    @Test
    fun stopDiscovery() {
    }

    @Test
    fun release() {
    }
}