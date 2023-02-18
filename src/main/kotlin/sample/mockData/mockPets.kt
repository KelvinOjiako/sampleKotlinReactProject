package sample.mockData

import sample.models.Pet
import sample.models.PetBreed

var mockPetList = mutableListOf<Pet>(
    Pet(1, "https://images.unsplash.com/photo-1615751072497-5f5169febe17?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Y3V0ZSUyMGRvZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60", null, PetBreed.DOG),
    Pet(2, "https://images.unsplash.com/photo-1586671267731-da2cf3ceeb80?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8Y3V0ZSUyMGRvZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=400&q=60", null, PetBreed.DOG)

)