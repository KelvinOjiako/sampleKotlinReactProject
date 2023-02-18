package sample.components

import react.FC
import react.Props

external interface StaticProp: Props{


}

val staticComponent = FC<StaticProp>{
    console.log("The Static Component Was Rendered!!!")
}