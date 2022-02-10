@Library('shared-library') _

//import com.cleverbuilder.GlobalVars
////import com.cleverbuilder.SampleClass

pipeline {
    agent any

    environment {
        py2Ana="DEFAULT"
        SERVER="http://localhost:8080"
        FOLDERNAME="NombreFolder"
    }
    stages {
        stage('Stage1') {
            steps {
                withCredentials([usernameColonPassword(credentialsId: 'mylogin', variable: 'USERPASS')]) {
                   sh '''
                      set +x
                      curl "http://localhost:8080/" -u "$USERPASS"
                    '''
                }
                sh '''
                    URL="\"${SERVER}/createItem?name=$FOLDERNAME&mode=com.cloudbees.hudson.plugins.folder.Folder\""
                    echo $URL

                    VAR1="Hello, "
                    VAR2="${VAR1}World"
                    echo "$VAR2"

                '''
            }
        }
    }
}

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