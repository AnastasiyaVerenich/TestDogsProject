package ch.iagentur.unity.testdogsproject.ui.viewHolder

import android.content.Context
import android.view.ViewGroup
import ch.iagentur.unity.testdogsproject.R
import ch.iagentur.unity.testdogsproject.data.network.DogBreed
import kotlinx.android.synthetic.main.row_dog_breed_item.view.*

class DogBreedsViewHolder(val context: Context, parent: ViewGroup)
    : BaseViewHolder(R.layout.row_dog_breed_item, parent) {
    var openDogBreedInfoCallback: ((id:Int) -> Unit)? = null

    fun bindView(item: DogBreed?) {
        itemView.rdbiDogBreedsNameTextView.text = item?.name
        itemView.setOnClickListener { item?.id?.let { it -> openDogBreedInfoCallback?.invoke(it) } }
    }
}