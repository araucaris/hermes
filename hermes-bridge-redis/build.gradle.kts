plugins {
    `hermes-java`
    `hermes-publish`
    `hermes-repositories`
}

dependencies {
    api(project(":hermes-common"))
    compileOnlyApi("io.lettuce:lettuce-core:6.5.0.RELEASE")
}

hermesPublish {
    artifactId = "hermes-bridge-redis"
}