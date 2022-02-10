@Library('shared-library') _

//import com.cleverbuilder.GlobalVars
////import com.cleverbuilder.SampleClass


pipeline {
    agent any

    stages {
        stage('CreateFolder') {
            steps {
                echo 'creat folder'
                sayHello "${env.folderName}"
                sayHello "${env.userName}"
                sayHello "${env.userToken}"
                sayHello "${env.url}"
                sayHello ("prueba")
                createFolder2("prueba")
            }
        }
    }
}
