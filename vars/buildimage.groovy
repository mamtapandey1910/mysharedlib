static builder(params) {
    withCredentials([usernamePassword(credentialsId: 'myregistry-login', passwordVariable: 'mamtapandey@587', usernameVariable: 'mamtapandey')])
    sh 'docker build -t ${params} .'
}
