pipeline {
    agent any
    environment {
        PATH = "$PATH:/usr/bin"
    }
    stages {
        stage('Build') {
            steps {
                sh '''
                    sudo docker-compose up -d
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
