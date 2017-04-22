# Basic Java EE Web Application
## Using Servlet/JSP technologies
### Concepts used
- HttpServlet, Request Parameters, Request Disptaching, Scriplets, Scriplet experessions, EL (expression language)
- Maven, Maven plugins - compiler, javaee spec, maven war, tomcat

### Steps to run this Application
- git clone the project
- right click on project -> Run As -> Maven build.. -> Goals => "tomcat7:run"

### Steps on how this application is created
- In eclipse Package Explorer right click -> new->Project -> maven project -> create a simple project
  -> select war for packaging
- In pom.xml, added plugins for maven compiler, maven war, tomcat, javaee and servlts
- In web.xml, specified entry point 
- Created servlets that extends HttpServlet 
- Created jsps, requests to jsps are forward by Servlet Controllers via RequestDisPatcher

### Installation resources
- eclipse -> http://www.eclipse.org/downloads/
- eclipse installation trouble shooting -> https://wiki.eclipse.org/Eclipse/Installation
- Java SDK-> http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- Maven ->  https://maven.apache.org/
- Updating environment variables
  update your PATH variable like below
  export PATH=$PATH:/user/jramamoorthy/maven_dir/apache-maven/apache-maen-3.0/bin
  export PATH=$PATH:/user/jramamoorthy/java_dir/jdk-7u45-macosx-x64/Contents/Home/bin
  make sure JAVA_HOME is set to jdk as below example
  export JAVA_HOME=/user/jramamoorthy/java_dir/jdk-7u45-macosx-x64/
 