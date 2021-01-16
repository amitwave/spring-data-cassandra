docker network create cassandra-net

docker run -p 9042:9042 --name my-cassandra --network cassandra-net -d cassandra:latest

docker run -it --rm --network cassandra-net cassandra:latest cqlsh my-cassandra


CREATE KEYSPACE myKeyspace
  WITH REPLICATION = { 
   'class' : 'SimpleStrategy', 
   'replication_factor' : 1 
  };