rootProject.name = "WorldGuard-OG"

// Execute bootstrap.sh
exec {
    workingDir(rootDir)
    commandLine("sh", "bootstrap.sh")
}

include("libs:Utilities-OG")
include("worldguard-libs")
include("worldguard-libs:core")
include("worldguard-core")
//include("worldguard-libs:bukkit")
include("worldguard-bukkit")
