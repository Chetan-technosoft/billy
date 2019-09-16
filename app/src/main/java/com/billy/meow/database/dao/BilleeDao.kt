package com.billy.meow.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.billy.meow.database.data.Billee

/**
 * Created by Chetan on 11-09-2019.
 */
@Dao
interface BilleeDao {

    @Insert
    fun insert(billee: Billee): Long

    @Delete
    fun delete(billee: Billee)

    @Update
    fun update(billee: Billee)

    @Query("SELECT * from billee WHERE id = :key")
    fun get(key: Long): Billee?

    @Query("SELECT * FROM billee WHERE self ORDER BY id DESC LIMIT 1")
    fun getSelf(): Billee?

    @Query("SELECT * FROM billee ORDER BY id DESC")
    fun getAll(): LiveData<List<Billee>>
}