#!/bin/sh
set -e
javac -cp .:../../lib/* ../main/*.java FizzBuzzWhizzMurmurTest.java
java -cp .:../../lib/*:../main org.junit.runner.JUnitCore FizzBuzzWhizzMurmurTest
