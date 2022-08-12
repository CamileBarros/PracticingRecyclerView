package com.camile.practicingrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.camile.practicingrecyclerview.models.HousesData
import kotlinx.android.synthetic.main.res_house_list_item.view.*

class HousesAdapter(private val onItemClicked : (HousesData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder> () {

    private  var listItems : List<HousesData> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HouseViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_house_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is HouseViewHolder -> {
                holder.bind(listItems[position], onItemClicked)
            }
        }
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    class HouseViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        private val titleItem = itemView.titleItem
        private val subtitleItem = itemView.subtitleItem
        private val imageItem = itemView.imageItem

        fun bind(housesData: HousesData, onItemClicked: (HousesData) -> Unit){
            titleItem.text = housesData.houseName
            subtitleItem.text = housesData.houseCharacteristics

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(housesData.houseSymbol)
                .into(imageItem)

            itemView.setOnClickListener(){
                onItemClicked(housesData)
            }
        }
    }

    fun setHousesViewData(housesData: List<HousesData>) {
        this.listItems = housesData
    }
}