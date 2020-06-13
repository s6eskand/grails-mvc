package first.grails.project

class HelloDomain {

    String name
    String email

    static constraints = {
        name blank:false
        email blank:false
    }
}
