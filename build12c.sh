cd core
sbt -Dver=12.1.4.0.1 "publish-local" 
cd ..
cd api
sbt -Dver=12.1.4.0.1 "publish-local" 
cd ..
