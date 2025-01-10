plugins {
    id("adapter-config")
}

afterEvaluate {
    apply(plugin = "adapter-publish")
}

val libraryVersionName by extra("2025.1.10.0")

android.defaultConfig.minSdk = 19
