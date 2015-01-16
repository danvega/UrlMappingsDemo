class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')

        group("/api/address") {
            "/zip-code/$id"( controller: 'zipCode', action: 'show' )
        }
    }
}
