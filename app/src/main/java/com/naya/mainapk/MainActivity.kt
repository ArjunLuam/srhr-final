package com.naya.mainapk

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.akexorcist.localizationactivity.ui.LocalizationActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.util.*

class MainActivity : LocalizationActivity() {
    private lateinit var navController: NavController

    private lateinit var materialAlertDialogBuilder: MaterialAlertDialogBuilder

    companion object{
        var flag = false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment
        navController = navHostFragment.navController

        materialAlertDialogBuilder = MaterialAlertDialogBuilder(this)
     //   if(!flag)
            //showDialog()


    }

    private fun showDialog() {
        materialAlertDialogBuilder
            .setTitle("Choose Language")
            .setMessage("Click ok to select hindi language.")
            .setPositiveButton("Ok")
            { dialog, _ ->

                setLanguage(Locale("hi", "In"))
                flag = true
              //  Intent(this,MainActivity::class.java)
                dialog.dismiss()
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                setLanguage(Locale("en", "US"))
                flag =true
                dialog.dismiss()
            }
            .show()
    }


}