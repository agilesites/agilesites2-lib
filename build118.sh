#!/bin/bash
cd core
sbt7 "clean" "core118/publish-local" 
cd ..
cd api
sbt7 "clean" "api118/publish-local" 
cd ..
