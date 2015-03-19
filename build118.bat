@echo off
cd core
call sbt -Dver=11.1.1.8.0 "publish-local" 
cd ..
cd api
call sbt -Dver=11.1.1.8.0 "publish-local" 
cd ..
