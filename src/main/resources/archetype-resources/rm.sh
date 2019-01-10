#!/usr/bin/env bash

noneImageIds=$(docker images -f "dangling=true" -q)

if [[ ${noneImageIds} ]]; then
  docker rmi ${noneImageIds}
fi