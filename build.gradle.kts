// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version Plugins.androidApplicationVersion apply false
    id("org.jetbrains.kotlin.android") version Kotlin.version apply false
    id("com.google.dagger.hilt.android") version DaggerHilt.version apply false
}