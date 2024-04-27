#!/bin/sh

PWD=$(pwd)
export PATH_MY_SCRIPT=$PWD/scripts-utils-containers

source $PWD/scripts-utils-containers/build.sh -V -n MoveYourMouse -d $PWD/docker/Dockerfile.compile