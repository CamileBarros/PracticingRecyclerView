package com.camile.practicingrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.camile.practicingrecyclerview.viewdata.HousesViewData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var housesAdapter: HousesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        getHousesViewData()
    }
    private fun initRecyclerView() {
        housesAdapter = HousesAdapter { Log.i("aqui", "clicked")}

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = housesAdapter
        }
    }

    private fun getHousesViewData() {
        val houseViewData = HousesViewData.createDataSet()
        housesAdapter.setHousesViewData(houseViewData)
    }


}