#!/usr/bin/env groovy

def call(String urlString, String folderName, String userString, String tokenString) {
//curl -XPOST "$SERVER/createItem?name=$FOLDERNAME&mode=com.cloudbees.hudson.plugins.folder.Folder" -H 'Content-Type: application/json' -d "$JSON" --user "$USER:$TOKEN"
    List cmd = []
    curlString = "curl -XPOST " + urlString + "/createItem?name=" + folderName + "&mode=com.cloudbees.hudson.plugins.folder.Folder"

    cmd << curlString
    cmd << "-H 'Content-Type: application/json'"
    cmd << '-d "{}"'
    userToken = "--user " + userString + ":" + tokenString
    cmd << userToken

    statusCode = sh (returnStatus: true, script: "${cmd.join(' ').trim()}")
    println statusCode
/*
    cmd = "curl -XPOST '${urlString}'"
    cmd << "/createItem?name="
    cmd << '${folderName}"
    cmd << "&mode=com.cloudbees.hudson.plugins.folder.Folder" 
    cmd << " -H 'Content-Type: application/json' -d {}" 
    TODO
    cmd << "--user "$USER:$TOKEN"
    cmd

    statusCode = sh (returnStatus: true, script: "x${cmd.join(' ').trim()}")
*/
}
