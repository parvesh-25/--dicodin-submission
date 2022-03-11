package com.altaf.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.altaf.githubuser.data.GithubUser
import com.altaf.githubuser.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private var _binding:ActivityDetailBinding? = null
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val dataGithubUser = intent.getParcelableExtra<GithubUser>(GITHUB_USER_DATA) as GithubUser


        binding.apply {
            tvUsername.text = dataGithubUser.username
            tvNama.text = dataGithubUser.name
            tvLocation.text = dataGithubUser.location
            tvFollowers.text = dataGithubUser.followers
            tvFollowing.text = dataGithubUser.following
            imgDetail.setBackgroundResource(dataGithubUser.image!!)
        }
    }

    // tombol back di actionbar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    companion object{
        const val GITHUB_USER_DATA = "githubuser"
        const val EXTRA_USERNAME = "username"
        const val EXTRA_NAME = "name"
        const val EXTRA_IMAGE = "image"
        const val EXTRA_LOCATION = "location"
        const val EXTRA_FOLLOWERS = "followers"
        const val EXTRA_FOLLOWING = "following"
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}