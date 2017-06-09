package com.example.quanlm.android_custom_view_demo.listMovies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.quanlm.android_custom_view_demo.R;
import com.example.quanlm.android_custom_view_demo.model.Movie;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by QuanLM on 6/9/2017.
 */

class MovieAdaper extends RecyclerView.Adapter<MovieAdaper.MovieViewHolder> {
    List<Movie> lstMovie;
    Context mContext;

    public MovieAdaper(List<Movie> lstMovie, Context mContext) {
        this.lstMovie = lstMovie;
        this.mContext = mContext;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View movieItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        MovieViewHolder movieViewHolder = new MovieViewHolder(movieItemView);
        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie item = lstMovie.get(position);
        holder.txtMovieThumb.setText(item.getMovieThumb());
        holder.txtMovieName.setText(item.getMovieName());
        holder.txtMovieDescription.setText(item.getMovieDescription());
    }

    @Override
    public int getItemCount() {
        return lstMovie.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView txtMovieThumb;
        TextView txtMovieName;
        TextView txtMovieDescription;

        public MovieViewHolder(View itemView) {
            super(itemView);
            txtMovieThumb = (TextView) itemView.findViewById(R.id.txtMovieThumb);
            txtMovieName = (TextView) itemView.findViewById(R.id.txtMovieName);
            txtMovieDescription = (TextView) itemView.findViewById(R.id.txtMovieDescription);
        }
    }
}
