package com.billy.meow.database.data

import androidx.room.Room
import androidx.test.platform.app.InstrumentationRegistry
import com.billy.meow.database.MeowDB
import com.billy.meow.database.dao.BilleeDao
import com.billy.meow.database.dao.DishDao
import com.billy.meow.database.dao.FoodBilleeMapDao
import com.billy.meow.database.dao.TableDao
import org.junit.After
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import java.io.IOException

/**
 * Created by Chetan on 2019-09-14.
 */
class TableWithFoodAndBilleeTest {
    private lateinit var db: MeowDB
    private lateinit var billeeDao: BilleeDao
    private lateinit var dishDao: DishDao
    private lateinit var foodBilleeMapDao: FoodBilleeMapDao
    private lateinit var tableDao: TableDao

    @Before
    fun createDb() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        db = Room.inMemoryDatabaseBuilder(context, MeowDB::class.java)
            .allowMainThreadQueries()
            .build()

        billeeDao = db.billeeDao
        dishDao = db.dishDao
        foodBilleeMapDao = db.foodBilleeMapDao
        tableDao = db.tableDao
    }

    @Test
    @Throws(IOException::class)
    fun testDb() {

        val table = Table(
            name = "Pizza at Joye's"
        )

        val tableId = tableDao.insert(table)


        val billee = Billee(
            name = "Test Name"
        )

        val billeeId = billeeDao.insert(billee)

        val dish = Dish(
            name = "Joye's special",
            price = 500.0
        )

        val dishId = dishDao.insert(dish)

        val foodBilleeMap = FoodBilleeMap(
            billee = billeeId, dish = dishId, tableId = tableId
        )

        foodBilleeMapDao.insert(foodBilleeMap)

        val savedTable = tableDao.getTableWithFoodAndBillee(tableId)

        assertNotNull(savedTable)

    }

    @After
    fun closeDb() {
        db.close()
    }
}