package com.eparita.ktorcheck.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.eparita.ktorcheck.data.local.dao.HeroDao
import com.eparita.ktorcheck.data.local.dao.HeroRemoteKeysDao
import com.eparita.ktorcheck.domain.model.Hero
import com.eparita.ktorcheck.domain.model.HeroRemoteKeys

@Database(entities = [Hero::class, HeroRemoteKeys::class], version=1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase: RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeysDao(): HeroRemoteKeysDao
}