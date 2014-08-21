#!/bin/sh
set -e
javac -d ../../../../../../build/classes -cp :../../../../../../lib/* FizzBuzzWhizzMurmurTest.java ../../../../../main/java/com/boxing/fizzBuzzWhizzMurmur/*.java ../../../../../main/java/com/boxing/unit/*.java
java -cp .:../../../../../../lib/*:../../../../../../build/classes org.junit.runner.JUnitCore com.boxing.fizzBuzzWhizzMurmur.FizzBuzzWhizzMurmurTest
