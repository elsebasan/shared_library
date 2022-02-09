/**
* Crea un grupos dentro de un directorio
*/

//url string es hostname + path
// ejemplo
// server = "https://globaldevtools.bbva.com/"
// path = "je-mm-ar/"
def call(String urlString, String folderName,  groupsList ,List<String> userString, String tokenString) {
    groupsList.each {
        groupIntoFolderCreate(urlString, folderName, it, userString, tokenString)
    }

}



def groupIntoFolderCreate(String urlString,String folderName,String groupString, String user, String token) {
    urlString = urlString + '/job/' + folderName + '/groups/createGroup?name=' + groupString
    def url = new URL(urlString)
    HttpURLConnection conn = (HttpURLConnection) url.openConnection()

    String userpass = user + ':' + token
    String basicAuth = 'Basic ' + new String(Base64.getEncoder().encode(userpass.getBytes()))
    //set credentials

    conn.setRequestMethod('POST')
    conn.setRequestProperty('Authorization', basicAuth)
    conn.setDoOutput(true)
    conn.connect()
    conn.getResponseCode()

}

