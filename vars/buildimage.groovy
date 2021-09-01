static builder(Map params){
    withCredentials([usernamePassword(credentialsId: 'myregistry-login', passwordVariable: 'mamtapandey@587', usernameVariable: 'mamtapandey')])
    sh 'docker run ${params.name}'
}
