package com.xenia.roomexample

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {
    @Upsert
    suspend fun upsertContact(contact: ModelContact)
    @Delete
    suspend fun deleteContact(contact: ModelContact)

    @Query("SELECT * FROM user_table ORDER BY first_name ASC")
    fun getContactsOrderedByFirstName() : Flow<List<ModelContact>>

    @Query("SELECT * FROM user_table ORDER BY last_name ASC")
    fun getContactsOrderedByLastName() : Flow<List<ModelContact>>

    @Query("SELECT * FROM user_table ORDER BY phone_number ASC")
    fun getContactsOrderedByPhoneNumber() : Flow<List<ModelContact>>

}