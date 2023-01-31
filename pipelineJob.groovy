pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh ''''
                    docker compose version
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
