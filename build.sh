#!/bin/sh

PWD=$(pwd)
export PATH_MY_SCRIPT=$PWD/scripts-utils-containers

DOCKERFILE_COMPILE=$PWD/docker/Dockerfile.compile

source $PWD/scripts-utils-containers/build.sh -V -n moveyourmouse-compile -d $DOCKERFILE_COMPILE