#!/bin/sh
javac -cp ../../lib/junit-4.11.jar NumberChangerTest.java ../main/NumberChanger.java
java -cp .:../../lib/junit-4.11.jar:../../lib/hamcrest-core-1.3.jar:../main org.junit.runner.JUnitCore NumberChangerTest
