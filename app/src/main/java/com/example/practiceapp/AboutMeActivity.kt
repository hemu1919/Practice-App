package com.example.practiceapp

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.practiceapp.data.MyName
import com.example.practiceapp.databinding.ActivityAboutMeBinding

class AboutMeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutMeBinding
    private lateinit var inputMethodManager: InputMethodManager

    private val myName: MyName = MyName("Ann Handley")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about_me)
        binding.myName = myName
        inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        binding.apply {
            doneButton.setOnClickListener {
                addNickname(it)
            }
        }
    }

    private fun addNickname(view: View) {
        binding.apply {
            myName?.nickName = nicknameEditText.text.toString()

            nicknameEditText.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
            invalidateAll()
        }

        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

}