
ECHO ".............MAVEN WITHOUT INTERNET.........."
mvn dependency:go-offline 
mvn -o verify 
PAUSE
