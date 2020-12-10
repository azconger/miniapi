#!/usr/bin/env bash

IMAGE=zconger/miniapi
VERSION=$(cat ./VERSION)

docker build . -t "${IMAGE}"
docker tag "${IMAGE}" "${IMAGE}:${VERSION}"
docker push "${IMAGE}"
docker push "${IMAGE}:${VERSION}"
