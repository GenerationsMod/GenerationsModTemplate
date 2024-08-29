architectury {
    common("forge", "fabric")
    platformSetupLoomIde()
}

val minecraftVersion = project.properties["minecraft_version"] as String

loom.accessWidenerPath.set(file("src/main/resources/examplemod.accesswidener"))

sourceSets.main.get().resources.srcDir("src/main/generated/resources")

dependencies {
    modImplementation("net.fabricmc:fabric-loader:${project.properties["fabric_loader_version"]}")

    modCompileOnly("generations.gg.generations.core:Generations-Core-Common:${project.properties["generations-core_version"]}")

    //Cobblemon
    modCompileOnly("com.cobblemon:mod:${project.properties["cobblemon_version"]}")
}
