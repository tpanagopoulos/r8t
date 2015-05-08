# r8t
r8t

This project requires Elastic Search running in order to run. To run the docker image:

    docker run -d -v "$PWD/es/config":/usr/share/elasticsearch/config -p 9200:9200 -p 9300:9300 elasticsearch
    
# In order to delete index :

   curl -XDELETE 'http://localhost:9200/rating/'
   
# Docker 

	docker build -t tpanagopoulos/tomcat8:1.0-SNAPSHOT .

	docker run -p 8080:8080 --name tomcat8 tpanagopoulos/tomcat8:1.0-SNAPSHOT

	docker-compose up
