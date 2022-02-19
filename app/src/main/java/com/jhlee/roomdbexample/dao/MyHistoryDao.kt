package com.jhlee.roomdbexample.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.jhlee.roomdbexample.model.MyHistory

@Dao
interface MyHistoryDao {

    @Query("SELECT * FROM tb_myhistory")
    fun getAll(): List<MyHistory>

    @Insert
    fun set(myHistory: MyHistory)

    @Delete
    fun delete(myHistory: MyHistory)

    @Query("DELETE FROM tb_myhistory")
    fun deleteAll()

}