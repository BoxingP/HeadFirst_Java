#!/bin/sh
set -e
javac -d ../../../../../../build/classes -cp .:../../../../../../lib/* FizzBuzzWhizzMurmur.java ../../../../../main/java/com/boxing/unit/*.java
java -cp ../../../../../../build/classes:../../../../../../lib/* com.boxing.fizzBuzzWhizzMurmur.FizzBuzzWhizzMurmur 2 3 4 5
