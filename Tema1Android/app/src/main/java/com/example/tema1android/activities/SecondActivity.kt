package com.example.tema1android.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.tema1android.R
import com.example.tema1android.fragments.F1A2
import com.example.tema1android.fragments.F2A2
import com.example.tema1android.fragments.F3A2
import com.example.tema1android.interfaces.ActivityFragmentCommunication

class SecondActivity : AppCompatActivity(), ActivityFragmentCommunication {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        addFirstFragmentFragment()
    }

    fun addFirstFragmentFragment() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val firstFragment = F1A2.newInstance()
        val tag = F1A2::class.java.name

        val addTransaction = transaction.add(
                R.id.frame_layout, firstFragment, tag
        )
        //addTransaction.addToBackStack(tag)
        addTransaction.commit()


    }



    override fun replaceF2A2() {

        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F1A2::class.java.name

        val replaceTransaction = transaction.add(
                R.id.frame_layout, F2A2.newInstance("", ""), tag
        )
        replaceTransaction.addToBackStack(tag)

        replaceTransaction.commit()
    }

    override fun replaceF3A2() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F2A2::class.java.name

        val replaceTransaction = transaction.replace(
                R.id.frame_layout, F3A2.newInstance("", ""), tag
        )
        replaceTransaction.addToBackStack(tag)

        replaceTransaction.commit()
    }
    override fun removeF1A2() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F1A2::class.java.name
        val fragmentF1A2=fragmentManager.findFragmentByTag(tag) ?: return

        val replaceTransaction = transaction.remove(fragmentF1A2)
        replaceTransaction.addToBackStack(tag)

        replaceTransaction.commit()
    }

    override fun openSecondActivity() {
        TODO("Not yet implemented")
    }


}


