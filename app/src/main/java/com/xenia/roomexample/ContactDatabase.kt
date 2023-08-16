package com.xenia.roomexample

import androidx.room.Database

@Database(
    entities = [ModelContact::class],
    version = 1
)

abstract class ContactDatabase {
    abstract val dao: ContactDao
}