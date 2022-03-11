package com.altaf.githubuser.data

import com.altaf.githubuser.R

object GithubUserData {

    private val userName = arrayOf(
        "JakeWharton",
        "AmitShekhar",
        "RomainGuy",
        "ChrisBanes",
        "David",
        "RaviTamada",
        "DenyPrasetyo",
        "BudiOktaviyan",
        "HendiSantika",
        "SidiqPermana"
    )

    private val nama = arrayOf(
        "Jake Wharton",
        "Amit Shekhar",
        "Romain Guy",
        "Chris Banes",
        "David",
        "Ravi Tamada",
        "Deny Prasetyo",
        "Budi Oktaviyan",
        "Hendi Santika",
        "Sidiq Permana"
    )

    private val userImage = arrayOf(
        R.drawable.user1,
        R.drawable.user2,
        R.drawable.user3,
        R.drawable.user4,
        R.drawable.user5,
        R.drawable.user6,
        R.drawable.user7,
        R.drawable.user8,
        R.drawable.user9,
        R.drawable.user10
    )

    private val userLocation = arrayOf(
        "Pittsburgh, PA, USA",
        "New Delhi, India",
        "California",
        "Cappadocia,Turkey",
        "Sydney, Australia",
        "Southland, New Zealand",
        "Kotagede, Yogyakarta, Indonesia",
        "Alberta's Rockies, Alberta, Canada",
        "Galápagos Islands, Ecuador",
        "Jakarta Indonesia"
    )

    private val  userFollowers= arrayOf(
        "1,733",
        "22,270 ",
        "4,926,08",
        "9884",
        "2015",
        "12,607",
        "677",
        "6,641",
        "7,995 ",
        "3,027 ²"
    )

    private val  userFollowing= arrayOf(
        "4788",
        "234",
        "43",
        "21",
        "23",
        "19",
        "47",
        "38",
        "484",
        "30"
    )

    val listGithubUser: ArrayList<GithubUser>
        get(){
            val listGithubUser = arrayListOf<GithubUser>()
            for (position in userName.indices){
                val githubUser = GithubUser(
                    username = userName[position],
                    name = nama[position],
                    image = userImage[position],
                    location = userLocation[position],
                    followers = userFollowers[position],
                    following = userFollowing[position]
                )
                listGithubUser.add(githubUser)
            }
            return listGithubUser
        }
}