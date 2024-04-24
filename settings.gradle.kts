pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "SmartHome"
include(":app")
include(":core-network")
include(":core-common")
include(":core-data")
include(":core-designSystem")
include(":core-localstorage")
include(":core-model")
include(":core-navigation")
include(":core-theme")
