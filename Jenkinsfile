@Library('pipeline-library-demo') _


pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
        stage('SayHello') {
            steps {
                echo 'Hello world'
                //call sayHello from pipeline-library-demo 
                sayHello 'seba'
            }
        }

    }
}
