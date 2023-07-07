pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') { 
            steps { 
                sh echo 'Building...'
                sleep(secs: 5, unit: 'SECONDS')
            }
        }
        stage('Test'){
            steps {
                sh echo 'Testing...'
                
            }
        }
        stage('Deploy') {
            steps {
                sh echo 'Deploying...'
            }
        }
    }
}