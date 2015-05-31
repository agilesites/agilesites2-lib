#!/bin/bash
cd core
sbt7 "core118/publish-local" 
cd ..
cd api
sbt7 "api118/publish-local" 
cd ..
