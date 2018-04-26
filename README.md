# Spring-ELK Example 
# Log Management (ELK) for Spring Boot application
This simple example demonstrates how easy you can enable quite powerful and advanced log management in to your Spring Boot application

## ELK Stack

1. **Elastics Search** is a distributed, JSON-based search and analytics engine designed for horizontal scalability, maximum reliability, and easy management.
2. **Logstash** is a dynamic data collection pipeline with an extensible plugin ecosystem and strong Elasticsearch synergy.
3. **Kibana** gives the visualization of data through a UI.

## ELK Stack Architecture
![alt text](https://github.com/issamnacim/wiki/blob/master/images/elastics.jpg "ELK")
## ELK Configuration
download logstash version : 6.2.2
create a new file logstash-config.conf and put :
input {
  file {
    path => "/PATH TO PROJECT/elk-example-spring-boot/elk-example.log.json"
    start_position => "beginning"
    sincedb_path => "/dev/null"
    stat_interval => 1
    codec =>   json {
      charset => "UTF-8"
    }
  }
}


output {
   elasticsearch {
     hosts => "http://localhost:9200"
     index => "elk_example"
     document_type => "anywhere"
  }
  stdout { codec => rubydebug }
}
