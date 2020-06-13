package first.grails.project

class HelloController {

    static allowedMethods = [index: 'GET', save: 'POST']

    def HelloService

    def index() {
        response << HelloService.list()
    }

    def save(HelloDomain body) {
        response.setContentType("application/json")
        response << HelloService.add(body)
    }
}
