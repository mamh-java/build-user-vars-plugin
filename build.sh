#!/bin/bash -x
export MAVEN_OPTS="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=8001,suspend=n"
#mvn  -DskipTests=true -s $PWD/../jenkins-core/settings-azure.xml package hpi:run
mvn  -DskipTests=true   package hpi:run

#mvn --batch-mode --show-version --errors -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer.Slf4jMavenTransferListener=warn -s ../jenkins-core/settings-azure.xml --update-snapshots  -Dmaven.test.failure.ignore clean  package

#mvn --batch-mode --errors -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer.Slf4jMavenTransferListener=warn -s /home/jenkins/workspace/uild-user-vars-plugin_PR-15-ZIWPWMRMIWB7HU32OBJMODKYUYWVEWHTGETDPZXRVYYI4TFUBCCQ@tmp/settings-azure.xml --update-snapshots -Dmaven.repo.local=/home/jenkins/workspace/uild-user-vars-plugin_PR-15-ZIWPWMRMIWB7HU32OBJMODKYUYWVEWHTGETDPZXRVYYI4TFUBCCQ@tmp/m2repo -Dmaven.test.failure.ignore clean install
