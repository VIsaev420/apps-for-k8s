# Build
- build npm `npm run build`
- build docker image `docker build . -t morda:0.1.1`

# Deploy to minikube
Prerequisites:
- minikube должен быть запущен
- Выполнены шаги из "Build"

Steps:
- перенос образа в minikube `minikube image load morda:0.1.1`
- применение манифестов в minikube `helm upgrade --debug --install morda ./morda/helm/morda --namespace=default`

# Hints
- При локальной работе может быть запущен только 1 backend, т.к. порт 8080 может использовать только 1 приложение.