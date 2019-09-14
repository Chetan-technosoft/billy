package com.billy.meow.model.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Chetan on 2019-09-14.
 */
@Entity(tableName = "table")
data class Table(

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    @ColumnInfo(name = "name")
    var name: String? = null,

    @ColumnInfo(name = "tip")
    var tip: Double? = null,

    @ColumnInfo(name = "tax")
    var tax: Double? = null,

    @ColumnInfo(name = "discount")
    var discount: Double? = null,

    @ColumnInfo(name = "discount_type")
    var discountBeforeTax: Boolean? = null,

    @ColumnInfo(name = "bill")
    var bill: Double? = null,

    @ColumnInfo(name = "created_on")
    var createdOn: Long
) {
    constructor(name: String) :
            this(name = name, createdOn = System.currentTimeMillis())
}