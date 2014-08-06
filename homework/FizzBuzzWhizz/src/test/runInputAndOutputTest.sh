#!/bin/sh
set -e
javac -cp .:../../lib/junit-4.11.jar:../../lib/mockito-all-1.9.5.jar:../main InputAndOutputTest.java
java -cp .:../../lib/junit-4.11.jar:../../lib/hamcrest-core-1.3.jar:../../lib/mockito-all-1.9.5.jar:../main org.junit.runner.JUnitCore InputAndOutputTest
