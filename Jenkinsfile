@Library('shared-library') _

//import com.cleverbuilder.GlobalVars
////import com.cleverbuilder.SampleClass

def myVar = 'initial_value'
def SERVER = 'http://localhost:8080/'

pipeline {
  agent any
  stages {
    stage('READ VALUE') {
      steps {
        script {
          // OPTION 1: set variable by reading from file.
          // FYI, trim removes leading and trailing whitespace from the string
          //FOLDERNAME = readFile('myfile.txt').trim()
          FOLDERNAME = 'Prueba2'
        }
      }
    }
    // this stage is skipped due to the when expression, so nothing is printed
    stage('CreateFolder') {
        steps{
            echo "FOLDERNAME ${FOLDERNAME}" 
            script {
                env.FOLDERNAME = FOLDERNAME
                env.URL="${SERVER}/createItem?name=$FOLDERNAME&mode=com.cloudbees.hudson.plugins.folder.Folder"

            }
            sh '''
                curl "${URL}"  --user "seba:11bc47bfe03fc7653f39fa3398f5140ad9"
            '''
            
           // withCredentials([usernameColonPassword(credentialsId: 'mylogin', variable: 'USERPASS')]) {
            //    sh '''
             //       curl "${URL}"  --user "$USERPASS"
              //  '''
            //}
 
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