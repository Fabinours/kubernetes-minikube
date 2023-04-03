
# E5FI - Virtualisation -  Project
By Fabien Courtois & Julien Faidide

https://github.com/Fabinours/kubernetes-minikube
## Docker Hub Images
Front-end : 
https://hub.docker.com/r/fabiencrts/front-end

Back-end : 
https://hub.docker.com/r/fabiencrts/back-end

## Commands / Test
Initialization : 

 - Lancer Docker Desktop
    
 - `minikube start`

Déployment and services
    
    kubectl apply -f front-back-app.yml

`minikube tunnel`

 Test it on : http://virtu-project.info/
 After editing your etc/hosts file

## Description

Our project is a sample portfolio website, with a pretty front-end, a simple back-end and a cluster gateway.

![Alt text](websitePreview.png?raw=true "Website Preview")

The data returned by the back-end modify the `<title>` HTML element of the front-end. This corresponds to the title of the tab in the web browser.
If the backend can't be accessed, the `<title>` HTML element is set to "...".

![Alt text](titleTab.png?raw=true "Website Preview")

The cluster gateway is set to "virtu-projet.info". It must be configured in the etc/host file of your OS.

All of the project has been configured to work with Docker and Kubernetes : 2 services (front-end and back-end)

## Google Skill Boost Activities

![Alt text](googleSkillBoostFabien.png?raw=true "Résultats Google Skill Boost - Fabien Courtois")

![Alt text](googleSkillBoostJulien.png?raw=true "Résultats Google Skill Boost - Julien Faidide")


