package com.eparita.ktorcheck.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.eparita.ktorcheck.util.Constants.HERO_REMOTE_KEY_DATABASE_TABLE

@Entity(tableName = HERO_REMOTE_KEY_DATABASE_TABLE)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevPage: Int?,
    val nextPage: Int?
)