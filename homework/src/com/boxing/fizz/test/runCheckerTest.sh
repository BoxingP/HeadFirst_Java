#!/bin/sh
set -e
javac -d ../../../../../build/classes -cp :../../../../../lib/* CheckerTest.java ../main/Checker.java
java -cp .:../../../../../lib/*:../../../../../build/classes org.junit.runner.JUnitCore com.boxing.fizz.CheckerTest
