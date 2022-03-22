package jp.techacademy.yuta.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }

    override fun onClick (v: View){
        val tpd = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{view,hour,minute->
                Log.d("time", "$hour : $minute");
                if(hour>=2 && hour<9) {
                    textView.text="おはよう"
                } else if (hour>=10 && hour<18) {
                    textView.text="こんにちは"
                } else {
                    textView.text="こんばんは"
                }
            },
            13,0,true)
        tpd.show()
    }
}