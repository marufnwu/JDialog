Implementation of Material Dialog library is so easy. You can check /app directory for demo. Let's have look on basic steps of implementation.

i. Gradle
In Build.gradle of app module, include these dependencies. If you want to show animations, include Lottie animation library.

repositories {
    mavenCentral()
}

dependencies {

   implementation 'com.github.marufnwu:JDialog:Tag'
}
