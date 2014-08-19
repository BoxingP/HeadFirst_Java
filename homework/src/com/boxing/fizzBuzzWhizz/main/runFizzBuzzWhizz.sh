#!/bin/sh
set -e
javac -d ../../../../../build/classes FizzBuzzWhizz.java ../../unit/main/*.java
java -cp ../../../../../build/classes com.boxing.fizzBuzzWhizz.FizzBuzzWhizz 2 3 5
