
def response = httpRequest(
    url: 'https://eohotv9zrfaegyf.m.pipedream.net',
    contentType: 'APPLICATION_JSON',
    httpMode: 'POST',
    requestBody: "{\"result\": \"${currentBuild.result}\", \"message\": \"Your custom message here\"}"
)
echo "Feedback response: ${response}"
 