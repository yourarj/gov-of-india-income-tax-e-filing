
Secured e-Filing WebServices
=============================

Requirements
------------

1) Make sure that your JAVA_HOME environment variable is set to the newly installed 
   JDK location, and that your PATH includes %JAVA_HOME%\bin (windows) or 
   $JAVA_HOME$/bin (unix).
   
   
Initial Setup
-------------

* Import this folder to workspace

* To Set the UserName:

	Open the respective ClientConfig.xml in the endpoint package. 
	Under the tag jaxws:client/jaxws:properties/entry with key as "ws-security.username" , 
	provide the UserName in value field.
	
	Ex: <entry key="ws-security.username" value="UserName" />
	
	NOTE: UserName is the UserID as registered in the e-Filing portal.
	

* To Set the Password:

	Open the src/common/SecWsPasswordCallback.java file. 
	Provide the UserName and Password as key-value pair to passwords Map.
	
	Ex:  passwords.put("UserName", "Password");
	

* To set the Client key store:
	
	- Copy your private keystore to path src/keystore/client.
	- Open the src/properties/Client_Sign.properties file.
	  Provide the password, alias and filepath of your keystore.


Getting Started
---------------
 Open the <WebServiceName>_Client.java file under each WebService package.
 
 In the main() method, set the Request values as per the particular webservice.

 Run the method as Java Application to get Response.
	

Generating Java class from wsdl
-------------------------------
In case if you want to generate the Java class files from the wsdl, please follow the below steps -->

1) Create a folder (for a particular web service)  where you want to get generated Java class files from wsdl.

2) Open the cmd prompt. Change the directory where you have created the new folder. 
   Copy and run the below command.
   
   wsimport -keep WSDL_URL -p PACKAGE_NAME -d FOLDER_NAME
   
   For example: 
   wsimport -keep https://incometaxindiaefiling.gov.in/e-FilingSecWS/ditsecws/PanQueryService?wsdl -p panQueryService -d panQueryService

