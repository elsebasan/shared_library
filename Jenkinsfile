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

                    // Variables for input
                    def inputConfig
                    def inputTest

                    // Get the input
                    def userInput = input(
                            id: 'userInput', message: 'Enter path of test reports:?',
                            parameters: [

                                    string(defaultValue: 'None',
                                            description: 'Path of config file',
                                            name: 'Config'),
                                    string(defaultValue: 'None',
                                            description: 'Test Info file',
                                            name: 'Test'),
                            ])

                    // Save to variables. Default to empty string if not found.
                    env.inputConfig = userInput.Config?:''
                    inputTest = userInput.Test?:''

                    // Echo to console
                    echo("IQA Sheet Path: ${env.inputConfig}")
                    echo("Test Info file path: ${inputTest}")
                    sayHello "${inputConfig}"
                }
            }

        }


        stage("Interactive_input 2") {
            steps {
                script {

                    // Variables for input
                    def inputConfig
                    def inputTest

                    // Get the input
                    def userInput = input(
                            id: 'userInput', message: 'Ingresar los valores solicitados:?',
                            parameters: [

                                    string(defaultValue: 'None',
                                            description: 'Nombre del folder a crear',
                                            name: 'folderName'),
                                    string(defaultValue: 'None',
                                            description: 'usuario',
                                            name: 'userName'),
                                    string(defaultValue: 'None',
                                            description: 'token',
                                            name: 'userToken'),



                            ])

                    // Save to variables. Default to empty string if not found.
                    env.folderName = userInput.folderName?:''
                    env.userName = userInput.userName?:''
                    env.userToken = userInput.userToken?:''
                }
            }

        }

        stage('SayHello') {
            steps {
                echo 'Hello world'
                //call sayHello from pipeline-library-demo 
                sayHello 'seba'
                sayHello "${env.folderName}"
                sayHello "${env.userName}"
                sayHello "${env.userToken"

            }
        }
        

    }
}
