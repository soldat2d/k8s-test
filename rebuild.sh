kubectl delete deployments k8s-test-deployment
kubectl delete service k8s-service
kubectl delete ingress k8s-ingress
kubectl apply -f k8s/deployment.yml
kubectl apply -f k8s/service.yml
kubectl apply -f k8s/ingress.yml
kubectl get pods
kubectl get services
kubectl get ingress
