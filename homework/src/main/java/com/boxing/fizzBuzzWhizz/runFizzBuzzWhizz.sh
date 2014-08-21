#!/bin/sh
set -e
javac -d ../../../../../../build/classes -cp .:../../../../../../lib/* FizzBuzzWhizz.java ../../../../../main/java/com/boxing/unit/*.java
java -cp ../../../../../../build/classes:../../../../../../lib/* com.boxing.fizzBuzzWhizz.FizzBuzzWhizz 2 3 5
