cd core
sbt "core116/publish-local" "core116/publishM2"
cd ..
cd api
sbt "api116/publish-local" "api116/publishM2"
cd ..
