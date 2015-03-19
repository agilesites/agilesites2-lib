cd core
sbt -Dver=7.5.0 "publish-local"
cd ..
cd api
sbt -Dver=7.5.0 "publish-local" 
cd ..
