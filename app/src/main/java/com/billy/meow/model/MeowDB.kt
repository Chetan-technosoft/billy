package com.billy.meow.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.billy.meow.model.dao.BilleeDao
import com.billy.meow.model.dao.DishDao
import com.billy.meow.model.dao.FoodBilleeMapDao
import com.billy.meow.model.dao.TableDao
import com.billy.meow.model.data.Billee
import com.billy.meow.model.data.Dish
import com.billy.meow.model.data.FoodBilleeMap
import com.billy.meow.model.data.Table

/**
 * Created by Chetan on 11-09-2019.
 */
@Database(
    version = 1,
    entities = [Billee::class, Dish::class, FoodBilleeMap::class, Table::class],
    exportSchema = false
)
abstract class MeowDB : RoomDatabase() {

    abstract val billeeDao: BilleeDao
    abstract val dishDao: DishDao
    abstract val foodBilleeMapDao: FoodBilleeMapDao
    abstract val tableDao: TableDao

    companion object {

        @Volatile
        private var INSTANCE: MeowDB? = null

        fun getInstance(context: Context): MeowDB {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        MeowDB::class.java,
                        "meow_db"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}