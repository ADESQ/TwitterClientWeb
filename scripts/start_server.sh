#!/bin/bash
kill $(ps aux | grep -w twitterclient | awk '{print $2}')
cd /var/www
nohup java -jar *.jar > twitterClient.log 2>&1&
exit 0