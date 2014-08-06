#!/bin/sh
set -e
javac -cp ../../lib/junit-4.11.jar CheckerTest.java ../main/Checker.java
java -cp .:../../lib/junit-4.11.jar:../../lib/hamcrest-core-1.3.jar:../main org.junit.runner.JUnitCore CheckerTest
