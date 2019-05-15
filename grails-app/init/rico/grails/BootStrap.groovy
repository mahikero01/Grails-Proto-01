package rico.grails

class BootStrap {

    def init = { servletContext ->
        def author01 = new Author(firstName: 'Rico', lastName: 'Sarm').save(failOnError:true)
        def author02 = new Author(firstName: 'Grace', lastName: 'Sarm').save(failOnError:true)
    }

    def destroy = {
    }
}
