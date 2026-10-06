pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
//plugins {
//    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
//}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

buildCache {
    remote<HttpBuildCache> {
        url = uri("http://localhost:2222/cache/")
        isAllowInsecureProtocol = true
        credentials {
            username = "droidcon"
            password = "HelloDroidcon26!"
        }
        isPush = false
    }
}

rootProject.name = "deep-thought"
