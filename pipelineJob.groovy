pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh """
                    sud'o docker-compose up -d
                """
            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
    }
}
