@Library('pipeline-library-demo') _


pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage("Interactive_input") {
          steps {
            script {
              env.USERNAME = input message: 'Please enter the username',
                                parameters: [string(defaultValue: '',
                                             description: '',
                                             name: 'Username')]
            }
            echo "Username: ${env.USERNAME}"
            sayHello '${env.USERNAME}'

          }
        }
        stage('SayHello') {
            steps {
                echo 'Hello world'
                //call sayHello from pipeline-library-demo 
                sayHello 'seba'
                sayHello '${env.USERNAME}'
            }
        }

    }
}
