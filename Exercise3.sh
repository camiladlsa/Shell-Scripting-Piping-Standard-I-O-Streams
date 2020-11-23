#!/bin/bash

# Compile Java program
javac ./Hello.java

# Execute Java program
java Hello $1

# Echo Java program exit code
echo "Java program exit code was ${?}."
echo # Newline