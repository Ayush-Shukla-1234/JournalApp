plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services")
}

android {
    namespace = "io.mastercoding.journalapp"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "io.mastercoding.journalapp"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.activity.ktx)
    implementation(libs.appcompat)
    implementation(libs.constraintlayout)
    implementation(libs.material)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.ext.junit)


    implementation(platform("com.google.firebase:firebase-bom:34.17.0"))

    implementation("com.google.firebase:firebase-analytics")

    implementation("com.google.firebase:firebase-firestore")

    implementation("com.google.firebase:firebase-auth")

    implementation("com.google.firebase:firebase-storage")

    // Glide core library
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // Glide annotation processor (for generated API / Java)
    annotationProcessor("com.github.bumptech.glide:compiler:4.16.0")


}