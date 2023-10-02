package com.example.lesson_7_homework_month_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson_7_homework_month_3.databinding.FragmentSongsListBinding

class FragmentSongsList : Fragment() {
    private lateinit var binding: FragmentSongsListBinding
    private val songsList = arrayListOf(
        SongModel("1", "Вера в любовь", "Абир Касенов", "3:53"),
        SongModel("2", "The Hills", "The Weekend", "4:02"),
        SongModel("3", "Расстояние", "Ulukmanapo", "3:00"),
        SongModel("4", "Миледи", "Ulukmanapo", "2:53"),
        SongModel("5", "Unforgetable", "French Montana", "3:54"),
        SongModel("6", "Company", "Justin Bieber", "3:28"),
        SongModel("7", "I got Love", "Miyagi & Эндшпиль", "4:37"),
        SongModel("8", "Жаным", "Абир Касенов", "3:29"),
        SongModel("9", "The Color Violet", "Tory Lanez", "3:47"),
        SongModel("10", "Low", "SZA", "3:01")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSongsListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = SongsAdapter(songsList)
        binding.rvSongs.adapter = adapter
    }
}