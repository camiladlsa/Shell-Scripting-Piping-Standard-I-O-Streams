#!/bin/bash

# Compile Java program
javac ./Exercise111.java
javac ./Exercise121.java
javac ./Exercise131.java

# Execute Java program
java Exercise111 $1 | java Exercise121 | java Exercise131

# Echo Java program exit code
echo "Java program exit code was ${?}."
echo # Newline