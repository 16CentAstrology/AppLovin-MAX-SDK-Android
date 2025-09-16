plugins {
    id("adapter-config")
    id("com.applovin.mobile.publish")
}

val libraryVersionName by extra("24.6.0.0")
val minAppLovinSdkVersion by extra("13.0.0")

applovinMobilePublish {
    libraryArtifactId.set("google-ad-manager-adapter")
}

android.defaultConfig.minSdk = 23
