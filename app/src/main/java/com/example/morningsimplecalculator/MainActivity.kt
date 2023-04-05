package com.example.morningsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mAnswer:TextView
    lateinit var mFnum:EditText
    lateinit var mSnum:EditText
    lateinit var mAdd:Button
    lateinit var msub:Button
    lateinit var mDiv:Button
    lateinit var mMul:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnswer = findViewById(R.id.mTvAnswer)
        mFnum = findViewById(R.id.mEditFnum)
        mSnum = findViewById(R.id.mEdtSnum)
        mAdd = findViewById(R.id.mBtnAdd)
        msub = findViewById(R.id.mBtnSub)
        mDiv = findViewById(R.id.mBtnDiv)
        mMul = findViewById(R.id.MbTNmUL)
        //Set onclick listeners to all the buttons
        mAdd.setOnClickListener {
            //Receive the first and second number to compute
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty()||secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!"
            }else{
            //Proceed to compute the values
            var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        msub.setOnClickListener {
            //Receive the first and second number to compute
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty()||secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!"
            }else{
                //Proceed to compute the values
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
            //Receive the first and second number to compute
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty()||secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!"
            }else{
                //Proceed to compute the values
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mMul.setOnClickListener {
            //Receive the first and second number to compute
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty()||secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!"
            }else{
                //Proceed to compute the values
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
    }
}