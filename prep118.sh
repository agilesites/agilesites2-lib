#!/bin/bash
export jsk=/Users/msciab/Local/AgileSitesSetup/agilesites2-setup/webapps/cs
export v=11.1.1.8.0
export h="$jsk/WEB-INF/lib"
if ! test -e $h/systemtools-11.1.1.8.0.jar 
then echo Edit this file and set the location of cs webapp for WebCenter Sites $v 
     exit 1 
fi
mvn install:install-file -Dfile="$h/cs-core.jar" -DgroupId=com.oracle.sites -DartifactId=cs-core -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/cs.jar" -DgroupId=com.oracle.sites -DartifactId=cs -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/wem-sso-api-11.1.1.8.0.jar" -DgroupId=com.oracle.sites -DartifactId=wem-sso-api -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/assetapi.jar" -DgroupId=com.oracle.sites -DartifactId=assetapi -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/assetapi-impl.jar" -DgroupId=com.oracle.sites -DartifactId=assetapi-impl -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/xcelerate.jar" -DgroupId=com.oracle.sites -DartifactId=xcelerate -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/jsoup-1.5.2.jar" -DgroupId=com.oracle.sites -DartifactId=jsoup -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/xstream-1.4.2.jar" -DgroupId=com.oracle.sites -DartifactId=xstream -Dversion=$v -Dpackaging=jar
cd core
sbt "core118/sitesTagWrapperGen $jsk"
