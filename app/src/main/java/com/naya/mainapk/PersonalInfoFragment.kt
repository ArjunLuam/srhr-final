package com.naya.mainapk

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.datepicker.MaterialDatePicker
import kotlinx.android.synthetic.main.fragment_personal_info.*

class PersonalInfoFragment : Fragment(R.layout.fragment_personal_info){
      private  lateinit var gender:String


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       val listArray = resources.getStringArray(R.array.countries_array)
        val adapter = ArrayAdapter(requireContext(),R.layout.dropdown_item,listArray)
        countriesList.setAdapter(adapter)
        countriesList.setText("",false)
        textView7.setOnClickListener { findNavController().navigate(R.id.action_personalInfoFragment_to_faqChoices3) }

        chipMale.setOnClickListener {
            chipFemale.isChecked = false
            chipOthers.isChecked = false
            chipMale.setChipBackgroundColorResource(R.color.textColorPrimary)
            chipMale.setTextColor(resources.getColor(R.color.shrine_pink_900))
            chipFemale.setChipBackgroundColorResource(R.color.shrine_pink_900)
            chipFemale.setTextColor(resources.getColor(R.color.textColorPrimary))
            chipOthers.setChipBackgroundColorResource(R.color.shrine_pink_900)
            chipOthers.setTextColor(resources.getColor(R.color.textColorPrimary))
            gender = "Male"
        }
        chipFemale.setOnClickListener {
            chipMale.isChecked = false
            chipOthers.isChecked = false
            chipFemale.setChipBackgroundColorResource(R.color.textColorPrimary)
            chipFemale.setTextColor(resources.getColor(R.color.shrine_pink_900))

            chipMale.setChipBackgroundColorResource(R.color.shrine_pink_900)
            chipMale.setTextColor(resources.getColor(R.color.textColorPrimary))
            chipOthers.setChipBackgroundColorResource(R.color.shrine_pink_900)
            chipOthers.setTextColor(resources.getColor(R.color.textColorPrimary))
            gender = "Female"
        }
        chipOthers.setOnClickListener {
            chipMale.isChecked = false
            chipFemale.isChecked = false
            chipOthers.setChipBackgroundColorResource(R.color.textColorPrimary)
            chipOthers.setTextColor(resources.getColor(R.color.shrine_pink_900))

            chipMale.setChipBackgroundColorResource(R.color.shrine_pink_900)
            chipMale.setTextColor(resources.getColor(R.color.textColorPrimary))

            chipFemale.setChipBackgroundColorResource(R.color.shrine_pink_900)
            chipFemale.setTextColor(resources.getColor(R.color.textColorPrimary))
            gender = "Others"
        }

        textViewBirthday.setOnClickListener {
            val materialBuilder= MaterialDatePicker.Builder.datePicker();
            materialBuilder.setTitleText("SELECT A DATE")
             val materialDatePicker = materialBuilder.build()

            fragmentManager?.let { it1 -> materialDatePicker.show(it1,"MATERIAL_DATE_PICKER") };


            materialDatePicker.addOnPositiveButtonClickListener {
                textViewBirthday.text = materialDatePicker.headerText
            }

            materialDatePicker.addOnNegativeButtonClickListener{
                materialDatePicker.dismiss()
            }


        }
    }
}