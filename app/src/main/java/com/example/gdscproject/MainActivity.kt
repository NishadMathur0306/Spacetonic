package tn.doctorcode.bmi

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.gdscproject.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn).setOnClickListener {
            val h = findViewById<TextView>(R.id.height).text.toString().toFloat() /100
            val w = findViewById<TextView>(R.id.weight).text.toString().toFloat()
            val res = w/(h*h)
            findViewById<TextView>(R.id.result).text = "%.2f".format(res)
        }
    }
}