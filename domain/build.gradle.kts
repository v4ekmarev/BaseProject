plugins {
    id("kotlin")
}

dependencies {

    implementation(Dependencies.KOTLIN)
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.2.1")

    dagger()

}