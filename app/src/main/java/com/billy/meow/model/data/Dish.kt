package com.billy.meow.model.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Chetan on 2019-09-14.
 */
@Entity(tableName = "dish")
data class Dish(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "price")
    var price: Double,

    @ColumnInfo(name = "discount")
    var discount: Double? = null,

    @ColumnInfo(name = "tax")
    var tax: Double? = null
)