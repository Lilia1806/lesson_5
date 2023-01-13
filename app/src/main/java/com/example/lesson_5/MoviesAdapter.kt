package com.example.lesson_5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MoviesAdapter(private val listMovies: MutableList<String>) :
    RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    class MoviesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun onBind(listMovies: String?) {
            film.text = listMovies
        }

        private val film: TextView

        init {
            film = view.findViewById(R.id.rv_movies)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_movies, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.onBind(listMovies!![position])
    }

    override fun getItemCount(): Int {
        return listMovies!!.size
    }
}