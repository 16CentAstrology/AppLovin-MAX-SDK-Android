plugins {
    id("adapter-config")
}

afterEvaluate {
    apply(plugin = "adapter-publish")
}

val libraryVersionName by extra("2025.1.10.2")
val minAppLovinSdkVersion by extra("13.0.0")

android.defaultConfig.minSdk = 19
