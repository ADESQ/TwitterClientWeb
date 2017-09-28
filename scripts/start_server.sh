#!/bin/bash

cd /var/www
nohup java -jar *.jar 2>&1 >> twitterClient.log &

exit 0