#!/bin/bash
cd core
sbt "clean" "core118/publish-local" 
cd ..
cd api
sbt "clean" "api118/publish-local" 
cd ..
