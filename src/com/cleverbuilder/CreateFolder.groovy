#!/usr/bin/env groovy
package com.cleverbuilder

/**
 * Crea un directorio en Jenkins
 **/
    // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.CreateFolder
   //  GlobalVars.folderCreate(url,folderName,userStrin,tokenStrin)

//url string es hostname + path
// ejemplo

class CreateFolder{
    static String foor = "barrr"

    static folderCreate(String urlString, String folderName, String userString, String tokenString) {
        //armo la url a para hacer el post 
        urlString = urlString + "createItem?name=" + folderName + "&mode=com.cloudbees.hudson.plugins.folder.Folder"
        def url = new URL(urlString)
        HttpURLConnection conn = (HttpURLConnection) url.openConnection()
        //set credentials
        String userpass = userString + ":" + tokenString
        String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userpass.getBytes()))
        //armo el metodo y los headers
        conn.setRequestMethod("POST")
        conn.setRequestProperty ("Authorization", basicAuth)
        conn.setRequestProperty("Content-Type", "application/json")
        conn.setDoOutput(true)
        // Le paso un json vacio
        OutputStream os = conn.getOutputStream()
        OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8")
        osw.write("{}")
        osw.flush()
        osw.close()
        os.close()
        conn.connect()
        println (conn.getResponseCode())
        
    }
}