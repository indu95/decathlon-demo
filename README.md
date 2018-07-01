# decathlon-demo
(SPRING BOOT+ANGULARJS+MONGODB)
A demo spring boot app created for order creation and status updation of a sports store

spring boot is configured to run on a external tomcat server
Front end AngularJS is used and http REST call is made to spring controller

MongoDB is used to store the order details.
Before running the app on server ensure mongod is running and check for the port and host
Currently the app is configured to run if mongo is running on mongoHost = "127.0.0.1", mongoPort = "27017" and\
  if mongo is running on different host or port necesarry changes should be done to MongoDBConfig.java file in config pacakage.
  
To run the app follow below steps:
   1)Ensure mongod is up and running
   
   2)If project is cloned and present in IDE, maven clean install and add it to tomcat server and start it.
     OR
    If no IDE is present we can run the app through WAR file. Go to target folder and copy the WAR file and paste it in local apache      
    tomcat webapp folder path like "C:\Program Files\Apache Software Foundation\Apache Tomcat 8.0.27\webapps".
    Then open command prompt navigate to tomcat /bin folder and run the command "catalina.bat run"
    
   3)Once the tomcat server is started, hit the URL " http://localhost:8080/decathlon/home " 
   change the port according to your tomcat HTTP port.
   
 
   
   

