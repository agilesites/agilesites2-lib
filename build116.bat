@echo off
cd core
call sbt "core116/publish-local" "core116/publishM2"
cd ..
cd api
call sbt "api116/publish-local" "api116/publishM2"
cd ..
