package com.websarva.wings.android.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //ボタンをクリックしたときのリスナクラス。
    private inner class HelloListener : View.OnClickListener {
        override fun onClick(view: View) {
            //名前入力欄であるEditTextオブジェクトを取得。
            val input = findViewById<EditText>(R.id.etName)
            //メッセージを表示するTextViewオブジェクトを取得。
            val output = findViewById<TextView>(R.id.tvOutput)
            //入力された名前文字列を取得。
            val inputStr = input.text.toString()
            //メッセージを表示。
            output.text = inputStr + "さん、こんにちは！"
        }
    }
}