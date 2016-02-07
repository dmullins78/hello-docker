FROM tomcat:8-jre8

MAINTAINER "Dan Mullins <dmullins78@gmail.com>"

ADD settings.xml /usr/local/tomcat/conf/
ADD tomcat-users.xml /usr/local/tomcat/conf/
ADD server.xml /usr/local/tomcat/conf/
ADD target/hello-docker.war /usr/local/tomcat/webapps/

RUN curl -SL http://repo1.maven.org/maven2/de/javakaffee/msm/memcached-session-manager-tc8/1.8.3/memcached-session-manager-tc8-1.8.3.jar -o /usr/local/tomcat/lib/mecached-session-manager.jar

RUN curl http://repo1.maven.org/maven2/net/spy/spymemcached/2.11.1/spymemcached-2.11.1.jar -o /usr/local/tomcat/lib/spymemcached.jar


