# Changelog

## 16.9.91.0
* Certified with Mintegral SDK 16.9.91.

## 16.9.81.0
* Certified with Mintegral SDK 16.9.81.
* Updated ad display failed error code.

## 16.9.71.0
* Certified with Mintegral SDK 16.9.71.

## 16.9.61.1
* Fixed issue where fullscreen ad callbacks were not fired when sequential ads are enabled.

## 16.9.61.0
* Certified with Mintegral SDK 16.9.61.
* Removed deprecated code paths based on the minimum supported AppLovin MAX SDK version 13.0.0.

## 16.9.51.0
* Certified with Mintegral SDK 16.9.51.

## 16.9.41.0
* Certified with Mintegral SDK 16.9.41.

## 16.9.31.2
* Introduced `verification.properties` to facilitate adapter ownership verification with Google SDK console.

## 16.9.31.1
* Call `setConsentStatus(Context)` API when `hasUserConsent` is `null` to ensure that Mintegral's SDK is able to read the TCF string from device storage.
* Update to use new initialization API.

## 16.9.31.0
* Certified with Mintegral SDK 16.9.31.

## 16.9.21.0
* Certified with Mintegral SDK 16.9.21.

## 16.9.11.0
* Certified with Mintegral SDK 16.9.11.

## 16.8.91.0
* Certified with Mintegral SDK 16.8.91.

## 16.8.81.0
* Certified with Mintegral SDK 16.8.81.

## 16.8.71.0
* Certified with Mintegral SDK 16.8.71.

## 16.8.61.1
* Add support for loading fullscreen ads without an `Activity` context.
* Annotated all `Activity` parameters with `@Nullable` to better avoid potential NPEs.

## 16.8.61.0
* Certified with Mintegral SDK 16.8.61.

## 16.8.51.2
* Update to use new interstitial ad APIs.

## 16.8.51.1
* Requires minimum AppLovin MAX SDK version be 13.0.0.
* Removed support for COPPA.
* Remove deprecated native API usages.

## 16.8.51.0
* Certified with Mintegral SDK 16.8.51.

## 16.8.41.0
* Certified with Mintegral SDK 16.8.41.

## 16.8.31.0
* Certified with Mintegral SDK 16.8.31.

## 16.8.21.0
* Certified with Mintegral SDK 16.8.21.

## 16.8.11.0
* Certified with Mintegral SDK 16.8.11.

## 16.7.91.0
* Certified with Mintegral SDK 16.7.91.

## 16.7.81.0
* Certified with Mintegral SDK 16.7.81.

## 16.7.71.0
* Certified with Mintegral SDK 16.7.71.

## 16.7.61.0
* Certified with Mintegral SDK 16.7.61.

## 16.7.51.0
* Certified with Mintegral SDK 16.7.51.

## 16.7.41.0
* Certified with Mintegral SDK 16.7.41.

## 16.7.31.0
* Certified with Mintegral SDK 16.7.31.

## 16.7.21.0
* Certified with Mintegral SDK 16.7.21.

## 16.7.11.0
* Certified with Mintegral SDK 16.7.11.

## 16.6.71.0
* Certified with Mintegral SDK 16.6.71.
* Remove deprecated callbacks `onRewardedAdVideoStarted()` and `onRewardedAdVideoCompleted()`.

## 16.6.61.1
* Add support for app open ads.

## 16.6.61.0
* Certified with Mintegral SDK 16.6.61.

## 16.6.51.1
* Remove ProGuard rules since they are included in Mintegral's libraries.

## 16.6.51.0
* Certified with Mintegral SDK 16.6.51.

## 16.6.41.0
* Certified with Mintegral SDK 16.6.41.

## 16.6.34.0
* Certified with Mintegral SDK 16.6.34.

## 16.6.31.0
* Certified with Mintegral SDK 16.6.31.

## 16.6.21.0
* Certified with Mintegral SDK 16.6.21.

## 16.6.11.0
* Certified with Mintegral SDK 16.6.11.

## 16.5.91.2
* Update to set channel code/ID only when SDK is being initialized.

## 16.5.91.1
* Update to retrieve creative ID and set channel code/ID using new APIs.
* Now requires MAX SDK version 9.15.0 or higher.

## 16.5.91.0
* Certified with Mintegral SDK 16.5.91.

## 16.5.81.0
* Certified with Mintegral SDK 16.5.81.

## 16.5.71.0
* Certified with Mintegral SDK 16.5.71.
* Note: This is the first Mintegral SDK with TCF v2 compliance.

## 16.5.61.0
* Certified with Mintegral SDK 16.5.61.

## 16.5.51.0
* Certified with Mintegral SDK 16.5.51.

## 16.5.41.0
* Certified with Mintegral SDK 16.5.41.

## 16.5.31.0
* Certified with Mintegral SDK 16.5.31.

## 16.5.21.0
* Certified with Mintegral SDK 16.5.21.

## 16.5.11.0
* Certified with Mintegral SDK 16.5.11.

## 16.4.91.0
* Certified with Mintegral SDK 16.4.91.

## 16.4.81.0
* Certified with Mintegral SDK 16.4.81.

## 16.4.71.0
* Certified with Mintegral SDK 16.4.71.

## 16.4.61.0
* Certified with Mintegral SDK 16.4.61.

## 16.4.51.0
* Certified with Mintegral SDK 16.4.51.

## 16.4.41.1
* Fix native ads memory leak by calling `MBMediaView.destory()`.

## 16.4.41.0
* Certified with Mintegral SDK 16.4.41.

## 16.4.31.2
* Update call to `setDoNotTrackStatus(...)` to pass in context.
* Remove the `getPrivacySetting()` function and call privacy methods directly.
* Now requires MAX SDK version 9.14.0 or higher.

## 16.4.31.1
* Fix NPE that occurs when `mbBidNativeHandler` or `mbBidNativeAdViewHandler` is `null` on native or native ad view ad loads.

## 16.4.31.0
* Certified with Mintegral SDK 16.4.31.

## 16.4.21.0
* Certified with Mintegral SDK 16.4.21.

## 16.4.11.1
* Pass in extra data for signal collection.

## 16.4.11.0
* Certified with Mintegral SDK 16.4.11.

## 16.3.91.1
* Pass in extra data for signal collection.

## 16.3.91.0
* Certified with Mintegral SDK 16.3.91.

## 16.3.81.0
* Certified with Mintegral SDK 16.3.81.

## 16.3.71.0
* Certified with Mintegral SDK 16.3.71.

## 16.3.61.0
* Certified with Mintegral SDK 16.3.61.

## 16.3.51.2
* Fix crash when preparing views for interaction for native ad view ads.

## 16.3.51.1
* Add COPPA support.

## 16.3.51.0
* Certified with Mintegral SDK 16.3.51.

## 16.3.41.1
* Add support for star ratings in manual native ads (Android only support).

## 16.3.41.0
* Certified with Mintegral SDK 16.3.41.

## 16.3.31.0
* Certified with Mintegral SDK 16.3.31.

## 16.3.21.0
* Certified with Mintegral SDK 16.3.21.

## 16.3.11.0
* Certified with Mintegral SDK 16.3.11.

## 16.2.61.2
* Support for native ads in external plugins (e.g. React Native).

## 16.2.61.1
* Add support for native ad view ads.
* Add additional details for ad display failures.

## 16.2.61.0
* Certified with Mintegral SDK 16.2.61.

## 16.2.51.0
* Certified with Mintegral SDK 16.2.51.

## 16.2.41.1
* Remove `mbBidInterstitialVideoHandler.isBidReady()` and `mbBidRewardVideoHandler.isBidReady()` checks for interstitial and rewarded bidding ads.

## 16.2.41.0
* Certified with Mintegral SDK 16.2.41.

## 16.2.31.0
* Certified with Mintegral SDK 16.2.31.

## 16.2.21.0
* Certified with Mintegral SDK 16.2.21.

## 16.2.11.2
* Add append node for `com.mbridge.msdk.oversea:dycreator` dependency.

## 16.2.11.1
* Add `com.mbridge.msdk.oversea:dycreator` dependency.

## 16.2.11.0
* Certified with Mintegral SDK 16.2.11.

## 16.1.91.0
* Certified with Mintegral SDK 16.1.91.

## 16.1.81.0
* Certified with Mintegral SDK 16.1.81.

## 16.1.71.0
* Certified with Mintegral SDK 16.1.71.
* Use local scope copy of native ad while preparing view.

## 16.1.61.0
* Certified with Mintegral SDK 16.1.61.

## 16.1.51.1
* Add support for returning the main image asset in `MaxNativeAd` for native ads.

## 16.1.51.0
* Certified with Mintegral SDK 16.1.51.

## 16.1.41.0
* Certified with Mintegral SDK 16.1.41.

## 16.1.11.3
* Unity: add `androidx.recyclerview:recyclerview` dependency.

## 16.1.11.2
* Add mapping for "load no ad" error message to MAX no fill.

## 16.1.11.1
* Update ad display failed error code.

## 16.1.11.0
* Certified with Mintegral SDK 16.1.11.

## 16.0.31.2
* Remove check for manual native ad assets.

## 16.0.31.1
* Add support for `null` Activity context for regular banners/MRECs and native ads.

## 16.0.31.0
* Certified with Mintegral SDK 16.0.31.

## 16.0.11.0
* Certified with Mintegral SDK 16.0.11.

## 15.8.1.4
* Support for null `Activity` on init.

## 15.8.1.3
* Fix multiple callbacks getting triggered.

## 15.8.1.2
* Properly destroy native ad.

## 15.8.1.1
* Fix icon view never getting registered for interaction.

## 15.8.1.0
* Certified with Mintegral SDK 15.8.01.

## 15.7.71.1
* Add support for template and custom native ads.

## 15.7.71.0
* Certified with Mintegral SDK 15.7.71.

## 15.7.61.0
* Certified with Mintegral SDK 15.7.61.

## 15.7.21.0
* Certified with Mintegral SDK 15.7.21.

## 15.7.11.0
* Certified with Mintegral SDK 15.7.11.

## 15.6.31.0
* Certified with Mintegral SDK 15.6.31.

## 15.6.1.0
* Certified with Mintegral SDK 15.6.01.

## 15.5.51.0
* Certified with Mintegral SDK 15.5.51.
* Update callback input parameters.

## 15.5.41.0
* Certified with Mintegral SDK 15.5.41.

## 15.5.31.0
* Certified with Mintegral SDK 15.5.31.

## 15.5.21.0
* Certified with Mintegral SDK 15.5.21.

## 15.5.11.0
* Certified with Mintegral SDK 15.5.11.

## 15.5.1.0
* Certified with Mintegral SDK 15.5.01.

## 15.4.61.0
* Certified with Mintegral SDK 15.4.61.
* Update package names and Mintegral private repository.

## 15.4.51.0
* Certified with Mintegral SDK 15.4.51.
* Initial release to Maven Central and not JCenter.

## 15.4.31.1
* Add support for passing creative id to SDK (supported in Android SDK 9.15.0+).

## 15.4.31.0
* Certified with Mintegral SDK 15.4.31.
* Add support to pass 3rd-party error code and description to SDK.

## 15.4.21.0
* Certified with Mintegral SDK 15.4.21.

## 15.4.11.0
* Certified with Mintegral SDK 15.4.11.

## 15.4.1.0
* Certified with Mintegral SDK 15.4.01.

## 15.3.11.0
* Certified with Mintegral SDK 15.3.11.

## 15.2.41.0
* Certified with Mintegral SDK 15.2.41.
* Removed activity `com.mintegral.msdk.activity.MTGCommonActivity`, receiver `com.mintegral.msdk.click.AppReceiver`, and service `com.mintegral.msdk.shell.MTGService` from Android manifest file.

## 15.2.21.0
* Certified with Mintegral SDK 15.2.21.

## 15.2.11.0
* Certified with Mintegral SDK 15.2.11.
* Update to use Mintegral `oversea` SDK from their private repository.
* Update 10000000 version check to 9140000.
* Update initialization log.

## 14.4.1.1
* Added support for Mintegral's placement id.

## 14.4.1.0
* Certified with Mintegral SDK 14.4.01.
* Removed MTGRewardVideoActivity from Manifest.

## 14.3.1.2
* Fix Changelog

## 14.3.1.1
* Update 91400 version check to 10000000.

## 14.3.1.0
* Certified with Mintegral SDK 14.3.01.

## 14.2.51.3
* Updated to not set privacy settings if null.

## 14.2.51.2
* Roll back privacy changes.

## 14.2.51.1
* Updated to not set privacy settings if null.

## 14.2.51.0
* Certified with Mintegral SDK 14.2.51.

## 14.2.21.2
* Downgrade Mintegral SDK to 14.1.01.

## 14.2.21.1
* Revert Mintegral SDK to 14.2.01 due to overriding network_security_config.xml.

## 14.2.21.0
* Certified with Mintegral SDK 14.2.21.

## 14.2.1.0
* Certified with Mintegral SDK 14.2.01.

## 14.1.1.0
* Certified with Mintegral SDK 14.1.01.

## 14.0.11.0
* Certified with Mintegral SDK 14.0.11.

## 13.1.11.0
* Certified with Mintegral SDK 13.1.11.

## 13.0.41.0
* Certified with Mintegral SDK 13.0.41.
* Add support for new error messages and formatting.

## 13.0.1.2
* Apply fixes at the suggestion from Mintegral's team for high fullscreen ad error rates.

## 13.0.1.1
* Fix bad versioning push which included the "0" all over the place.

## 13.0.01.0
* Certified with Mintegral SDK 13.0.01.

## 12.2.31.0
* Certified with Mintegral SDK 12.2.31.

## 12.2.11.0
* Certified with Mintegral SDK 12.2.11.

## 12.1.51.0
* Certified with Mintegral SDK 12.1.51.
* Add support for CCPA.
* Add support for AndroidX.

## 10.1.51.2
* Removed `mtgdownloads` and `optimizedata` dependencies, which are unnecessary for apps on the Play Store.

## 10.1.51.1
* Add support for bidding on Mintegral banners.

## 10.1.51.0
* Certified with Mintegral SDK 10.1.51.

## 10.1.2.1
* Add support for Mintegral banner ads.
* Add support for mute configuration.

## 10.1.2.0
* Certified with Mintegral SDK 10.1.2.
* Updated the minimum required AppLovin SDK version to 9.5.0.

## 10.1.0.0
* Certified with Mintegral SDK 10.1.0.

## 9.13.2.1
* Removed `WRITE_EXTERNAL_STORAGE` permission from the Android manifest file.

## 9.13.2.0
* Certified with Mintegral SDK 9.13.2.

## 9.12.4.0
* Add support for bidding.
* Check for ad readiness before showing for interstitials.
* Add support for initialization status.

## 9.10.4.1
* Add Unity support for automatic dependency resolution. Please ensure that you are on the latest [AppLovin MAX Unity Plugin](https://bintray.com/applovin/Unity/applovin-max-unity-plugin).
* Add support for extra reward options.
* Correctly map NO FILLs.

## 9.10.4.0
* Certified with Mintegral SDK 9.10.4 (MAL_9.10.41).

## 9.8.0.1
* Dynamically reference against Mintegral SDK version number.

## 9.8.0.0
* Certified with Mintegral SDK 9.8.0.

## 9.1.1.2
* Use unique package name in Android Manifest.

## 9.1.1.1
* Added Proguard rules required by Mintegral SDK.

## 9.1.1.0
* Initial commit.
