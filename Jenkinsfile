@Library('pipeline-library-demo')


pipeline {
    agent any
    stages {
        stage('Demo') {
            steps {
                echo 'Hello world'
                //call sayHello from pipeline-library-demo 
                sayHello 'seba'
            }
        }
    }
}