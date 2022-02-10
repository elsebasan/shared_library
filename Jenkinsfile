@Library('shared-library') _

//import com.cleverbuilder.GlobalVars
////import com.cleverbuilder.SampleClass

def myVar = 'initial_value'

pipeline {
  agent any
  stages {
    stage('one') {
      steps {
        echo "1.1. ${myVar}" // prints '1.1. initial_value'
        sh 'echo hotness > myfile.txt'
        script {
          // OPTION 1: set variable by reading from file.
          // FYI, trim removes leading and trailing whitespace from the string
          myVar = readFile('myfile.txt').trim()
        }
        echo "1.2. ${myVar}" // prints '1.2. hotness'
      }
    }
    stage('two') {
      steps {
        echo "2.1 ${myVar}" // prints '2.1. hotness'
        sh "echo 2.2. sh ${myVar}, Sergio" // prints '2.2. sh hotness, Sergio'
      }
    }
    // this stage is skipped due to the when expression, so nothing is printed
    stage('three') {
      when {
        expression { myVar != 'hotness' }
      }
      steps {
        echo "three: ${myVar}"
      }
    }
  }
}





/* 
pipeline {
    agent any

    environment {
        py2Ana="DEFAULT"
        SERVER="http://localhost:8080"
        FOO = "Bar"
    }
    stages {
        stage("Env Variables") {
            environment {
                FOLDERNAME="NombreFolder2222"
            }

            steps {
                echo "FOLDERNAME = ${env.FOLDERNAME}" // prints "FOLDERNAME = NOMBREfolder2"
                echo "SERVER = ${env.SERVER}" // prints "SERVER = localhost"

                script {
                    env.SOMETHING = "1" // creates env.SOMETHING variable
                }
            }
        }
        stage('CreateFolder') {
            steps {
                //accedo a la variable global con el nombre porque esta seteade en el env de bash
                sh '''
                    echo py2Ana=$py2Ana
                    echo FOLDERNAME=$FOLDERNAME

                '''

                withCredentials([usernameColonPassword(credentialsId: 'mylogin', variable: 'USERPASS')]) {
                   sh '''
                      set +x
                      URL="${env.SERVER}/createItem?name=$FOLDERNAME&mode=com.cloudbees.hudson.plugins.folder.Folder"
                      curl -XPOST "${URL}" -d '{}' --user "$USERPASS"
                    '''
                }
                sh '''
                    URL="${SERVER}/createItem?name=$FOLDERNAME&mode=com.cloudbees.hudson.plugins.folder.Folder"
                    echo $URL
                '''
            }
        }
    }
}

*/
                    //URL="${SERVER}/createItem?name=$FOLDERNAME&mode=com.cloudbees.hudson.plugins.folder.Folder"
//curl -XPOST "$SERVER/createItem?name=$FOLDERNAME&mode=com.cloudbees.hudson.plugins.folder.Folder" -H 'Content-Type: application/json' -d "$JSON" --user "$USER:$TOKEN"



/*
                withCredentials([usernameColonPassword(credentialsId: 'mylogin', variable: 'USERPASS')]) {
                   sh '''
                     set +x \
                     curl -u "$USERPASS" "http://localhost:8080" \
                   '''

                }
*/

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
        stage('CreateFolder') {
            steps {
                echo 'creat folder'
                sayHello "${env.folderName}"
                sayHello "${env.userName}"
                sayHello "${env.userToken}"
                sayHello "${env.url}"
                sayHello ("prueba")
            //    createFolder2("prueba")
            }
        }
    }
}


                withCredentials([usernameColonPassword(credentialsId: 'mylogin', variable: 'USERPASS')]) {
                   sh '''
                     set +x \
                     curl -u "$USERPASS" "http://localhost:8080" \
                   '''
                }

*/