package rico.grails

class UrlMappings {

    static mappings = {
        get "/author/$id"(controller:"author", action:"show")

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }


        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
