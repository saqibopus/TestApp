package com.saqib.testapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.saqib.testapp.R
import com.saqib.testapp.adapters.AdapterFacts
import com.saqib.testapp.databinding.ActivityMainBinding
import com.saqib.testapp.helper.Logs
import com.saqib.testapp.helper.getMockFactsList
import com.saqib.testapp.model.FactsRowsModel
import com.saqib.testapp.viewmodel.MainActivityVM
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewmodel: MainActivityVM
    private lateinit var binding: ActivityMainBinding
    private var factsAdapter: AdapterFacts? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initUtil()
        initViewModelUtils()
        callFactsList()
    }

    private fun initUtil() {
        viewmodel = ViewModelProvider(this).get(MainActivityVM::class.java)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.swipeRefresh.setOnRefreshListener {
            callFactsList()
        }
    }

    /**
     * getError() receives errors form ViewModel.
     * getLoading() receives progress values from ViewModel.
     **/
    private fun initViewModelUtils() {
        viewmodel.getError().observe(this, Observer {
            showError(it)
        })
        viewmodel.getLoading().observe(this, Observer {
            if (it)
                showProgress()
            else
                hideProgress()
        })
    }
    /**
     * LiveData observer for Api Response
     * **/
    private fun callFactsList() {
        viewmodel.getFactsLists().observe(this, Observer {
            Logs.p("List : $it")
            initToolbar(it.title)
            initFactsAdapter(it.rows)
        })
    }

    private fun initToolbar(title: String) {
        setSupportActionBar(binding.toolbar)
        binding.toolbar.title = title
    }

    private fun initFactsAdapter(factRows: ArrayList<FactsRowsModel>) {
        binding.rvFactsList.layoutManager = LinearLayoutManager(this)
        if (factsAdapter == null) {
            factsAdapter = AdapterFacts(this, factRows)
            binding.rvFactsList.adapter = factsAdapter
        } else {
            factsAdapter?.addNewItems(factRows)
        }
    }

    private fun showProgress() {
        if (factsAdapter == null) {
            binding.rvFactsList.visibility = View.GONE
            binding.pbProgress.visibility = View.VISIBLE
            binding.tvError.visibility = View.GONE
        } else {
            swipeRefresh.isRefreshing = true
        }
    }

    private fun hideProgress() {
        if (factsAdapter == null) {
            binding.rvFactsList.visibility = View.VISIBLE
            binding.pbProgress.visibility = View.GONE
            binding.tvError.visibility = View.GONE
        } else {
            swipeRefresh.isRefreshing = false
        }
    }

    private fun showError(error: String) {
        binding.rvFactsList.visibility = View.GONE
        binding.pbProgress.visibility = View.GONE
        binding.tvError.visibility = View.VISIBLE
        binding.tvError.text = error
    }

    /**
     * Disposable will be cleared on ViewModel Base Class so
     * no need to call it manually in onDestroy()
     * **/
    override fun onDestroy() {
        super.onDestroy()
    }
}