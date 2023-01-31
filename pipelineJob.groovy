pipeline {
    agent any
    environment {
        PATH = "$PATH:/usr/bin"
    }
    stages {
        stage('Build') {
            steps {
                sh '''
                    docker version
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
