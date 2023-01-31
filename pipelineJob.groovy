pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build'
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
