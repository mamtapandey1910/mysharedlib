static builder(){
    withDockerRegistry([credentialsId: 'Dockerhub', url: 'docker.io/mamtapandey'])
    sh 'docker pull "hello-world"'
}
