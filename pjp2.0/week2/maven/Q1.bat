ECHO OFF
ECHO ".............................OUTPUT............................................"
cd C:\Users\Bharathi\projects\sapientassignments\pjp2.0\week2\maven
::We can list all goals bound to a specific phase and their plugins using the command : mvn help:describe -Dcmd=PHASENAME
mvn help:describe -Dcmd=compile
PAUSE