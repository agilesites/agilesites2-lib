@echo off
cd core
call sbt -Dver=7.5.0 "publish-local" 
cd ..
cd api
call sbt -Dver=7.5.0 "publish-local"
cd ..
