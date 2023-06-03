# Introduction
Репозиторий, содержащий код, для установки в k8s.

### hello-world, what-time-is-it - backend applications
- Папка src - содержит код spring приложения
- Папка deploy - содержит манифесты, необходимые для установки приложения в k8s

### morda - frontend application
- Папка src - содержит код react приложения
- Папка deploy - содержит манифесты, необходимые для установки приложения в k8s

# Steps to success
- Выполнить пункт "Build" для каждого микросервиса
- Запустить minikube `minikube start`
- Выполнить шаги из "Deploy to minikube" для каждого микросервиса (сначала устанавливаются backend приложения, потом frontend приложение)
- Выполнить `minikube tunnel` и не закрывать терминал, где выполнялась эта команда
- Написать в браузере `localhost:3000/`

# Hints
- По умолчанию устанавливается default namespace
- `kubectl get po` - отобразить все поды
- `kubectl get svc` - отобразить все сервисы
- `kubectl logs <pod name>` - отобразить логи пода
- `kubectl delete all --all` - удалить все применённые манифесты
- `kubectl delete all -l app=morda` - удалить все ресурсы, у которых label app=morda
- `minikube image list` - список image внутри minikube
- `minikube image rm <image name>` - удалить image из minikube
- `minikube dashboard --url` - для любителей UI
- `minikube stop` - остановка minikube (конфигурация сохраняется)