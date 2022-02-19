package com.jhlee.roomdbexample

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jhlee.roomdbexample.dao.MyHistoryDao
import com.jhlee.roomdbexample.model.MyHistory

@Database (entities = [MyHistory::class], version = 1)
abstract class HistoryDatabase : RoomDatabase() {
    abstract fun myHistoryDao() : MyHistoryDao
}