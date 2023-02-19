package sample.routes

import react.FC
import react.Props
import react.create
import react.dom.html.ReactHTML.h1
import react.router.Route
import react.router.Routes


val homeComponent = FC<Props>{
    h1{
        + "Welcome to the Home Page!!!"
    }
}

val aboutUsComponent = FC<Props>{
    h1{
        + "Welcome to the About Us Component!!!"
    }
}

val headerRoutes =  FC<Props> {
    Routes{
        //The Home Page Route
        Route{
            path = "/"
            index = true
            element = homeComponent.create()
        }

        //The About us Page Route
        Route{
            path = "/aboutUs"
            element = aboutUsComponent.create()
        }
    }

}