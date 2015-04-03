# r8t
r8t

This project requires Elastic Search running in order to run. To run the docker image:

    docker run -d -v "$PWD/es/config":/usr/share/elasticsearch/config -p 9200:9200 -p 9300:9300 elasticsearch
    
# In order to delete index :

   curl -XDELETE 'http://localhost:9200/rating/'