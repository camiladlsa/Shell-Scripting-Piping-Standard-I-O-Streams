#!/bin/bash

if [ -z "$1" ]
then
    echo "Error code 100"
    exit 100
else
    echo "Hola $1"
fi
exit 0
