pipeline {
    agent any
    environment {
        PATH = "$PATH:/usr/bin/docker-compose"
    }
    stages {
        stage('Build') {
            steps {
                sh '''
                    docker-compose up -d
                '''
            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
    }
}
