@echo off
set JAVA_HOME=C:\jdk1.5.0_06
set JBossHome=C:\wzhou_app\jboss4
"%JAVA_HOME%\bin\jar.exe" -cvf excat_test_context.jar excat



rem copy excat_test_context.war "%JBossHome%\server\default\deploy"


