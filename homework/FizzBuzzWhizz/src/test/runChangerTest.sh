#!/bin/sh
set -e
javac -cp :../../lib/* ChangerTest.java ../main/Changer.java
java -cp .:../../lib/*:../main org.junit.runner.JUnitCore ChangerTest
