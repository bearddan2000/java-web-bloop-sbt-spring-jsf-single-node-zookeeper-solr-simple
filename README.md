# java-web-bloop-sbt-spring-jsf-single-node-zookeeper-solr-simple

## Description
A jsf springboot java bloop-sbt build,
that connects to solr database single node cluster.

To create the `dog` collection we use a runner
to remotely issue `solr create_collection -c` to
node 1.

Zookeeper is used for replication across
the single node cluster.

Compiled and ran from build server `bloop`.

# Build note
Dependencies must be compatable with jdk8 or less.

## Tech stack
- bloop
- springboot
  - jsf
- bloop-sbt
  - solr drivers
  - lombok
  - PostConstruct annotation
- bootstrap
- jquery
- dataTable
- zookeeper

## Docker stack
- solr:8.2
- zookeeper:3.5
- hseeberger/scala-bloop-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

## To run
`sudo ./install.sh -u`
- [Available](http://localhost)
- [Node 1 solr webui](http://localhost:8981)

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
- [Baeldung code](https://github.com/eugenp/tutorials/tree/master/persistence-modules/spring-data-solr)
- [Springboot code](https://javadeveloperzone.com/spring-boot/spring-boot-solr-example/)
- [Spring data config](https://www.google.com/search?client=firefox-b-1-lm&q=spring+boot+solr+example)
- [Cluster setup](https://gist.github.com/makuk66/0812f70b77aa92230c203cec41acac64#file-docker-compose-yml-L64)
- [Example solr queries](https://docs.spring.io/spring-data/solr/docs/1.0.x/reference/html/solr.repositories.html)
