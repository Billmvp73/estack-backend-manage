set -x
docker pull zookeeper:3.4
docker create --name $1 --net host -e ZOO_MY_ID=$2 -e ZOO_SERVERS="server.1=167.99.231.204:2888:3888 server.2=161.35.10.216:2888:3888" zookeeper:3.4