package com.example.lesson_7_homework_month_3

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson_7_homework_month_3.databinding.ItemSongsBinding

class SongsAdapter(private var songsList: ArrayList<SongModel>): RecyclerView.Adapter<SongsAdapter.MusicViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return  MusicViewHolder(ItemSongsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = songsList.size

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(songsList[position])
        holder.itemView.setOnClickListener{
            val musicName = songsList[position].nameOfSong
            val intent = Intent(holder.itemView.context, SecondActivity::class.java)
            intent.putExtra("musicName", musicName)
            holder.itemView.context.startActivity(intent)
        }
    }


    inner class MusicViewHolder(private var binding: ItemSongsBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item:SongModel){
            binding.run {
                numberOfSong.text = item.number
                songLength.text = item.lengthOfSong
                nameOfSong.text = item.nameOfSong
                singer.text = item.singer
            }
        }
    }
}