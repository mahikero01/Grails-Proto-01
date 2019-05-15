package rico.grails

class AuthorController {
    static responseFormats = ['json']

    def index() { }

    def show(Long id) {
        def author = Author.get(id)

        respond author
    }

}
