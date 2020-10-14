package com.example.gameforchildren.utilits

import com.example.gameforchildren.R
import com.example.gameforchildren.model.FoodModel

var fullListOfFood: MutableList<FoodModel> = mutableListOf()


fun initFood() {
    fullListOfFood.clear()
    val foodNames = arrayOf("orange", "kirpich", "whatermelon", "axe")
    val foodEatble = arrayOf(true, false, true, false)
    val foodImages =
        arrayOf(R.drawable.orange, R.drawable.kirpich, R.drawable.whatermelon, R.drawable.axe)
    for (i in 0..foodNames.lastIndex) {
        fullListOfFood.add(FoodModel(foodNames[i], foodImages[i], foodEatble[i]))
    }
}

fun getRandomFood(): List<FoodModel> {
    if (fullListOfFood.isEmpty()) initFood()
    var secondFoodModel: FoodModel
    val firstPosition = (0..fullListOfFood.lastIndex).random()
    val firstFoodModel = fullListOfFood[firstPosition]
    fullListOfFood.removeAt(firstPosition)
        while (true) {
        val secondPosition = (0..fullListOfFood.lastIndex).random()
        if (fullListOfFood[secondPosition].edible == !firstFoodModel.edible) {
            secondFoodModel = fullListOfFood[secondPosition]
            fullListOfFood.removeAt(secondPosition)
            break

        }

    }
    return listOf(firstFoodModel, secondFoodModel)

}