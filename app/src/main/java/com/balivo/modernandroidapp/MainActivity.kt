package com.balivo.modernandroidapp

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.balivo.modernandroidapp.databinding.ActivityMainBinding
import com.balivo.modernandroidapp.uimodels.Repository

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    var repository = Repository("Medium Android Repository Article",
            "Balivo", 1000, true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        binding.apply {
//            repositoryName.text = "Medium Android Repository Article"
//            repositoryOwner.text = "Balivo"
//            numberOfStarts.text = "1000 stars"
//
//        }
        binding.repository = repository
        binding.executePendingBindings()
        Handler().postDelayed({repository.repositoryName="New Name"
        }, 2000)
    }
}
