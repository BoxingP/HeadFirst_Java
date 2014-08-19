#!/bin/sh
set -e
javac -d ../../../../../build/classes -cp :../../../../../lib/* FizzBuzzWhizzTest.java ../main/*.java ../../unit/main/*.java
java -cp .:../../../../../lib/*:../../../../../build/classes org.junit.runner.JUnitCore com.boxing.fizzBuzzWhizz.FizzBuzzWhizzTest
