pipeline { 
    agent any 
    stages {
         stage('Build') {
            steps {
                // Set up JDK or use a tool like Maven Tool
                // tool 'Maven'

                // Clean and build the Maven project
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Package the Spring Boot application
                sh 'mvn package'
            }
    }
}