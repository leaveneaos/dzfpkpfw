# dzfpkpfw
电子发票开票服务



docker run -d --restart=always  --privileged=true  --hostname=development_dzfpkpfw --name development_dzfpkpfw   -p 40013:40013  -e params='--server.port=40013' -e app_name='app-dzfpkpfw' -v /home/docker/code/development_dzfpkpfw/apps:/opt/apps/ -v /home/docker/logs/development_dzfpkpfw:/opt/hyht/logs  zxbking/jar