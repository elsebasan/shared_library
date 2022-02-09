Libraries {
    lib('pipeline-library-demo')
}


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
    }
}

/*
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
*/