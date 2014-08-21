#!/bin/sh
set -e
javac -d ../../../../../../build/classes -cp :../../../../../../lib/* ChangerTest.java ../../../../../main/java/com/boxing/unit/Changer.java
java -cp .:../../../../../../lib/*:../../../../../../build/classes org.junit.runner.JUnitCore com.boxing.unit.ChangerTest
