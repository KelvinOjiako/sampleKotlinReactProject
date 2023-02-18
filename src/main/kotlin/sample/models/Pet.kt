package sample.models

data class Supplier(val id: Int)

enum class PetBreed{
    DOG, CAT, BIRD, REPTILE, FISH, MONKEY,
}

data class Pet(
    val id: Int,
    val pictureURL: String?,
    val supplier: Supplier?,
    val type: PetBreed?
)

