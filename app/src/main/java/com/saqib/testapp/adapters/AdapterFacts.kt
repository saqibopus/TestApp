package com.saqib.testapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saqib.testapp.R
import com.saqib.testapp.databinding.AdapterFactsBinding
import com.saqib.testapp.helper.Constants
import com.saqib.testapp.helper.Logs
import com.saqib.testapp.helper.loadImage
import com.saqib.testapp.model.FactsRowsModel
import com.squareup.picasso.Picasso

class AdapterFacts(
    private val context: Context,
    private val list: ArrayList<FactsRowsModel>
) : RecyclerView.Adapter<AdapterFacts.VH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(
            AdapterFactsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun addNewItems(newList: ArrayList<FactsRowsModel>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(context, list[position])
    }

    class VH(private val binding: AdapterFactsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(context: Context, model: FactsRowsModel) {
            binding.tvTitle.text = model.title ?: Constants.ErrorMessage.NO_DESC_AVAILABLE
            Logs.p("image - ${model.imageHref}")
            binding.imgPoster.loadImage(context, model.imageHref)
            binding.tvDescription.text =
                model.description ?: Constants.ErrorMessage.NO_TITLE_AVAILABLE
        }
    }
}