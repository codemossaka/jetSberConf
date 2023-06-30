package com.example.sberapp.data

import java.math.BigDecimal


class Item(var id: Long, var name: String, var image: String, var price: BigDecimal)

fun generateItems(count: Int): List<Item> {
    val items = mutableListOf<Item>()

    for (i in 1..count) {
        val item = Item(
            id = i.toLong(),
            name = "Item $i",
            image = getRandomImageUrl(),
            price = BigDecimal.valueOf(i.toDouble())
        )

        items.add(item)
    }

    return items
}

fun getRandomImageUrl(): String {
    val baseUrl = "https://picsum.photos/200/300?random="
    val randomId = (1..1000).random()
    return baseUrl + randomId
}