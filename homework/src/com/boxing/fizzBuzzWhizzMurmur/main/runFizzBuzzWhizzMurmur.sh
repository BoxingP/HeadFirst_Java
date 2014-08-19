#!/bin/sh
set -e
javac -d ../../../../../build/classes FizzBuzzWhizzMurmur.java ../../unit/main/*.java
java -cp ../../../../../build/classes com.boxing.fizzBuzzWhizzMurmur.FizzBuzzWhizzMurmur 2 3 4 5
