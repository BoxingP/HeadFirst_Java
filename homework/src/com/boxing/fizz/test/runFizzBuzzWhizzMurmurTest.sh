#!/bin/sh
set -e
javac -d ../../../../../build/classes -cp :../../../../../lib/* FizzBuzzWhizzMurmurTest.java ../main/*.java
java -cp .:../../../../../lib/*:../../../../../build/classes org.junit.runner.JUnitCore com.boxing.fizz.FizzBuzzWhizzMurmurTest
