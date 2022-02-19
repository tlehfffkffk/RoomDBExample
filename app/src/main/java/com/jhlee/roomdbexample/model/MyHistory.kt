package com.jhlee.roomdbexample.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "tb_myhistory")
data class MyHistory (
    @PrimaryKey(autoGenerate = true) val uid: Int, // 기본키, 자동할당
    @ColumnInfo(name = "name") val name: String,
    val etc: String
)