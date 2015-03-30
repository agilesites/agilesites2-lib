#!/bin/bash
set -x
v=12.1.4.0.1
vv=-12.1.4.0.1-SNAPSHOT
export jsk=${1:-$PWD/webapps/cs12c}
export h="$jsk/WEB-INF/lib"
if ! test -e  $h/sites-systemtools-12.1.4.0.1-SNAPSHOT.jar 
then echo "No Sites $v found" ; exit
fi
mvn install:install-file -Dfile="$h/sites-core$vv.jar" -DgroupId=com.oracle.sites -DartifactId=cs-core -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/sites-cs$vv.jar" -DgroupId=com.oracle.sites -DartifactId=cs -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/sites-sso-api$vv.jar" -DgroupId=com.oracle.sites -DartifactId=wem-sso-api -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/sites-asset-api$vv.jar" -DgroupId=com.oracle.sites -DartifactId=assetapi -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/sites-framework$vv.jar" -DgroupId=com.oracle.sites -DartifactId=xcelerate -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/sites-enrichment$vv.jar" -DgroupId=com.oracle.sites -DartifactId=gator -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/sites-app$vv.jar" -DgroupId=com.oracle.sites -DartifactId=basic -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/jsoup-1.5.2.jar" -DgroupId=com.oracle.sites -DartifactId=jsoup -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/xstream-1.4.2.jar" -DgroupId=com.oracle.sites -DartifactId=xstream -Dversion=$v -Dpackaging=jar
cd core
sbt "sitesTagWrapperGen $jsk $v"
rm 12.1.4.0.1/src/main/java/wcs/core/tag/XlatTag.java
cd ..
