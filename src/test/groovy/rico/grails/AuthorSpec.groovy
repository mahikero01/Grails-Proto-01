package rico.grails

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification
import spock.lang.Unroll

class AuthorSpec extends Specification implements DomainUnitTest<Author> {

    def setup() {
    }

    def cleanup() {
    }

    @Unroll
    def "Author First Name Too Long"() {
        when:
        domain.firstName = firstName

        then:
        !domain.validate(['firstName'])
        domain.errors['firstName'].code == "maxSize.exceeded"

        where:
        firstName   | _
        "rteyujdfgsheiows"  | _
    }
}
