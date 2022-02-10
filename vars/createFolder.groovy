#!/usr/bin/env groovy






def call(String urlString, String folderName, String userString, String tokenString) {
//curl -XPOST "$SERVER/createItem?name=$FOLDERNAME&mode=com.cloudbees.hudson.plugins.folder.Folder" -H 'Content-Type: application/json' -d "$JSON" --user "$USER:$TOKEN"
    List cmd = []
    curlString = 'curl -XPOST ' + '"' + urlString + '/createItem?name=' + folderName + '&mode=com.cloudbees.hudson.plugins.folder.Folder' + '"'

    cmd << curlString
    cmd << "-H 'Content-Type: application/json'"
    cmd << '-d "{}"'
    userToken = "--user " + userString + ":" + tokenString
    cmd << userToken
   // println cmd.join(' ')
    command = cmd.join(' ') 
    sh '''
       set +x

      curl -XPOST "http://localhost:8080/createItem?name=pruebaFolder&mode=com.cloudbees.hudson.plugins.folder.Folder" -H 'Content-Type: application/json' -d "{}" --user seba:119efc00c3c621b333d1d1dac37ef22b01
       set -x
   // statusCode = sh (returnStatus: true, script: "set +x ${cmd.join(' ')}")

    println statusCode

}

