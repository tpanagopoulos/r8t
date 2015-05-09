FROM centos:7

RUN yum -y update
RUN yum -y upgrade

RUN yum -y install wget
RUN yum -y install tar 

# Prepare environment 
# ENV JAVA_HOME /opt/java
# ENV CATALINA_HOME /opt/tomcat 
ENV JAVA_HOME /opt/jdk1.8.0_45
ENV CATALINA_HOME /opt/apache-tomcat-8.0.22
ENV PATH $PATH:$JAVA_HOME/bin:$CATALINA_HOME/bin

VOLUME $CATALINA_HOME/logs

WORKDIR /opt/

# Install java 8
RUN wget --no-cookies --no-check-certificate --header "Cookie: oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u45-b14/jdk-8u45-linux-x64.tar.gz"
RUN tar xf jdk-8u45-linux-x64.tar.gz
# RUN ln -s /opt/jdk1.8.0_45 /opt/java

# Install tomcat 8
RUN wget --no-cookies --no-check-certificate --header "Cookie: oraclelicense=accept-securebackup-cookie" "http://apache.otenet.gr/dist/tomcat/tomcat-8/v8.0.22/bin/apache-tomcat-8.0.22.tar.gz"
RUN tar xf apache-tomcat-8.0.22.tar.gz
# RUN ln -s /opt/apache-tomcat-8.0.22 /opt/tomcat

WORKDIR $CATALINA_HOME

#RUN rm -rf $CATALINA_HOME/webapps/*
ADD target/r8t-0.0.1-SNAPSHOT.war $CATALINA_HOME/webapps/r8t.war

EXPOSE 8080

CMD $CATALINA_HOME/bin/catalina.sh run
