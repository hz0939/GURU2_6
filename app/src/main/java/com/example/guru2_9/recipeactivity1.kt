package com.example.guru2_9
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View

import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class recipeactivity1 : AppCompatActivity() {

    fun onBackIconClick(view: View) {
        onBackPressed() // 뒤로가기

    }
    private var isBookmarkFilled = false //초기값은 false로, 북마크로 지정되지 않은 상태




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipebook2_1x)

        val milk1ImageView = findViewById<ImageView>(R.id.milk1)
        milk1ImageView.setOnClickListener {
            // 레시피 링크로 이동하는 코드
            val recipeLinkUrl = "https://blog.naver.com/hz__00/223167189856"
            val linkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(recipeLinkUrl))
            startActivity(linkIntent)
        }

        val milk2ImageView = findViewById<ImageView>(R.id.milk2)
        milk2ImageView.setOnClickListener {
            val recipeLinkUrl = "https://blog.naver.com/hz__00/223167189498"
            val linkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(recipeLinkUrl))
            startActivity(linkIntent)
        }

        val milk3ImageView = findViewById<ImageView>(R.id.milk3)
        milk3ImageView.setOnClickListener {
            val recipeLinkUrl = "https://blog.naver.com/hz__00/223167189263"
            val linkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(recipeLinkUrl))
            startActivity(linkIntent)
        }




        val bookmarkIcon1 = findViewById<ImageView>(R.id.bookmark9)
        bookmarkIcon1.setOnClickListener {
            isBookmarkFilled = !isBookmarkFilled

            if (isBookmarkFilled) {
                bookmarkIcon1.setImageResource(R.drawable.bookmark7) //비어있는 북마크 아이콘으로 변경
            } else {
                bookmarkIcon1.setImageResource(R.drawable.bookmark8) // 차있는 북마크 아이콘으로 변경
            }
        }

        val bookmarkIcon2 = findViewById<ImageView>(R.id.bookmark8)
        bookmarkIcon2.setOnClickListener {
            isBookmarkFilled = !isBookmarkFilled

            if (isBookmarkFilled) {  //변수의 값에 따라서 채워진 아이콘과 빈 아이콘을 번갈아 보여줌
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


