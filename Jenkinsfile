@Library('shared-library') _

import com.cleverbuilder.CreateFolder
import com.cleverbuilder.GlobalVars

pipeline {
    agent any

    stages {
        stage('set vars'){
            steps { 
                script { 
                    echo 'set vars ..'
                    env.userName = "seba"
                    env.userToken = ""
                    env.folderName = 'prueba2'
                    env.server = 'http://localhost:8080/'
                    env.path = ''
                    env.url = server + path
                }
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        /*
        stage("Interactive_input") {
            steps {
                script {


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
                                    password(defaultValue: 'value', 
                                             description: '', 
                                             name: 'userToken')

                            ])

                    // Save to variables. Default to empty string if not found.
                    env.folderName = userInput.folderName?:''
                    env.userName = userInput.userName?:''
                    env.userToken = userInput.userToken?:''
                }
            }

        }
        */

        stage('SayHello') {
            steps {
                echo 'Hello world'
                //call sayHello from pipeline-library-demo 
                println GlobalVars.foo

                sayHello 'seba'
                sayHello "${env.folderName}"
                sayHello "${env.userName}"
                sayHello "${env.userToken}"
                sayHello "${env.url}"
                println CreateFolder.foor
                script {
                    def folder = new CreateFolder()
                    folder.folderCreate(env.url, env.folderName, env.userName, env.userToken)
                    def person = new SampleClass()
                    person.age = 21
                    person.increaseAge(10)
                    echo 'Incremented age, is now : ' + person.age
                }
                

            }
        }
    }
}
