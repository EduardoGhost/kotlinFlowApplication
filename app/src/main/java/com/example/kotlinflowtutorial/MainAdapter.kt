package com.example.kotlinflowtutorial

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinflowtutorial.databinding.ItemGameBinding

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    private val games: MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(games[position])
    }

    override fun getItemCount() = games.count()

    fun addGame(game: String) {
        games.add(game)
        notifyItemInserted(itemCount)
    }

    class MainViewHolder(
        private val binding: ItemGameBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(game: String) {
            binding.textGame.text = game
        }

        companion object {
            fun create(
                parent: ViewGroup
            ): MainViewHolder {
                val itemBinding = ItemGameBinding
                    .inflate(LayoutInflater.from(parent.context), parent, false)

                return MainViewHolder(itemBinding)
            }
        }
    }
}