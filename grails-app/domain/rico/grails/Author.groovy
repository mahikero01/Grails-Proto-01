package rico.grails

class Author {
    String firstName
    String lastName

    static constraints = {
        firstName maxSize: 15
        lastName maxSize: 15
    }
}
