# Build
- build jar `mvn clean package`
- build docker image `docker build . -t hello-world:0.1.1`

# Deploy to minikube
Prerequisites:
- minikube должен быть запущен
- Выполнены шаги из "Build"

Steps:
- перенос образа в minikube `minikube image load hello-world:0.1.1`
- применение манифестов в minikube `helm upgrade --debug --install hello-world ./hello-world/helm/hello-world --namespace=default`