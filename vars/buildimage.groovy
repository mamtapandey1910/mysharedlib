static builder(params) {
    sh 'docker build -t ${params}'
}
