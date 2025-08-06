plugins {
    id("adapter-config")
}

afterEvaluate {
    apply(plugin = "adapter-publish")
}

val libraryVersionName by extra("5.5.0.0")

android.defaultConfig.minSdk = 16
