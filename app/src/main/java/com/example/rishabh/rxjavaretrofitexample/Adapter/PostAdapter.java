package com.example.rishabh.rxjavaretrofitexample.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rishabh.rxjavaretrofitexample.Model.Post;
import com.example.rishabh.rxjavaretrofitexample.R;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    Context context;
    List<Post> postList;

    public PostAdapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_layout,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.tv_author.setText(String.valueOf(postList.get(position).userId));
        holder.tv_title.setText(String.valueOf(postList.get(position).title));
        holder.tv_content.setText(new StringBuilder(postList.get(position).body.substring(0,20))
        .append("...").toString());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title,tv_content,tv_author;

        public PostViewHolder(View itemView) {
            super(itemView);
            tv_author=itemView.findViewById(R.id.id_txt_author);
            tv_title=itemView.findViewById(R.id.id_txt_title);
            tv_content=itemView.findViewById(R.id.id_txt_content);
        }
    }
}
