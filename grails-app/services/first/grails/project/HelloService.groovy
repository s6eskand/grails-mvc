package first.grails.project

import grails.gorm.transactions.Transactional


@Transactional
class HelloService {

    static responseFormats = ['json']

    def list() {
        Random rnd = new Random()
        return "Your Number is: " + rnd.nextInt(100)
    }

    def add(HelloDomain body) {

        return '{"name": "'+body.name+'", "email": "'+body.email+'", "message": "Hey There!"}'
    }
}
