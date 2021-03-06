package com.example.andrioddemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.andrioddemo.databinding.RecyclerviewMovieBinding

class MoviesAdapter (
    private val movies : List<Movie>
) : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>(){

    override fun getItemCount() = movies.count()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MoviesViewHolder (

        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.recyclerview_movie,
            parent,false
        )
    )

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.recyclerviewMovieBinding.movie = movies[position]
    }

    inner class  MoviesViewHolder(
        val recyclerviewMovieBinding : RecyclerviewMovieBinding
    ) : RecyclerView.ViewHolder(recyclerviewMovieBinding.root)
}