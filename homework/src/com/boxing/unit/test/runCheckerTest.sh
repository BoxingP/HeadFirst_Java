#!/bin/sh
set -e
javac -d ../../../../../build/classes -cp :../../../../../lib/* CheckerTest.java ../main/*.java
java -cp .:../../../../../lib/*:../../../../../build/classes org.junit.runner.JUnitCore com.boxing.unit.CheckerTest
