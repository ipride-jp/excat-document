@echo off
set JAVA_HOME="C:\jdk1.5.0_06"
set CLASSPATH="C:\wzhou_app\jboss4\excat_test_context\WEB-INF"

cd %CLASSPATH%\classes\excat\test\

cmd /C del *.class

%JAVA_HOME%\bin\javac -encoding MS932 -g -classpath %CLASSPATH%\classes;%CLASSPATH%\lib\javax.servlet.jar *.java
%JAVA_HOME%\bin\javac -encoding MS932 -g:none -classpath %CLASSPATH%\classes\ TestCase21_1.java
%JAVA_HOME%\bin\javac -encoding MS932 -g:none -classpath %CLASSPATH%\classes\ TestCase21_2.java
%JAVA_HOME%\bin\javac -encoding MS932 -g:none -classpath %CLASSPATH%\classes\ TestCase21_3.java

