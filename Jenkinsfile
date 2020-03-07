node('master') {
    stage('Source') {
        git 'https://github.com/fjspitz/spring-batch-dashboard'
    }
	
	withEnv(['MYSQL_USER=user_bp','MYSQL_PASSWORD=thepassword', 'MYSQL_URL=jdbc:mysql://localhost:3306/batch_payments']) {
    	stage('Build') {
			echo "User is ${MYSQL_USER}"
        	sh 'mvn clean install'
    	}
	}
}
