@Library('shared-library') _

//import com.cleverbuilder.GlobalVars
////import com.cleverbuilder.SampleClass


pipeline {
    agent any

    environment {
        SERVER = "http://localhost:8080"
        folderName = 'NombreFolder'
        path="/"
        FOO = "BAR"
    }
    stages {
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

                            ])

                    // Save to variables. Default to empty string if not found.
                    env.folderName = userInput.folderName?:''
                }
            }

        }
*/
        stage('CreateFolder') {

            steps {
                echo 'creat folder'
                //sayHello "${env.folderName}"
               // sayHello "${env.userName}"
               // sayHello "${env.userToken}"
               // sayHello "${env.url}"
              ////  sayHello ("prueba")
                
               echo "FOO = ${env.FOO}"
               //curl -XPOST "$SERVER/createItem?name=$FOLDERNAME&mode=com.cloudbees.hudson.plugins.folder.Folder" -H 'Content-Type: application/json' -d "$JSON" --user "$USER:$TOKEN"

           //     withCredentials([usernameColonPassword(credentialsId: 'mylogin', variable: 'USERPASS')]) {
            ////       sh '''
              ////     set +x
                ////   curl -u "$USERPASS" "http://localhost:8080"

////                   '''
  ////              }
                    //curl -XPOST "${env.url}/createItem?name=${env.folderName}&mode=com.cloudbees.hudson.plugins.folder.Folder" -H 'Content-Type: application/json' -d "{}" --user "$USERPASS"
              //  createFolder("http://localhost:8080","pruebaFolder","seba", "119efc00c3c621b333d1d1dac37ef22b01")

            }
        }
    }
}
