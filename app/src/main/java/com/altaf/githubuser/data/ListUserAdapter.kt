package com.altaf.githubuser.data

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.altaf.githubuser.DetailActivity
import com.altaf.githubuser.R
import com.altaf.githubuser.databinding.RowItemListBinding
import java.util.ArrayList

class ListUserAdapter(private val listUser : ArrayList<GithubUser>) :RecyclerView.Adapter<ListUserAdapter.ListViewHolder>() {

    inner class ListViewHolder(private val binding: RowItemListBinding) :
    RecyclerView.ViewHolder(binding.root){

        fun bindItem(githubUser: GithubUser){
            binding.imgItemPhoto.setImageResource(githubUser.image!!)
            binding.tvItemUsername.text = githubUser.username
            binding.tvItemLocation.text = githubUser.location
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder = ListViewHolder(
        RowItemListBinding.inflate(LayoutInflater.from(parent.context),parent, false)
    )


    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindItem(listUser[position])
        holder.itemView.setOnClickListener{
            val intent = Intent(it.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.GITHUB_USER_DATA, listUser[position])
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = listUser.size
}