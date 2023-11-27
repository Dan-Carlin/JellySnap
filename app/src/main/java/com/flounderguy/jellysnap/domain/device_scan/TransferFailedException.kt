package com.flounderguy.jellysnap.domain.device_scan

import java.io.IOException

class TransferFailedException: IOException("Reading incoming data failed") {
}