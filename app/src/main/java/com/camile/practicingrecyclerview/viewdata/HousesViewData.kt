package com.camile.practicingrecyclerview.viewdata

import com.camile.practicingrecyclerview.models.HousesData

class HousesViewData {

    companion object{
        fun createDataSet() : ArrayList<HousesData> {
            val listDatas = ArrayList<HousesData>()

            listDatas.add(
                HousesData(
                    "Gryffindor",
                    "Brave",
                    "Red and Gold",
                    "https://static.wikia.nocookie.net/harrypotter/images/b/b1/Gryffindor_ClearBG.png/revision/latest?cb=20190222162949"
                )
            )
            listDatas.add(
                HousesData(
                    "Hufflepuff",
                    "Loyal",
                    "Yellow and Brown",
                    "https://static.wikia.nocookie.net/harrypotter/images/0/06/Hufflepuff_ClearBG.png/revision/latest?cb=20161020182518"
                )
            )
            listDatas.add(
                HousesData(
                    "Ravenclaw",
                    "Ready mind",
                    "Blue and Bronze",
                    "https://static.wikia.nocookie.net/harrypotter/images/7/71/Ravenclaw_ClearBG.png/revision/latest?cb=20161020182442"
                )
            )
            listDatas.add(
                HousesData(
                    "Slytherin",
                    "Ambitious",
                    "Green and Silver",
                    "https://static.wikia.nocookie.net/harrypotter/images/0/00/Slytherin_ClearBG.png/revision/latest?cb=20161020182557"
                )
            )
            return listDatas
        }
    }
}