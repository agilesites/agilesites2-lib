cd core
sbt -Dver=11.1.1.8.0 "publish-local" 
cd ..
cd api
sbt -Dver=11.1.1.8.0 "publish-local" 
cd ..
