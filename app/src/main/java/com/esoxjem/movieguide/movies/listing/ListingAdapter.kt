package com.esoxjem.movieguide.movies.listing

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.esoxjem.movieguide.GlideApp
import com.esoxjem.movieguide.R
import com.esoxjem.movieguide.movies.models.Movie
import kotlinx.android.synthetic.main.movie_grid_item.view.*
import java.util.*


class ListingAdapter : RecyclerView.Adapter<ListingAdapter.ViewHolder>() {

    private var movies: List<Movie> = ArrayList()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val root = (LayoutInflater.from(parent.context).inflate(R.layout.movie_grid_item, parent, false))
        return ViewHolder(root)
    }

    fun addMovies(movies: List<Movie>?) {
        if (movies != null) {
            this.movies = movies
            notifyDataSetChanged()
        }
    }

    inner class ViewHolder(root: View) : RecyclerView.ViewHolder(root) {
        fun bind(movie: Movie) = with(itemView) {
            title.text = movie.title

            GlideApp.with(context).load(movie.getPosterUrl()).into(poster)
        }
    }
}