pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh """
                    docker compose up -d
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
