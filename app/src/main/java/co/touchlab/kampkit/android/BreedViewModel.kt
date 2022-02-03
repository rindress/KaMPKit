package co.touchlab.kampkit.android

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.touchlab.kampkit.db.Breed
import co.touchlab.kampkit.models.BreedCommonViewModel
import co.touchlab.kampkit.models.BreedRepository
import co.touchlab.kermit.Logger

class BreedViewModel(
    breedRepository: BreedRepository,
    log: Logger
) : ViewModel() {

    private val commonViewModel = BreedCommonViewModel(breedRepository, log, viewModelScope)

    val breeds = commonViewModel.breeds

    fun refreshBreeds() = commonViewModel.refreshBreeds()

    fun updateBreedFavorite(breed: Breed) = commonViewModel.updateBreedFavorite(breed)
}
