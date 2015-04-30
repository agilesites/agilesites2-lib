sbt7 api118/publish-local
cp \
/Users/msciab/.ivy2/local/com.sciabarra/agilesites2-api/11.1.1.8.0_1.9/jars/agilesites2-api.jar \
/Users/msciab/Work/Telmore/2015/agilesites-telmore-ng/puppet/modules/agilesites/files/agilesites-api-11.1.1.8.0_1.8.1.jar
scp -P2222 \
/Users/msciab/.ivy2/local/com.sciabarra/agilesites2-api/11.1.1.8.0_1.9/jars/agilesites2-api.jar \
vagrant@127.0.0.1:/pack/AgileSites-1.8/wcs/shared/agilesites/agilesites-api-11.1.1.8.0_1.8.1.jar
