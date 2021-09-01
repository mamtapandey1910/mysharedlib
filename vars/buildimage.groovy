static builder() {
    withCredentials([usernamePassword(credentialsId: 'myregistry-login', passwordVariable: 'mamtapandey@587', usernameVariable: 'mamtapandey')])
    sh 'docker run hello-world '
}
