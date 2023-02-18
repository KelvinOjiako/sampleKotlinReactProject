package sample.components

import csstype.px
import csstype.rgb
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import react.key
import sample.models.Pet

external interface PetProp: Props{
    var petList: MutableList<Pet>
}

val petComponent = FC <PetProp>{props->

    div{
        
        css {
            padding = 5.px
            backgroundColor = rgb(8, 97, 22)
            color = rgb(56, 246, 137)
        }

        for (pet in props.petList){
            p {
                key = pet.id.toString()
                img{
                    src = pet.pictureURL
                }
                +"${pet.type} "
            }
        }

    }

}