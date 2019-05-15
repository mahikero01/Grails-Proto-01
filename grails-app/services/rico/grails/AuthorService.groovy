package rico.grails

import grails.gorm.transactions.Transactional

@Transactional(readOnly = true)
class AuthorService {

    def getAuthors() {
        Author.list()
    }

    Author getAuthor(Long id) {
        Author.get(id)
    }
}
