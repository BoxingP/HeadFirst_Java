#!/bin/sh
set -e
javac -cp .:../../lib/* ../main/*.java FizzBuzzWhizzTest.java
java -cp .:../../lib/*:../main org.junit.runner.JUnitCore FizzBuzzWhizzTest
