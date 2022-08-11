package com.camile.practicingrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.camile.practicingrecyclerview.viewdata.HousesViewData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var housesAdapter: HousesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        getHousesViewData()
    }

    private fun getHousesViewData() {
        val houseViewData = HousesViewData.createDataSet()
        this.housesAdapter.setHousesViewData(houseViewData)
    }

    private fun initRecyclerView() {
        this.housesAdapter = HousesAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = this.housesAdapter
    }
}