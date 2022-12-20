package dev.epegasus.draganddrop

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dev.epegasus.draganddrop.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        setStateValue(ITEM_QUANTITY_STRING, ZERO_STRING)
    }


    private fun setStateValue(stateToEdit: String, stateValue: Any?) {
        Log.d("MyTag", "setStateValue: $stateToEdit - $stateValue")

        /*var itemToUpdate = _shoppingListItemState.value!!

        ITEM_QUANTITY_STRING -> itemToUpdate = itemToUpdate.copy(quantity = stateValue.toString())

        _shoppingListItemState.value = itemToUpdate*/
    }


    companion object {
        const val ZERO_STRING = "0"
        const val ITEM_QUANTITY_STRING = "ItemQuantity"
    }
}