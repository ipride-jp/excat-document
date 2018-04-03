@echo off
set JAVA_HOME=C:\jdk1.5.0_06
set JBossHome=C:\wzhou_app\jboss4
"%JAVA_HOME%\bin\jar.exe" -cvf excat_test_context.war WEB-INF
"%JAVA_HOME%\bin\jar.exe" -uvf excat_test_context.war link
"%JAVA_HOME%\bin\jar.exe" -uvf excat_test_context.war testcase
"%JAVA_HOME%\bin\jar.exe" -uvf excat_test_context.war testresult


copy excat_test_context.war "%JBossHome%\server\default\deploy"


