#!/usr/bin/env groovy



def call(String name = 'human') {
  echo "Hello, ${name}."
  this.folderCreate("http://localhost:8080/","pruebaFolder","seba", "119efc00c3c621b333d1d1dac37ef22b01")
}



def folderCreate(String urlString, String folderName, String userString, String tokenString) {
//curl -XPOST "$SERVER/createItem?name=$FOLDERNAME&mode=com.cloudbees.hudson.plugins.folder.Folder" -H 'Content-Type: application/json' -d "$JSON" --user "$USER:$TOKEN"
    List cmd = []
    curlString = "curl -XPOST " + urlString + "/createItem?name=" + folderName + "&mode=com.cloudbees.hudson.plugins.folder.Folder"

    cmd << curlString
    cmd << "-H 'Content-Type: application/json'"
    cmd << '-d "{}"'
    userToken = "--user " + userString + ":" + tokenString
    cmd << userToken
    println cmd
    statusCode = sh (returnStatus: true, script: "${cmd.join(' ').trim()}")
    println statusCode

}

