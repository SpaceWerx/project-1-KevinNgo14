## Employee Reimbursement System 

## Project Description

This project focuses on the interactions between Employee and Managers. Employees submit their pending reimbursements on their Employee Portal 
and the submitted data is stored in the reimbursement table. Managers can view the reimbursement table and choose a select reimbursement to either
approve or deny the reimbursement. The status of the reimbursement is updated in the table.

## Technologies Used
* Git
* Javalin
* Java SE Develpoment Kit 8
* Spring Tool Suite 4
* DBeaver
* Apache Maven
* Visual Studio Code
* HTML
* CSS
* Bootstrap
* JDBC
* AWS RDS
* Javascript
* PostgreSQL
* Postman

## Features
* Register a new user
* Log-in with an account and it will direct to the respective employee/manager portal.
* Create new reimbursement requests as an employee.
* View all reimbursement requests.
* Change the status of a reimbursement request to either approved or denied with a manager account.

To-do list:
* Change the view all reimbursements requests to view reimbursement by Status for manager account.
* Change the view all reimbursemtns reques tto view reimbursement by ID for employee account.
* Fine tune input fields and HTML page apperances to make project more appealing.
* Remove any unncessary comments in code to make code more readable.
* Organize images into a separate folder.
* Adjust CSS values for all HTML pages so that the apperances look well on other type of devices.

## Getting Started
### Installing Git
One of the essential tools used for this projects is Git. To install Git correctly, please follow the instructions below
* First launch your selected browser and head to [Git's Website](https://git-scm.com/download). Select the most stable version for your OS.
![git](https://user-images.githubusercontent.com/65207041/172030116-adfe39e1-f540-4b5f-95e9-d5c40f4d3fb8.PNG)
* Upon confirming with your firewall for installation, there will be a small pop up menu that will display the Git file.
![git1](https://user-images.githubusercontent.com/65207041/172030163-1de1e2ee-7bf1-4af5-bbce-ed2acb018dd7.PNG)
* After launching the installer, the install wizard will guide you through the process.
 ![image](https://user-images.githubusercontent.com/65207041/172030382-e3a5a38f-673d-46f2-8a30-4e9f505576e6.png)
* Accept the default installation path by clicking next
* You will be promoted to select your components. leave everything as default but do select the box to create a desktop icon. Click next until you reach the experimental options(which should be left unchecked).
![image](https://user-images.githubusercontent.com/65207041/172030454-4cad2e62-ef75-4459-b703-95dd7acb7176.png)
![image](https://user-images.githubusercontent.com/65207041/172030463-633bde29-4cbb-47d0-b30a-80d82ae82d95.png)
![image](https://user-images.githubusercontent.com/65207041/172030467-aa868592-be02-4b28-b436-c25a7fc1d82f.png)
![image](https://user-images.githubusercontent.com/65207041/172030476-9a99d2bc-e53d-4f90-804e-c19808c96928.png)
![image](https://user-images.githubusercontent.com/65207041/172030479-201f6afc-afdb-4c38-9d77-d4dd8e4a6743.png)
![image](https://user-images.githubusercontent.com/65207041/172030485-73b28847-dac0-4689-9df8-54b4c77a5df4.png)
### Installing Java
The programming language of this project is in Java. To install Java, please follow the instructions below
Within your browser, access the [Oracle Java download page](https://www.oracle.com/java/technologies/downloads/#java8). If you already 
have an Oracle Account, you can skip the following steps.
![java]![image](https://user-images.githubusercontent.com/65207041/172038164-0783d8aa-962d-4691-9181-b28320c21545.png)
![java1]![image](https://user-images.githubusercontent.com/65207041/172038181-4dc5a549-9603-4843-a915-44c7b6ccdd9b.png)
* After the registration process, check your email for comfirmation
![java2]![image](https://user-images.githubusercontent.com/65207041/172038263-176d488b-b4a2-412a-afec-930bdddb0199.png)
* Return back to [Oracle Java download page](https://www.oracle.com/java/technologies/downloads/#java8).Scroll down and select the appropriate JDk for your OS
![java3]![image](https://user-images.githubusercontent.com/65207041/172038319-578d3bea-a445-4511-bf97-80589e4ea86b.png)
* Next, you will be prompted to accept the license before installing the wizard
![java4]![image](https://user-images.githubusercontent.com/65207041/172038389-2913ccc5-a8be-44be-b76b-54365a8bc8d2.png)
* Click on the wizard, and click on next. Take note of the directory of where java is being installed.
![java5]![image](https://user-images.githubusercontent.com/65207041/172038424-bc05e74c-9218-4f84-80f3-f60818300fbb.png)
* Proceed to click on next and wait for the installation to finish
[java6]![image](https://user-images.githubusercontent.com/65207041/172038679-b7611131-ffb7-4801-aa1e-b2c188e8e479.png)
* Use your system search tool (next to the windows button) to look for "Edit the system environment variables" in the control panel. Be sure that you open the SYSTEM environment not the ones just for your account.
[java7]![image](https://user-images.githubusercontent.com/65207041/172038747-a46d614a-cf49-410c-82ca-a6f9f194959d.png)
* Click the "Environment Variables" button in the window that opens.
[java8](https://user-images.githubusercontent.com/65207041/172038769-070bbce7-e654-4fc3-8a16-cce83834e2f0.png)
* Under "System Variables" click the "New" button.
[java9]![image](https://user-images.githubusercontent.com/65207041/172038792-cb64c228-c5cc-4283-b51e-15482ad9ebb2.png)
* Name the new variable "JAVA_HOME" and give it the value of the directory where your JDK was installed to. (See Step 12.) If you are unsure of your directory path you can go to C:\Program Files\Java in your file explorer then click on the JDK folder to open it. You can then copy the path from the navigation bar at the top of the file explorer.
[java10]![image](https://user-images.githubusercontent.com/65207041/172038809-43ecc444-daf8-4096-b22a-8fe63e9f5947.png)
* In your system variables then select the "Path" variable and click "Edit."
[java11]![image](https://user-images.githubusercontent.com/65207041/172038838-db590446-1115-4d12-b265-840fdce5a33a.png)
* Click "New" to create a new line. Add the path to the JDK bin folder in this line, it will be the same as the path in JAVA_HOME with a "\bin" at the end.
[java12]![image](https://user-images.githubusercontent.com/65207041/172038863-f34935c2-821c-4a3d-8d94-78d901c08b16.png)
* Click ok and open Git Bash. type "java -version". If done correctly, it will list the Java version
[java13]![image](https://user-images.githubusercontent.com/65207041/172038922-24163149-4c8a-4a0e-ad43-9bf10fcdd128.png)

### Installing Spring Tool Suite 4
While there are numerous amount of IDEs, this project utilizied Spring Tool Suite (STS)
* Navigate to the [STS webiste](https://spring.io/tools) to download STS. 
![image](https://user-images.githubusercontent.com/65207041/172039238-d0341d7a-5766-4afe-9606-6a60d4052ebf.png)
* Once the download has finished go to your downloads folder, search for the spring-tool-suite jar file and double click it to begin the install process. NOTE: STS will install to the directory the jar file is in when you open it. If you would like STS to install to another directory than your downloads directory, move the jar file before opening it.
![image](https://user-images.githubusercontent.com/65207041/172039267-dc6be582-eca5-4b0b-b726-a522c04ea455.png)
* Once the install is complete you will have an STS folder in the directory. Double click it to enter it.
![image](https://user-images.githubusercontent.com/65207041/172039276-7db9cf23-d32a-4534-9a4b-5b3afe6dba35.png)
* Once inside the folder double click the SpringToolSuite4 application icon to start STS and ensure it runs correctly. If you encounter any errors check all the path variables you configured in the previous setup guides.
![image](https://user-images.githubusercontent.com/65207041/172039296-115d56ef-2626-41b2-9156-1663a9d337f1.png)

### Installing Maven
* Navigate in your web browser to the [Maven Download Page](https://maven.apache.org/download.cgi) and scroll down to the "Files" section. Click the Binary zip archive link to download. Approve any firewall/security popups asking if you are sure you want to download the file.
![image](https://user-images.githubusercontent.com/65207041/172039354-11e65533-f7b7-4fc6-a0a9-102a54b71057.png)
* The download should appear in your browser. When it completes right-click and click "Show in folder."
![image](https://user-images.githubusercontent.com/65207041/172039375-83bdc4b4-1c1a-4bfa-95e9-9bfe839130fe.png)
* Right click the Maven zip archive you just downloaded and click "Extract All..."
![image](https://user-images.githubusercontent.com/65207041/172039381-accc4d40-0b78-4e04-ad55-36e409951ad7.png)
* Your extraction wizard will open. Set the file path to "C:\Maven" and click the box to show extracted files when complete. Then click "Extract."
![image](https://user-images.githubusercontent.com/65207041/172039391-e75d0994-89bd-43f6-916b-cdf84fa76061.png)
* Your file will be unzipped and your file explore will open a window to C:\Maven containing the folder with your maven version. Double click to open that folder.
![image](https://user-images.githubusercontent.com/65207041/172039408-65968e85-9b1b-4615-afab-3834bf007de1.png)
* Now inside the versions specific folder, click the navigation bar and the top and copy the file path. You will need this for your environment variables.
![image](https://user-images.githubusercontent.com/65207041/172039418-d48a6799-9cbc-4e44-b9be-ee4ce5111b49.png)
* Follow the same procedure mentioned above in [Installing Java](https://github.com/SpaceWerx/project-1-KevinNgo14/edit/main/README.md#installing-java)
* Under "System Variables" click the "New" button.
![image](https://user-images.githubusercontent.com/65207041/172039472-c31420cb-8847-4738-9e25-19890184f56f.png)
* Name the new variable "M2_HOME" and give it the value of the file path you copied in step 7. Then click "OK."
![image](https://user-images.githubusercontent.com/65207041/172039478-705db5c3-1701-4bee-a75e-5f162ef8abc5.png)
Click the new button again. Give the variable the name "M2" and the file path "%M2_HOME%\bin" then click "OK."
![image](https://user-images.githubusercontent.com/65207041/172039482-c160fde6-5c5c-47ee-a34e-8f62783b0f7a.png)
* In your system variables then select the "Path" variable and click "Edit."
![image](https://user-images.githubusercontent.com/65207041/172039488-52f3c735-eef8-4ccb-a2f0-de47e69a2be5.png)
* Click new to open a new line and type in "%M2%" then click "OK."
![image](https://user-images.githubusercontent.com/65207041/172039513-bfc4c848-0ba9-4706-8dbf-b4907d07c1f1.png)
* Click Ok to close the environment variable window.
* Open CMD prompt (or a GitBash terminal) and type mvn --version then hit Enter. If that returns the maven version you have it set up correctly.
![image](https://user-images.githubusercontent.com/65207041/172039540-d8e4f004-1cd2-4c31-9668-b8d960799de1.png)

### Installing PostgreSQL and DBeaver
* Head to [PostgreSQL Site](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads) to install a selected version. This project uses ver 10.21
* Install the wizard and open it after it finishes.
* You'll be presented with several menus in the Setup Wizard.
* Hit "Next" until you get to the "Select Components" menu. Here, you'll want to select and/or deselect the following and then click "Next":
![image](https://user-images.githubusercontent.com/65207041/172039730-7b87e4fa-1332-4365-82b6-921950e24ae6.png)
* Continue to hit "Next" until you reach the "Password" menu. Here you will be tasked with providing a password for the default Postgres user (which is "postgres").
* Set a password for your default postgres user. DO NOT FORGET THIS PASSWORD!!
![image](https://user-images.githubusercontent.com/65207041/172039799-5ec96dae-7b13-4e3d-b6be-f80b28c6487b.png)
* After you've decided on a password, hit "Next" on the remaining menus and allow time for Postgres to be installed. Once the installation is complete, you might be asked if you want to launch Stack Builder. You can say "no".

PostgreSQL should now be successfully installed on your computer.

To instal DBeaver, head to [DBeaver site](https://dbeaver.io/download/)
* Once you click it, you'll notice that there are two options: Community Edition and Enterprise Edition. Please select the Community Edition as it is free. Do NOT select the Enterprise Edition.

* You will find the installers for the Community Edition if you scroll down the page. They should be located directly beneath the the box which says "Community Edition 21.X.X". As with all other software listed here, please make sure that you choose the correct installer for your system. If you're on Windows, you'll most likely click Windows 64 bit installer.

* Once you've clicked on the installer that is compatible with your system, you'll be prompted to save the file. Save it and note where you've saved it on your machine. These files are usually stored in your computer's "Downloads" folder by default.

* Double click the installer. Once you've done so, the installer will be launched. The installer should take you through the process of setting up DBeaver. You'll be asked, for instance, to select a language of choice and review license terms before you install the software.

* When you're prompted to "Choose Users", you may select "For me (...)".

* When you arrive at the portion of the setup which is titled "Choose Components", please select "DBeaver Community", "Inlcude Java, and "Associate .SQL files".
![image](https://user-images.githubusercontent.com/65207041/172039927-d57b428b-7b0f-48b6-9fb2-14457156e59f.png)

### Instaling Postman
* In order to download Postman, please visit [Postman's official website](https://www.postman.com/downloads/).

Once you've navigated to the site, you should see the following:
![image](https://user-images.githubusercontent.com/65207041/172040124-da40a08c-1c61-4e13-8163-91f90cd3fae7.png)
* Note that the default download is for Windows. If you wish to download Postman for Mac or Linux, you should click on one of the links highlighted in the small box beneath the version number and "RELEASE NOTES" link. You can see these links at the bottom of the image provided above for reference.
* Upon double clicking the executable, the installer will be launched and the program will be installed. In order to verify that it has been installed correctly, you can search for "Postman" on your machine by using your search bar.

Note that you'll likely have to sign up for an account to use the application. Please do so as signing up for an account is completely free.
### Installing Visual Studio Code
* In order to download Visual Studio Code, please visit [Visual Studio Code's official website](https://code.visualstudio.com/download).

Once you've navigated to the website, you should see the following:
![image](https://user-images.githubusercontent.com/65207041/172040162-f706c35d-cf30-4c67-9f17-9f78b6cac126.png)
* Choose the installer that is compatible with your system. Once you've clicked the installer of your choice, you'll be prompted to save the file. Do so.
* Double click the installer. Once you've done so, the installer should be launched. Accept the license agreement and proceed until you reach a menu titled "Select Additional Tasks". Once you've arrived here, be sure to check all of the boxes that are checked in the image
![image](https://user-images.githubusercontent.com/65207041/172040178-53d135b9-0322-4ff1-98c5-eb2f7f1bfed1.png)

## Usage
After installing my project, you will need to create a databse connection in DBeaver and Requests in Postman
### Creating a database connection in DBeaver
* Launch DBeaver. Click on the Database tab and there will be an option to create a new database connection
![data1](https://user-images.githubusercontent.com/65207041/172084024-a6d17592-c0fb-4e7b-b00a-bef6a15614e6.PNG)
* A pop up will appear. Select PostgreSQL
![data2](https://user-images.githubusercontent.com/65207041/172084133-9a169da1-1a78-4af7-8f50-f201d4d83e75.PNG)
* After clicking next, it will display connection settings.
![data3](https://user-images.githubusercontent.com/65207041/172084279-f64d535f-e1e9-4acf-a3f4-3dfd3679b42e.PNG)
* In the host field, copy and paste the following end point: javafullstackaws.ceboc7nfkw4e.us-east-1.rds.amazonaws.com
* Additionally in the Authentication setting, input the correct username and password of the RDS(Which in this case should be postgress and password)
* Click on finish.
### Creating a new schema in DBeaver
With the database connected created, you'll have to make a schema next. Go to your newly created database, click on database and the drop down arrow. 
![data4](https://user-images.githubusercontent.com/65207041/172095727-dd4acb51-d80b-4073-aa38-433bf7631ff7.PNG)
* Right click and hover over Create. Select Schema.
![data5](https://user-images.githubusercontent.com/65207041/172095874-3128603e-b435-4f05-9c62-3e31c15ea73f.PNG)
* For this project, name this schema p1schema
If there is no active connection
![data6](https://user-images.githubusercontent.com/65207041/172096391-c6256f1e-2728-4e0f-b763-8d3366d534e6.PNG)
Click on the Select data source button and select your database you're using
![data7](https://user-images.githubusercontent.com/65207041/172096559-47c394f5-7f19-4bba-a0e4-ec1de79c73fa.PNG)
Another way of doing is this is opening the schema folder in database navigator, right clicking the schema you want to work in, and select the option "set as default"

### Creating requests in Postman
In order for the front end to interact with the back end and our database, we'll be using requests and Javascript. 
* Launch Postman. Navigate to File and select New and choose New workspace
![data8](https://user-images.githubusercontent.com/65207041/172097488-a4c724b4-573f-4a97-ae37-ccca9b219968.PNG)
* Name your new creation and right click to add a folder (I named it P1)
![data9](https://user-images.githubusercontent.com/65207041/172097583-f04bb480-5c10-4458-8488-a79298295402.PNG)
* Now with in P1 folder, repeat the process and make folders for User and Reimbursement
* Right click on the User folder and click on the option to add a request. There are different types of request we will be using
![data10](https://user-images.githubusercontent.com/65207041/172097829-027c893a-6f6b-4fb7-b2fe-a807fe2fdb07.PNG)
* In order for the requests to go through, there are several parts you are required to fill out
* Change the request by selecting the drop down menu on the left. Then input the end point. This is presented in the launcher file, so copy and paste.
* Next click on body and change the option to raw. Each request has a different set of arguments passed in order to function.
* Change the raw option to JSON. The following images below show how each requests are set up and the arguments passed.
![image](https://user-images.githubusercontent.com/65207041/172097931-6811da9f-1807-4d36-92ec-f8ddf7833dae.png)
![data12](https://user-images.githubusercontent.com/65207041/172098381-79a5c457-2ce6-49da-9f34-2acd2925e29a.PNG)
![data13](https://user-images.githubusercontent.com/65207041/172098420-ec4c0772-4b4c-46f2-8b3f-a82d1b5619c7.PNG)
![data14](https://user-images.githubusercontent.com/65207041/172098434-97de3c5d-ae14-45d5-be78-5e9c1052d40b.PNG)
![data15](https://user-images.githubusercontent.com/65207041/172098469-616705a1-0baa-4e80-976f-948ca4ceaf37.PNG)
![data16](https://user-images.githubusercontent.com/65207041/172098484-0ebd46ca-ab47-4951-a76a-b49f210abd32.PNG)
![data17](https://user-images.githubusercontent.com/65207041/172098501-365e54e1-ce2e-4687-abae-29b626abaf1b.PNG)
![data18](https://user-images.githubusercontent.com/65207041/172098518-16a65166-b60a-4a16-850e-bd12021368cc.PNG)

### Launching front end funtionality
Now with all that set up, we can now interact with my project! Launch STS and open the project. Click on run and there will be message in the console to notify that you are connected to Javalin. 
Next, open Visual studio and open the front end folder. Start with login.html and hit the F5 button to run it.

## Licenses
* license:	postgresql
* license: 	apache-2.0
