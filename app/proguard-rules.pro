# AppCompat (androidx.appcompat)
-keep class androidx.appcompat.** { *; }
-dontwarn androidx.appcompat.**

# Material Components (com.google.android.material)
-keep class com.google.android.material.** { *; }
-dontwarn com.google.android.material.**

# OkHttp (com.squareup.okhttp3)
-keepattributes Signature
-keepattributes Annotation
-keep class okhttp3.** { *; }
-dontwarn okhttp3.**
-dontwarn okio.**

# Prevent obfuscation of method and field names in OkHttp used by reflection
-keepnames class okhttp3.** { *; }
-keepclassmembers class okhttp3.** {
    public *;
}

# JUnit (for unit tests)
-keep class org.junit.** { *; }
-dontwarn org.junit.**

# AndroidX Test (JUnit and Espresso)
-keep class androidx.test.** { *; }
-dontwarn androidx.test.**
-keep class androidx.test.ext.junit.** { *; }
-dontwarn androidx.test.ext.junit.**
-keep class androidx.test.espresso.** { *; }
-dontwarn androidx.test.espresso.**

# Keep any inner classes and anonymous classes (used in tests or for debugging)
-keepattributes InnerClasses

# Prevent obfuscation of test classes
-keep class *Test { *; }


# Please add these rules to your existing keep rules in order to suppress warnings.
# This is generated automatically by the Android Gradle plugin.
-dontwarn org.bouncycastle.jsse.BCSSLParameters
-dontwarn org.bouncycastle.jsse.BCSSLSocket
-dontwarn org.bouncycastle.jsse.provider.BouncyCastleJsseProvider
-dontwarn org.conscrypt.Conscrypt$Version
-dontwarn org.conscrypt.Conscrypt
-dontwarn org.conscrypt.ConscryptHostnameVerifier
-dontwarn org.openjsse.javax.net.ssl.SSLParameters
-dontwarn org.openjsse.javax.net.ssl.SSLSocket
-dontwarn org.openjsse.net.ssl.OpenJSSE