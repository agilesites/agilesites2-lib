cd core
sbt "core762/publish-local" "core762/publishM2"
cd ..
cd api
sbt "api762/publish-local" "api762/publishM2"
cd ..
