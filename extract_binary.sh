#!/bin/sh

PWD=$(pwd)

docker run --rm -v $PWD/output:/output moveyourmouse-compile:v0.1.0 cp -r /app/target /output/