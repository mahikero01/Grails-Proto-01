package rico.grails

class AuthorController {
    static responseFormats = ['json']

    def authorService

    def index() {
        def authors = authorService.getAuthors()

        respond([authors: authors])
    }

    def show(Long id) {
        def author = authorService.getAuthor(id)

        respond author
    }

}
