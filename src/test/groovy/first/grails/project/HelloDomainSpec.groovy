package first.grails.project

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class HelloDomainSpec extends Specification implements DomainUnitTest<HelloDomain> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
