#mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate -eX
# mvn mybatis-generator:generate-X
# mvn mybatis-generator:generate ../../





rm -rf ../../src/main/resources/com/rnj/ddangily/persistence/InstagramMapper.xml
rm -rf ../../src/main/java/com/rnj/ddangily/persistence/InstagramMapper.java
rm -rf ../../src/main/java/com/rnj/ddangily/model/Instagram.java

java -jar mybatis-generator-core-1.3.7.jar -configfile generatorConfig.xml -overwrite
