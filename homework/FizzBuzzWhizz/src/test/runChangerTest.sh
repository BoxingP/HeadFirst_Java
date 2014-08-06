#!/bin/sh
set -e
javac -cp ../../lib/junit-4.11.jar:../../lib/hamcrest-all-1.3.jar ChangerTest.java ../main/Changer.java
java -cp .:../../lib/junit-4.11.jar:../../lib/hamcrest-all-1.3.jar:../../lib/hamcrest-core-1.3.jar:../main org.junit.runner.JUnitCore ChangerTest
