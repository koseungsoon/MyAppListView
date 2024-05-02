package com.green.myapplistview

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        title = "그리드뷰 영화 포스터(개선)"

        var gv = findViewById<GridView>(R.id.gridView1)
        var gAdapter = MyGridAdapter(this)
        gv.adapter = gAdapter

    }

    inner class MyGridAdapter(var context: Context) : BaseAdapter() {

        var posterID = arrayOf(
            R.drawable.mov01,
            R.drawable.mov02,
            R.drawable.mov03,
            R.drawable.mov04,
            R.drawable.mov05,
            R.drawable.mov06,
            R.drawable.mov07,
            R.drawable.mov08,
            R.drawable.mov09,
            R.drawable.mov10,
            R.drawable.mov01,
            R.drawable.mov02,
            R.drawable.mov03,
            R.drawable.mov04,
            R.drawable.mov05,
            R.drawable.mov06,
            R.drawable.mov07,
            R.drawable.mov08,
            R.drawable.mov09,
            R.drawable.mov10,
            R.drawable.mov01,
            R.drawable.mov02,
            R.drawable.mov03,
            R.drawable.mov04,
            R.drawable.mov05,
            R.drawable.mov06,
            R.drawable.mov07,
            R.drawable.mov08,
            R.drawable.mov09,
            R.drawable.mov10
        )

        var posterTitle = arrayOf(
            "써니",
            "완득이",
            "괴물",
            "라디오스타",
            "비열한거리",
            "왕의남자",
            "아일랜드",
            "웰컴투동막골",
            "헬보이",
            "빽투더퓨처",
            "써니",
            "완득이",
            "괴물",
            "라디오스타",
            "비열한거리",
            "왕의남자",
            "아일랜드",
            "웰컴투동막골",
            "헬보이",
            "빽투더퓨처",
            "써니",
            "완득이",
            "괴물",
            "라디오스타",
            "비열한거리",
            "왕의남자",
            "아일랜드",
            "웰컴투동막골",
            "헬보이",
            "빽투더퓨처",
            "써니",
            "완득이",
            "괴물",
            "라디오스타",
            "비열한거리",
            "왕의남자",
            "아일랜드",
            "웰컴투동막골",
            "헬보이",
            "빽투더퓨처"
        )

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var imageView= ImageView(context)
            imageView.layoutParams= ViewGroup.LayoutParams(200,300)
            imageView.scaleType= ImageView.ScaleType.FIT_CENTER
            imageView.setPadding(5,5,5,5)

            imageView.setImageResource(posterID[p0])

            imageView.setOnClickListener{
                var dialogView= View.inflate(this@MainActivity,R.layout.dialog,null)
                var dlg= AlertDialog.Builder(this@MainActivity)
                var ivPoster=dialogView.findViewById<ImageView>(R.id.ivPoster)
                ivPoster.setImageResource(posterID[p0])
                dlg.setTitle(posterTitle[p0])
                dlg.setIcon(R.drawable.movie_icon)
                dlg.setView(dialogView)
                dlg.setNegativeButton("닫기",null)
                dlg.show()
            }
            return imageView
        }

        override fun getItem(position: Int): Any? {
            return 0
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getCount(): Int {
            return posterID.size
        }

    }
}