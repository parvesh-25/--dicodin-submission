package com.altaf.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.altaf.githubuser.data.GithubUser
import com.altaf.githubuser.data.GithubUserData
import com.altaf.githubuser.data.ListUserAdapter
import com.altaf.githubuser.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var rvList: RecyclerView
    private val list: ArrayList<GithubUser> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvList = findViewById(R.id.rv_user)
        rvList.setHasFixedSize(true)

        list.addAll(GithubUserData.listGithubUser)
        showRecycleList()
    }

    private fun showRecycleList() {
        rvList.layoutManager = LinearLayoutManager(this)
        val listGithubUserAdapter = ListUserAdapter(list)
        rvList.adapter = listGithubUserAdapter
    }
}