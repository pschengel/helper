def callSendFeedback() {
    def postStep = {
        post {
            always {
                script {
                    def response = httpRequest(
                        url: 'https://endpoint_url.net',
                        contentType: 'APPLICATION_JSON',
                        httpMode: 'POST',
                        requestBody: "{\"result\": \"${currentBuild.result}\", \"message\": \"Your custom message here\"}"
                    )
                    echo "Feedback response: ${response}"
                }
            }
        }
    }

    return postStep
}