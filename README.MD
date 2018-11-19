# Dockerize and deploy a Spring Boot application to Kubernetes

This is an example of how to easily build a Docker image for a Spring Boot application with Jib and deploy it to Kubernetes with `kubectl`.

## Try it yourself

*Make sure you have `kubectl` [configured with a cluster](https://cloud.google.com/kubernetes-engine/docs/how-to/creating-a-cluster).*

```shell
IMAGE=<your image, eg. gcr.io/my-project/jibkubedemo>

./mvnw compile jib:build -Dimage=$IMAGE

kubectl run jibkubedemo --image=$IMAGE --port=8080 --restart=Never

# Wait until pod is running
kubectl port-forward spring-boot-jib 8080 > /dev/null 2>&1 &
```
```shell
curl localhost:8080
> Greetings from Kubernetes!
```

<!-- Run a @springboot app on #Kubernetes in seconds @kubernetesio #jib #java -->
Give it a [![Tweet](https://img.shields.io/twitter/url/http/shields.io.svg?style=social)](https://twitter.com/intent/tweet?text=Run+a+%40springboot+app+on+%23Kubernetes+in+seconds+%40kubernetesio+%23jib+%23java&url=https://github.com/medmes/jibkubedemo)

*For Gradle just run `./gradlew jib --image=$IMAGE` instead.*

## More information

Learn [more about Jib](https://github.com/GoogleContainerTools/jib).
