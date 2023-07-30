package com.example.guru2_9
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View

import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class recipeactivity7 : AppCompatActivity() {

    fun onBackIconClick(view: View) {
        onBackPressed()
    }

    private var isBookmarkFilled = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipebook2_7x)

        val saladImageView = findViewById<ImageView>(R.id.salad1)
        saladImageView.setOnClickListener {
            val recipeLinkUrl = "https://blog.naver.com/hz__00/223167205015"
            val linkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(recipeLinkUrl))
            startActivity(linkIntent)
        }

        val salad2ImageView = findViewById<ImageView>(R.id.salad2)
        salad2ImageView.setOnClickListener {
            val recipeLinkUrl = "https://blog.naver.com/hz__00/223167205188"
            val linkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(recipeLinkUrl))
            startActivity(linkIntent)
        }

        val salad3ImageView= findViewById<ImageView>(R.id.salad3)
        salad3ImageView.setOnClickListener {
            val recipeLinkUrl = "https://blog.naver.com/hz__00/223167205371"
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



