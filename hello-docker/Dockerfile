FROM tomcat:8-jre8

MAINTAINER "Dan Mullins <dmullins78@gmail.com>"

ADD settings.xml /usr/local/tomcat/conf/
ADD tomcat-users.xml /usr/local/tomcat/conf/
ADD target/hello-docker.war /usr/local/tomcat/webapps/

