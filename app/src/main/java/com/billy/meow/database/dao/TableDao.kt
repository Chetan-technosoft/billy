package com.billy.meow.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.billy.meow.database.data.Table
import com.billy.meow.database.data.TableWithFoodAndBillee

/**
 * Created by Chetan on 2019-09-14.
 */

@Dao
interface TableDao {
    @Insert
    fun insert(table: Table): Long

    @Delete
    fun delete(table: Table)

    @Update
    fun update(table: Table)

    @Query("SELECT * from `table` WHERE id = :key")
    fun get(key: Long): Table?

    @Query("SELECT * FROM `table` ORDER BY id DESC")
    fun getAll(): LiveData<List<Table>>

    @Query("SELECT * FROM `table` INNER JOIN food_billee_map ON `table`.id = food_billee_map.id WHERE `table`.id = :key")
    fun getTableWithFoodAndBillee(key: Long): TableWithFoodAndBillee
}
