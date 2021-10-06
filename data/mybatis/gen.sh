#mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate -eX
# mvn mybatis-generator:generate-X
# mvn mybatis-generator:generate ../../




set -x

rm -rf ../../src/main/resources/com/rnj/ddangily/persistence/InstagramMapper.xml
rm -rf ../../src/main/resources/com/rnj/ddangily/persistence/MasterConfigMapper.xml

 java -jar mybatis-generator-core-1.3.7.jar -configfile generatorConfig.xml -overwrite
