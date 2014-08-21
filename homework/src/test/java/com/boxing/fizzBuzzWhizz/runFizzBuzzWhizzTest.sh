#!/bin/sh
set -e
javac -d ../../../../../../build/classes -cp :../../../../../../lib/* FizzBuzzWhizzTest.java ../../../../../main/java/com/boxing/fizzBuzzWhizz/*.java ../../../../../main/java/com/boxing/unit/*.java
java -cp .:../../../../../../lib/*:../../../../../../build/classes org.junit.runner.JUnitCore com.boxing.fizzBuzzWhizz.FizzBuzzWhizzTest
