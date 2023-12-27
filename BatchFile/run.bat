set projectlocation=E:\Selenium\Maven\TestMavenProjectForLearning1

cd %projectlocation%

set classpath=%projectlocation%\bin;%projectlocation%\BatchFile\*

java -cp TestingMaven2.jar mavenTest.Test01

pause