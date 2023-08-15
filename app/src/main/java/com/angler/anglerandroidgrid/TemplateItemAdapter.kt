package com.angler.anglerandroidgrid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TemplateItemAdapter(private val templates: List<TemplateData>) : RecyclerView.Adapter<TemplateItemAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Initialize views in the ViewHolder
        val backgroundImage: ImageView = itemView.findViewById(R.id.backgroundImage)
        val innerImage: ImageView = itemView.findViewById(R.id.innerImage)
        val shortText: TextView = itemView.findViewById(R.id.shortText)
        val longText: TextView = itemView.findViewById(R.id.longText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.template_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val template = templates[position]

        // Bind template data to views
        holder.backgroundImage.setImageResource(template.backgroundImageResId)
        holder.innerImage.setImageResource(template.innerImageResId)
        holder.shortText.text = template.shortText
        holder.longText.text = template.longText
    }

    override fun getItemCount(): Int {
        return templates.size
    }
}
