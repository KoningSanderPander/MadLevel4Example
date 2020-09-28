package nl.svdoetelaar.madlevel4example

import androidx.room.*

@Dao
interface ReminderDao {

    @Query("SELECT * FROM reminder")
    suspend fun getAllReminders(): List<Reminder>

    @Insert
    suspend fun insertReminder(reminder: Reminder)

    @Update
    suspend fun updateReminder(reminder: Reminder)

    @Delete
    suspend fun deleteReminder(reminder: Reminder)

}