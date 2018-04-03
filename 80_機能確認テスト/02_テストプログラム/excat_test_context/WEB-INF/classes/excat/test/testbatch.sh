#!/bin/sh

export CLASSPATH=/wzhou_app/jboss4/excat_test_context/WEB-INF/classes
export CLASSPATH=$CLASSPATH;/wzhou_app/jboss4/excat_test_context/WEB-INF/lib/javax.servlet.jar
export JAVA_HOME=/j2sdk1.4.2_08
export JAVA_OPTS=" -Xms128m -Xmx512m -Dos.name=linux -Dfile.separator=/ -Dexcat.home=/excat -Dexcat.test.context=/wzhou_app/jboss4/excat_test_context"


$JAVA_HOME/bin/java -Xbootclasspath/a:"/excat/DumpStack" -Dsun.boot.library.path="$JAVA_HOME/jre/bin;/excat/DumpStack" -Xdebug -Xnoagent $JAVA_OPTS -classpath $CLASSPATH excat.test.TestEntry

