package com.example.ejercicio_individual_32m6.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
    class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)