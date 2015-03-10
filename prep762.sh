set -x
v=7.5.0
export jsk=${1?cs webapp}
export h="$jsk/WEB-INF/lib"
if ! test -e  $h/systemtools-7.6.2.jar 
then echo "No Sites $v found" ; exit
fi
mvn install:install-file -Dfile="$h/cs-core.jar" -DgroupId=com.oracle.sites -DartifactId=cs-core -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/cs.jar" -DgroupId=com.oracle.sites -DartifactId=cs -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/assetapi.jar" -DgroupId=com.oracle.sites -DartifactId=assetapi -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/assetapi-impl.jar" -DgroupId=com.oracle.sites -DartifactId=assetapi-impl -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/xcelerate.jar" -DgroupId=com.oracle.sites -DartifactId=xcelerate -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/gator.jar" -DgroupId=com.oracle.sites -DartifactId=gator -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/basic.jar" -DgroupId=com.oracle.sites -DartifactId=basic -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/jsoup-1.5.2.jar" -DgroupId=com.oracle.sites -DartifactId=jsoup -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/xstream-1.2.2_modified.jar" -DgroupId=com.oracle.sites -DartifactId=xstream -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/basic.jar" -DgroupId=com.oracle.sites -DartifactId=basic -Dversion=$v -Dpackaging=jar
mvn install:install-file -Dfile="$h/gator.jar" -DgroupId=com.oracle.sites -DartifactId=gator -Dversion=$v -Dpackaging=jar

cd core
case "$jsk" in
   /*) sbt "core762/sitesTagWrapperGen $jsk" ;;
   *) sbt "core762/sitesTagWrapperGen $PWD/../$jsk" ;;
esac
cd ..
