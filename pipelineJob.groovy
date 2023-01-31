pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh """
                    sudo docker-compose up -d
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
