import kotlinx.browser.document
import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import react.router.dom.BrowserRouter
import sample.components.theNavBarComponent
import sample.routes.headerRoutes

fun main() {
    val container = document.createElement("div")
    document.body!!.appendChild(container)

    val mainComponent = FC<Props> {
        BrowserRouter{


            //Defines the routes for the NavBar Component
            headerRoutes()
            theNavBarComponent()
        }
    }
    createRoot(container).render(mainComponent.create())

}