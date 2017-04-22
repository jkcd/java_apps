# Basic Java EE Web Application
## Using Servlet/JSP technologies
### Concepts used
- HttpServlet, Request Parameters, Request Disptaching, Scriplets, Scriplet experessions, EL (expression language)
- Maven, Maven plugins - compiler, javaee spec, maven war, tomcat

## Steps to run this Application
- git clone the project
- right click on project -> Run As -> Maven build.. -> Goals => "tomcat7:run"

## Steps on how this application is created
- In eclipse Package Explorer right click -> new->Project -> maven project -> create a simple project
  -> select war for packaging
- In pom.xml, added plugins for maven compiler, maven war, tomcat, javaee and servelts
- In web.xml, specified entry point 
- Create servlets that extends HttpServlet 
- Created jsps, requests to jsps are forward by Servlet Controllers via RequestDisPatcher

 