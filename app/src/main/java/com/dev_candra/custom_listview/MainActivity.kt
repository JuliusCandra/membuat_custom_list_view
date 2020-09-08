package com.dev_candra.custom_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var list : ListView
    private lateinit var data: MutableList<model>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        data = mutableListOf()
        list = findViewById(R.id.list)
        Aksi()
    }

    // memasukkan semua aksi pada suatu method
    private fun Aksi(){
        initListView()
        initToolbar()
    }

    // Melakukan assignment dan aksi pada listview
    private fun initListView(){
        list.apply {
            val adapter2 = adapter(this@MainActivity,R.layout.row_model,data)
            membuatData(adapter2)
        }
        list.setOnItemClickListener { parent, view, position, id ->
            if (position == 0){
                Toast.makeText(this,"anda mengklik cupcake",Toast.LENGTH_SHORT).show()
            }else if (position == 1){
                Toast.makeText(this,"anda mengklik donut",Toast.LENGTH_SHORT).show()
            }else if (position == 2){
                Toast.makeText(this,"anda mengklik eclair",Toast.LENGTH_SHORT).show()
            }else if (position == 3){
                Toast.makeText(this,"anda mengklik froyo",Toast.LENGTH_SHORT).show()
            }else if (position == 4){
                Toast.makeText(this,"anda mengklik gingerbread",Toast.LENGTH_SHORT).show()
            }else if (position == 5){
                Toast.makeText(this,"anda mengklik honeycomb",Toast.LENGTH_SHORT).show()
            }else if (position == 6){
                Toast.makeText(this,"anda mengklik ice cream sandwich",Toast.LENGTH_SHORT).show()
            }else if (position == 7){
                Toast.makeText(this,"anda mengklik jelly bean",Toast.LENGTH_SHORT).show()
            }else if (position == 8){
                Toast.makeText(this,"anda mengklik kitkat",Toast.LENGTH_SHORT).show()
            }else if (position == 9){
                Toast.makeText(this,"anda mengklik lollipop",Toast.LENGTH_SHORT).show()
            }else if (position == 10){
                Toast.makeText(this,"anda mengklik marshmellow",Toast.LENGTH_SHORT).show()
            }else if (position == 11){
                Toast.makeText(this,"anda mengklik nougat",Toast.LENGTH_SHORT).show()
            }else if (position == 12){
                Toast.makeText(this,"anda mengklik oreo",Toast.LENGTH_SHORT).show()
            }else if (position == 13){
                Toast.makeText(this,"anda mengklik pie",Toast.LENGTH_SHORT).show()
            }
        }
    }

    // membuat data dan memasukkannya kedalam list model
    private fun membuatData(adapter: adapter){
        data.add(model("cupcake","version Android 1.5",R.drawable.cupcake))
        data.add(model("donut","version Android 1.6",R.drawable.donut))
        data.add(model("eclair","version Android 2.0",R.drawable.eclair))
        data.add(model("froyo","version Android 2.2",R.drawable.froyo))
        data.add(model("gingerbread","version Android 2.3",R.drawable.ginggear_bread))
        data.add(model("honeycomb","version Android 3.0",R.drawable.honeycomb))
        data.add(model("ice cream sandwich","version Android 4.0",R.drawable.ice_cream_sandwich))
        data.add(model("jelly bean","version Android 4.1",R.drawable.jellybean))
        data.add(model("kitkat","version Android 4.4",R.drawable.kitakat))
        data.add(model("lollipop","version Android 5.0",R.drawable.lollipop))
        data.add(model("marshmellow","version Android 6.0",R.drawable.marshmellow))
        data.add(model("nougat","version Android 7.0",R.drawable.nougat))
        data.add(model("oreo","version Android 8.0",R.drawable.oreo))
        data.add(model("pie","version Android 10.0",R.drawable.pie))
        list.adapter = adapter


    }

    // membuat toolbar
    private fun initToolbar(){
        val actionBar = supportActionBar
        if (actionBar != null){
            actionBar.title = "Candra Julius Sinaga"
           actionBar.subtitle = "Contoh List View"
        }
    }
}
