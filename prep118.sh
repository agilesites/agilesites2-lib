#!/usr/bin/env bash
set -x
v=11.1.1.8.0
export jsk=${1:-$PWD/webapps/cs118}
export h="$jsk/WEB-INF/lib"
if ! test -e  $h/systemtools-11.1.1.8.0.jar 
then echo "No Sites $v found" ; exit
fi
if test -z "$SKIP_MAVEN_INSTALL"; then
mvn install:install-file -Dfile="$h/cs-core.jar" -DgroupId=com.oracle.sites -DartifactId=cs-core -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/cs.jar" -DgroupId=com.oracle.sites -DartifactId=cs -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/wem-sso-api-11.1.1.8.0.jar" -DgroupId=com.oracle.sites -DartifactId=wem-sso-api -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/assetapi.jar" -DgroupId=com.oracle.sites -DartifactId=assetapi -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/assetapi-impl.jar" -DgroupId=com.oracle.sites -DartifactId=assetapi-impl -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/xcelerate.jar" -DgroupId=com.oracle.sites -DartifactId=xcelerate -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/gator.jar" -DgroupId=com.oracle.sites -DartifactId=gator -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/basic.jar" -DgroupId=com.oracle.sites -DartifactId=basic -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/jsoup-1.5.2.jar" -DgroupId=com.oracle.sites -DartifactId=jsoup -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/xstream-1.4.2.jar" -DgroupId=com.oracle.sites -DartifactId=xstream -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/basic.jar" -DgroupId=com.oracle.sites -DartifactId=basic -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/gator.jar" -DgroupId=com.oracle.sites -DartifactId=gator -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/framework.jar" -DgroupId=com.oracle.sites -DartifactId=framework -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/assetframework.jar" -DgroupId=com.oracle.sites -DartifactId=assetframework -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/lucene-search.jar" -DgroupId=com.oracle.sites -DartifactId=lucene-search -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/cs-cache-11.1.1.8.0.jar" -DgroupId=com.oracle.sites -DartifactId=cs-cache -Dversion=$v -Dpackaging=jar
fi
cd core
xjc -d $v/src/main/java -p agilesites.mappings -xmlschema $jsk/schema/rest-api.xsd
sbt -Dsites.webapp="$jsk" -Dsites.version="$v" "sitesTagWrapperGen"
cd ..
