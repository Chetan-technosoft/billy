package com.billy.meow.model.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

/**
 * Created by Chetan on 2019-09-14.
 */
@Entity(
    tableName = "food_billee_map",
//    primaryKeys = ["dish_id", "billee_id"],
    foreignKeys = [
        ForeignKey(
            entity = Table::class,
            parentColumns = ["id"],
            childColumns = ["table_id"],
            onDelete = ForeignKey.NO_ACTION
        ),
        ForeignKey(
            entity = Dish::class,
            parentColumns = ["id"],
            childColumns = ["dish_id"],
            onDelete = ForeignKey.NO_ACTION
        ),
        ForeignKey(
            entity = Billee::class,
            parentColumns = ["id"],
            childColumns = ["billee_id"],
            onDelete = ForeignKey.NO_ACTION
        )
    ]
)
data class FoodBilleeMap(

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    @ColumnInfo(name = "dish_id")
    var dish: Long,

    @ColumnInfo(name = "billee_id")
    var billee: Long,

    @ColumnInfo(name = "table_id")
    var tableId: Long

)