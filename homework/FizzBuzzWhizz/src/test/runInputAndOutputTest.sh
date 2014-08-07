#!/bin/sh
set -e
javac -cp .:../../lib/*:../main InputAndOutputTest.java
java -cp .:../../lib/*:../main org.junit.runner.JUnitCore InputAndOutputTest
