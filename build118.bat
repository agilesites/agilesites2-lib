@echo off
cd core
call sbt "core118/publish-local" "core118/publishM2"
cd ..
cd api
call sbt "api118/publish-local" "api118/publishM2"
cd ..
