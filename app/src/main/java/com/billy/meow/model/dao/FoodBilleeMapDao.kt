package com.billy.meow.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.billy.meow.model.data.FoodBilleeMap

/**
 * Created by Chetan on 2019-09-14.
 */
@Dao
interface FoodBilleeMapDao {

    @Insert
    fun insert(foodBilleeMap: FoodBilleeMap): Long

    @Delete
    fun delete(foodBilleeMap: FoodBilleeMap)

    @Update
    fun update(foodBilleeMap: FoodBilleeMap)

    @Query("SELECT * from food_billee_map WHERE id = :key")
    fun get(key: Long): FoodBilleeMap?

    @Query("SELECT * FROM food_billee_map  ORDER BY id DESC")
    fun getAll(): LiveData<List<FoodBilleeMap>>

}