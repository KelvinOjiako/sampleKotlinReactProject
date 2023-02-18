package sample.components

import react.FC
import react.Props
import sample.mockData.mockPetList

external interface MainComponentProp: Props{


}
val mainComponent = FC<MainComponentProp> {props ->

    staticComponent{

    }

    petComponent{
        petList = mockPetList
    }

}