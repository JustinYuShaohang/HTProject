This is sprint boot application with rest controller 
displaying text message
Whenever the code is committed and pushed to github
it will trigger the ci pipeline workflows as specified in
the ci.yml file.
It will compile, then build the docker image and then
push the docker image to the Dockerhub.

- To build project locally
  gradlew build (windows)
  gradle build (macOs)  
  
The local url is: http://localhost:8080/
It should show "Welcome to this page"


  
-build docker image, execute from root
docker build -t {image name}

- to pull the docker image from docker hub
  
  docker pull justinyushaohang/ht-project-image:latest
  
  