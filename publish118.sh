#!/bin/bash
cd core
sbt7 core118/clean core118/package  core118/publish
cd ..
cd api
sbt7 api118/clean api118/package api118/publish
cd ..
