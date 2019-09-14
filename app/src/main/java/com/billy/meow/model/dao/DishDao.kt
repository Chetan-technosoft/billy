package com.billy.meow.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.billy.meow.model.data.Dish

/**
 * Created by Chetan on 2019-09-14.
 */
@Dao
interface DishDao {
    @Insert
    fun insert(dish: Dish): Long

    @Delete
    fun delete(dish: Dish)

    @Update
    fun update(dish: Dish)

    @Query("SELECT * from dish WHERE id = :key")
    fun get(key: Long): Dish?

    @Query("SELECT * FROM dish ORDER BY id DESC")
    fun getAll(): LiveData<List<Dish>>
}