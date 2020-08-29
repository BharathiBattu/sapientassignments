Leveraing Local Copy of maven within the project
------------------------------------------------
Maven local repository is located in the local computer system.it is created by maven when the user runs any maven command. 
The default location is %USER_HOME%/.m2 directory. 
When maven build is executed, Maven automatically downloads all the dependency jars into the local repository. 
For new version maven will download automatically. If version declared in the dependency tag in POM.xml file it simply uses it without downloading.
By default, maven creates local repository under %UESR_HOME% directory.

Update and Setting the Maven Local Repository:

To update, find this file {MAVEN_HOME}\conf\settings.xml

And to set, use following code:

Code:

<settings>
<localRepository>/path/to/local/repo/</localRepository>
</settings>

The default value or the path is: ${user.home}/.m2/repository.


Advantages:
-----------
Reduced version conflict.
Less manual intervention for the first time build process.
Single central reference repository for all dependent software libraries rather than several independent local libraries.
Fasten the clean build process while using local repositories.
