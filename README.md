학습하기 위한 기본 셋팅 내역

JAVA Version: 17

openjdk 17

DB
Mysql:8.X.X

Docker 
Imager:mysql:8.x.x
script:
docker run -d --name mysql \
-e MYSQL_ROOT_PASSWORD=1234 \
-e MYSQL_USER=mds1262 \
-e MYSQL_PASSWORD=1234 \
-v ~/dockerVol/mysql:/etc/mysql/conf.d \
-p 3306:3306 \
mysql:8.0.33 \
--character-set-server=utf8mb4 \
--collation-server=utf8mb4_unicode_ci
