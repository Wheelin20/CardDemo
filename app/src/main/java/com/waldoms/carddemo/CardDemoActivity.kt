package com.waldoms.carddemo

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.waldoms.carddemo.databinding.ActivityCardDemoBinding

import kotlinx.android.synthetic.main.activity_card_demo.*

class CardDemoActivity : AppCompatActivity() {
    private lateinit var mViewModel:CardViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_demo)

        setupBindings()

        setSupportActionBar(toolbar)
    }

    private fun setupBindings()
    {
        val binding:ActivityCardDemoBinding = DataBindingUtil.setContentView(this, R.layout.activity_card_demo)
        mViewModel = ViewModelProviders.of(this).get(CardViewModel::class.java)
        binding.viewModel = mViewModel
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_card_demo, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
