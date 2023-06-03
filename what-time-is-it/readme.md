# Build
- build jar `mvn clean package`
- build docker image `docker build . -t what-time-is-it:0.1.1`

# Deploy to minikube
Prerequisites:
- minikube должен быть запущен
- Выполнены шаги из "Build"

Steps:
- перенос образа в minikube `minikube image load what-time-is-it:0.1.1`
- применение манифестов в minikube `helm upgrade --debug --install what-time-is-it ./what-time-is-it/helm/what-time-is-it --namespace=default`