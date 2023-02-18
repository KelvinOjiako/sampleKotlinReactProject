import kotlinx.browser.document
import react.create
import react.dom.client.createRoot
import sample.components.mainComponent

fun main() {
    val container = document.createElement("div")
    document.body!!.appendChild(container)
    createRoot(container).render(mainComponent.create())
}