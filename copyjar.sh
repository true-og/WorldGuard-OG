#!/usr/bin/env bash

VERSION="$1"

# Ensure the target directory exists
mkdir -p build/libs

# Copy and rename the jar, using $VERSION in the final filename
cp worldguard-bukkit/build/libs/worldguard-bukkit-*-SNAPSHOT.jar "build/libs/WorldGuard-OG-${VERSION}.jar"
