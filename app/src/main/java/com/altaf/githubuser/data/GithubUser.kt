package com.altaf.githubuser.data

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class GithubUser(
    val username: String?,
    val name: String?,
    val image: Int?,
    val location: String?,
    val followers: String?,
    val following: String?
) : Parcelable
