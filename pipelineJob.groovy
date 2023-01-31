pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo ''
                shell('sudo docker-compose up -d')
            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
    }
}
