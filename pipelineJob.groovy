pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo ''
                shell('echo docker compose up -d')
            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
    }
}
