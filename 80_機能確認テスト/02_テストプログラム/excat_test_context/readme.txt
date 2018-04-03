Excatのテストプログラムを実行するため、
以下JVM起動パラメーターを登録する必要がある。
１）Excatのインストール先を登録
-Dexcat.home=""

２）テストプログラムの置く場所を登録
-Dexcat.test.context=""

例Tomcat上動作する場合：
catalina.batに設定する
-Xbootclasspath/a:"c:\wzhou_app\excat\DumpStack" -agentlib:DumpStack -Dexcat.home="C:\wzhou_app\excat" -Dexcat.test.context="C:\wzhou_app\apache-tomcat-5.5.17\webapps\excat_test_context"


コンパイル注意点：
下記三つのファイルに関して、コンパイル時、-g:none　パラメーターを付けて行って下さい。
（例：javac -g:none TestCase21_3.java -cp C:\wzhou_app\jboss4\excat_test_context\WEB-INF\classes ）

TestCase21_1.java
TestCase21_2.java
TestCase21_3.java
