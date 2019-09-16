package com.billy.meow.database.data

import androidx.room.Embedded
import androidx.room.Relation

/**
 * Created by Chetan on 2019-09-14.
 */
data class TableWithFoodAndBillee(

    @Embedded
    val table: Table,

    @Relation(
        parentColumn = "id",
        entityColumn = "table_id",
        entity = FoodBilleeMap::class
    )
    val foodBilleeMap: List<FoodBilleeMap>

)