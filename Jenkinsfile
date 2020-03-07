node('master') {
    stage('Source') {
        git 'https://github.com/fjspitz/spring-batch-dashboard'
    }
    stage('Build') {
        sh 'mvn clean install'
    }
}
