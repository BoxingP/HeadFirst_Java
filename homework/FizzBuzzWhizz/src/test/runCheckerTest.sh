#!/bin/sh
set -e
javac -cp .:../../lib/* CheckerTest.java ../main/Checker.java
java -cp .:../../lib/*:../main org.junit.runner.JUnitCore CheckerTest
