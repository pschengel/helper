def call(Map params) {
    def defaults = [
        endpointUrl: 'https://eohotv9zrfaegyf.m.pipedream.net',
        httpMode: 'POST',
        contentType: 'APPLICATION_JSON'
    ]

    def config = defaults + params

    node {
        stage('HTTP Request') {
            def response = httpRequest(
                contentType: config.contentType,
                httpMode: config.httpMode,
                requestBody: config.requestBody,
                url: config.endpointUrl
            )
            // You can further process the response as needed
        }
    }
}