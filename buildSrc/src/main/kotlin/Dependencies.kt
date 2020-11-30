import org.gradle.api.artifacts.dsl.DependencyHandler

/*
 * Copyright 2019 vmadalin.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Project dependencies, makes it easy to include external binaries or
 * other library modules to build.
 */
object Dependencies {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${BuildDependenciesVersions.KOTLIN}"
    const val COROUTINES =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${BuildDependenciesVersions.COROUTINES}"
    const val COROUTINES_ANDROID =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${BuildDependenciesVersions.COROUTINES}"

    const val ROOM_RUNTIME = "androidx.room:room-runtime:${BuildDependenciesVersions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${BuildDependenciesVersions.ROOM}"
    const val ROOM_COMPILE = "androidx.room:room-compiler:${BuildDependenciesVersions.ROOM}"

    const val LIFECYCLE_EXTENSIONS =
        "androidx.lifecycle:lifecycle-extensions:${BuildDependenciesVersions.LIFECYCLE}"
    const val LIFECYCLE_VIEWMODEL =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${BuildDependenciesVersions.LIFECYCLE}"
    const val LIFECYCLE_LIVEDATA =
        "androidx.lifecycle:lifecycle-livedata-ktx:${BuildDependenciesVersions.LIFECYCLE}"
    const val LIFECYCLE_RUNTIME =
        "androidx.lifecycle:lifecycle-runtime:${BuildDependenciesVersions.LIFECYCLE}"

    const val CORE_KTX = "androidx.core:core-ktx:${BuildDependenciesVersions.CORE_KTX}"
    const val FRAGMENT_KTX =
        "androidx.fragment:fragment-ktx:${BuildDependenciesVersions.FRAGMENT_KTX}"
    const val CONSTRAIN_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${BuildDependenciesVersions.CONSTRAIN_LAYOUT}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${BuildDependenciesVersions.APPCOMPAT}"
    const val MATERIAL =
        "com.google.android.material:material:${BuildDependenciesVersions.MATERIAL}"
    const val RECYCLE_VIEW =
        "androidx.recyclerview:recyclerview:${BuildDependenciesVersions.RECYCLE_VIEW}"

    const val SWIPE_REFRESH_LAYOUT =
        "androidx.swiperefreshlayout:swiperefreshlayout:${BuildDependenciesVersions.SWIPE_REFRESH_LAYOUT}"
    const val PAGING = "androidx.paging:paging-runtime-ktx:${BuildDependenciesVersions.PAGING}"

    const val DAGGER = "com.google.dagger:dagger:${BuildDependenciesVersions.DAGGER}"
    const val DAGGER_COMPILER =
        "com.google.dagger:dagger-compiler:${BuildDependenciesVersions.DAGGER}"
    const val DAGGER_ANDROID =
        "com.google.dagger:dagger-android-support:${BuildDependenciesVersions.DAGGER}"
    const val DAGGER_ANDROID_PROCESSOR =
        "com.google.dagger:dagger-android-processor:${BuildDependenciesVersions.DAGGER}"

    const val TIMBER = "com.jakewharton.timber:timber:${BuildDependenciesVersions.TIMBER}"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${BuildDependenciesVersions.RETROFIT}"
    const val RETROFIT_CONVERTER_MOSHI =
        "com.squareup.retrofit2:converter-moshi:${BuildDependenciesVersions.RETROFIT}"
    const val OKHTTP_LOGGER =
        "com.squareup.okhttp3:logging-interceptor:${BuildDependenciesVersions.LOGGING}"

    const val MOSHI = "com.squareup.moshi:moshi-kotlin:${BuildDependenciesVersions.MOSHI}"
    const val MOSHI_CODEGEN =
        "com.squareup.moshi:moshi-kotlin-codegen:${BuildDependenciesVersions.MOSHI}"


    const val GLIDE = "com.github.bumptech.glide:glide:${BuildDependenciesVersions.GLIDE}"
    const val GLIDE_PROCESSOR =
        "com.github.bumptech.glide:compiler:${BuildDependenciesVersions.GLIDE}"

    const val GMS_MAP =
        "com.google.android.gms:play-services-maps:${BuildDependenciesVersions.GMS_MAP}"
    const val CRASHLYTICS =
        "com.crashlytics.sdk.android:crashlytics:${BuildDependenciesVersions.CRASHLYTICS}"
    const val FIREBASE_CORE = "com.google.firebase:firebase-core:${BuildDependenciesVersions.CORE}"

    const val PLAY_CORE = "com.google.android.play:core:${BuildDependenciesVersions.PLAY_CORE}"
}

fun DependencyHandler.firebase() {
    implementation(Dependencies.FIREBASE_CORE)
    implementation(Dependencies.CRASHLYTICS)
}

fun DependencyHandler.dagger() {
    compileOnly(Dependencies.DAGGER)
    kapt(Dependencies.DAGGER_COMPILER)
    implementation(Dependencies.DAGGER_ANDROID)
    kapt(Dependencies.DAGGER_ANDROID_PROCESSOR)
}

fun DependencyHandler.appCompat() {
    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.CONSTRAIN_LAYOUT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.RECYCLE_VIEW)
}

fun DependencyHandler.lifecycle() {
    implementation(Dependencies.LIFECYCLE_RUNTIME)
    implementation(Dependencies.LIFECYCLE_EXTENSIONS)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.LIFECYCLE_LIVEDATA)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER_MOSHI)
    implementation(Dependencies.OKHTTP_LOGGER)
}

fun DependencyHandler.moshi() {
    implementation(Dependencies.MOSHI)
    kapt(Dependencies.MOSHI_CODEGEN)
}

fun DependencyHandler.glide() {
    implementation(Dependencies.GLIDE)
    kapt(Dependencies.GLIDE_PROCESSOR)
}

fun DependencyHandler.room() {
    api(Dependencies.ROOM_RUNTIME)
    implementation(Dependencies.ROOM_KTX)
    kapt(Dependencies.ROOM_COMPILE)
}

fun DependencyHandler.implementation(depName: String) {
    add("implementation", depName)
}

private fun DependencyHandler.kapt(depName: String) {
    add("kapt", depName)
}

private fun DependencyHandler.compileOnly(depName: String) {
    add("compileOnly", depName)
}

private fun DependencyHandler.api(depName: String) {
    add("api", depName)
}