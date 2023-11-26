object Testing {
    private const val junitVersion = "4.13.2"
    const val junit4 = "junit:junit:$junitVersion"

    private const val junit5Version = "5.10.0"
    const val junit5 = "org.junit.jupiter:junit-jupiter-api:$junit5Version"
    const val jupiterEngine = "org.junit.jupiter:junit-jupiter-engine:$junit5Version"
    const val jupiterParams = "org.junit.jupiter:junit-jupiter-params:$junit5Version"

    private const val junitAndroidExtVersion = "1.1.5"
    const val junitAndroidExt = "androidx.test.ext:junit:$junitAndroidExtVersion"

    private const val espressoCoreVersion = "3.5.1"
    const val espressoCore = "androidx.test.espresso:espresso-core:$espressoCoreVersion"

    private const val mockKVersion = "1.13.8"
    const val mockK = "io.mockk:mockk:$mockKVersion"
    const val mockKAndroid = "io.mockk:mockk-android:$mockKVersion"

    private const val testRunnerVersion = "1.5.2"
    const val testRunner = "androidx.test:runner:$testRunnerVersion"

    private const val truthVersion = "1.1.4"
    const val truth = "com.google.truth:truth:$truthVersion"

    const val composeUiTest = "androidx.compose.ui:ui-test-junit4"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling"
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest"
}