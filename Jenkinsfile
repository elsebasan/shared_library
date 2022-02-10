@Library('shared-library') _

// Servidor de Jenkins con el path 
def SERVER = 'http://localhost:8080/'
pipeline {
    agent any
    stages {
        //Leo los Valores desde la interfaz web de Jenkins TODO
        stage('READ VALUE') {
            steps {
                script {
                    FOLDERNAME = 'Prueba2'
            }
        }
    }
    //Creo una Folder con de la stage anterior
    stage('CreateFolder') {
        steps{
            //Seteo el Valor de FOLDERNAME que obtuve antes y lo paso el enviroment de BASH
            script {
                env.FOLDERNAME = FOLDERNAME
                env.URL="${SERVER}/createItem?name=$FOLDERNAME&mode=com.cloudbees.hudson.plugins.folder.Folder"
            }
            withCredentials([usernameColonPassword(credentialsId: 'mylogin', variable: 'USERPASS')]) {
                sh '''
                      curl -XPOST "${URL}"  -H 'Content-Type: application/json' -d '{}' --user "$USERPASS"
                '''
            }
 
        }
    }
  }
}
