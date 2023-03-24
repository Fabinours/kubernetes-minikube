
# E5FI - Virtualisation -  Project
By Fabien Courtois & Julien Faidide
## Useful links
Docker Hub Image
https://hub.docker.com/r/fabiencrts/virtu-project


## Commands / Test
Initialization : 

 - Lancer Docker Desktop
    
 - `minikube start`

Déploiement
    
    kubectl apply -f myservice-deployment.yml
Service

 - `kubectl apply -f myservice-service.yml`
 ou
 - `kubectl apply -f myservice-loadbalancing-service.yml`


`minikube tunnel`

 Test it on : http://virtu-project.info/
 After editing your etc/hosts file


