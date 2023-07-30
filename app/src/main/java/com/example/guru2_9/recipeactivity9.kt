package com.example.guru2_9
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View

import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class recipeactivity9 : AppCompatActivity() {

    fun onBackIconClick(view: View) {
        onBackPressed()
    }

    private var isBookmarkFilled = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipebook2_9x)

        val cucumberImageView = findViewById<ImageView>(R.id.cucumber1)
        cucumberImageView.setOnClickListener {
            val recipeLinkUrl = "https://blog.naver.com/hz__00/223167206053"
            val linkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(recipeLinkUrl))
            startActivity(linkIntent)
        }

        val cucumber2ImageView = findViewById<ImageView>(R.id.cucumber2)
        cucumber2ImageView.setOnClickListener {
            val recipeLinkUrl = "https://blog.naver.com/hz__00/223167206281"
            val linkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(recipeLinkUrl))
            startActivity(linkIntent)
        }

        val cucumber3ImageView= findViewById<ImageView>(R.id.cucumber3)
        cucumber3ImageView.setOnClickListener {
            val recipeLinkUrl = "https://blog.naver.com/hz__00/223167206473"
            val linkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(recipeLinkUrl))
            startActivity(linkIntent)
        }

        val bookmarkIcon1 = findViewById<ImageView>(R.id.bookmark9)
        bookmarkIcon1.setOnClickListener {
            isBookmarkFilled = !isBookmarkFilled

            if (isBookmarkFilled) {
                bookmarkIcon1.setImageResource(R.drawable.bookmark7)
            } else {
                bookmarkIcon1.setImageResource(R.drawable.bookmark8)
            }
        }

        val bookmarkIcon2 = findViewById<ImageView>(R.id.bookmark8)
        bookmarkIcon2.setOnClickListener {
            isBookmarkFilled = !isBookmarkFilled

            if (isBookmarkFilled) {
                bookmarkIcon2.setImageResource(R.drawable.bookmark7)
            } else {
                bookmarkIcon2.setImageResource(R.drawable.bookmark8)
            }
        }

        val bookmarkIcon3 = findViewById<ImageView>(R.id.bookmark7)
        bookmarkIcon3.setOnClickListener {
            isBookmarkFilled = !isBookmarkFilled

            if (isBookmarkFilled) {
                bookmarkIcon3.setImageResource(R.drawable.bookmark7)
            } else {
                bookmarkIcon3.setImageResource(R.drawable.bookmark8)
            }
        }


    }
}
