#!/bin/sh
set -e
javac -cp .:../../lib/* ConverterTest.java ../main/Converter.java
java -cp .:../../lib/*:../main org.junit.runner.JUnitCore ConverterTest
