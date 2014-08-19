#!/bin/sh
set -e
javac -d ../../../../../build/classes -cp :../../../../../lib/* InputAndOutputTest.java ../main/InputAndOutput.java
java -cp .:../../../../../lib/*:../../../../../build/classes org.junit.runner.JUnitCore com.boxing.unit.InputAndOutputTest
