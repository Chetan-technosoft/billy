package com.billy.meow.database.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Chetan on 11-09-2019.
 */

@Entity(tableName = "billee")
data class Billee(

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "phone")
    var phone: String? = null,

    @ColumnInfo(name = "created_on")
    var createdOn: Long,

    @ColumnInfo(name = "self")
    var self: Boolean? = false
) {
    constructor(name: String) :
            this(name = name, createdOn = System.currentTimeMillis())
}