kind create cluster --config kind-config.yml
docker compose -f docker-compose.yml up -d
./gradlew clean build
docker build . -t soldat2d/k8s-test
docker run -ti --rm soldat2d/k8s-test
docker rmi soldat2d/k8s-test
docker login
docker push soldat2d/k8s-test
docker run -ti --rm -e DATASOURCE_HOST=192.168.8.212 -p 8081:8080 soldat2d/k8s-test