package nl.svdoetelaar.madlevel4example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_reminder.view.*

class ReminderAdapter(private val reminders: List<Reminder>) :
    RecyclerView.Adapter<ReminderAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun dataBind(reminder: Reminder) {
            itemView.tvReminder.text = reminder.reminderText
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_reminder, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataBind(reminders[position])
    }

    override fun getItemCount(): Int {
        return reminders.size
    }
}