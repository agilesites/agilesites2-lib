@echo off
cd core
call sbt "core762/publish-local" "core762/publishM2"
cd ..
cd api
call sbt "api762/publish-local" "api762/publishM2"
cd ..
