package nl.svdoetelaar.madlevel4example

import androidx.room.*

@Dao
interface ReminderDao {

    @Query("SELECT * FROM reminder")
    fun getAllReminders(): List<Reminder>

    @Insert
    fun insertReminder(reminder: Reminder)

    @Update
    fun updateReminder(reminder: Reminder)

    @Delete
    fun deleteReminder(reminder: Reminder)

}