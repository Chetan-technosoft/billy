package com.billy.meow.model

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.billy.meow.model.dao.BilleeDao
import com.billy.meow.model.data.Billee
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

/**
 * Created by Chetan on 11-09-2019.
 */
@RunWith(AndroidJUnit4::class)
class MeowDBTest {

    private lateinit var db: MeowDB
    private lateinit var billeeDao: BilleeDao

    @Before
    fun createDb() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        db = Room.inMemoryDatabaseBuilder(context, MeowDB::class.java)
            .allowMainThreadQueries()
            .build()

        billeeDao = db.billeeDao
    }


    @Test
    @Throws(IOException::class)
    fun testDb() {
        val billee =
            Billee(name = "Test Name", phone = "I don't use phone", createdOn = System.currentTimeMillis(), self = true)

        billeeDao.insert(billee)

        val self = billeeDao.getSelf()

        Assert.assertEquals(self?.self, true)
    }

    @After
    fun closeDb() {
        db.close()
    }
}