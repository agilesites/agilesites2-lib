cd core
sbt6 -Dver=11.1.1.8.0 "publish-local" 
cd ..
cd api
sbt6 -Dver=11.1.1.8.0 "publish-local" 
cd ..
