#!/bin/bash

echo "============================================"
echo "====== mvn clean package -DskipTest ========"
echo "============================================" 
mvn clean package -DskipTests

echo "======== Maven Build Completed ============="
echo " "
echo " "
echo " "
echo "==========================================="
echo "============= Cleaning docker =============" 
echo "==========================================="

### Removing all images however we need to consider a better naming convention or something else to  clean only relevant images.
docker kill $(docker ps -a -q)
docker rm $(docker ps -a -q)
docker rmi $(docker images -a -q) 

echo "==========Starting docker-compose========="

docker-compose up



