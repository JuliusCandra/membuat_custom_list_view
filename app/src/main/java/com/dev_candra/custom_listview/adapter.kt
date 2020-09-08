package com.dev_candra.custom_listview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class adapter(var context1: Context, var resource: Int, var items: List<model>)
    : ArrayAdapter<model>(context1,resource,items)
{

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout: LayoutInflater = LayoutInflater.from(context1)
        val view: View = layout.inflate(resource,null)
        val gambar1: ImageView = view.findViewById(R.id.gambar1)
        val textNama : TextView = view.findViewById(R.id.nama_anda)
        val textVersion: TextView = view.findViewById(R.id.version_anda)

        var item1: model = items[position]
        gambar1.setImageDrawable(context1.resources.getDrawable(item1.photo))
        textNama.text = item1.tittle.toUpperCase()
        textVersion.text = item1.version.toLowerCase()
        return view
    }
}