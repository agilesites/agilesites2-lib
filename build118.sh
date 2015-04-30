#!/bin/bash
cd core
sbt7 "core118/publish-local" "core118/publishM2"
cd ..
cd api
sbt7 "api118/publish-local" "api118/publishM2"
cd ..
