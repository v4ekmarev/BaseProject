package com.justcashback.ims_justcash.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.justcashback.ims_justcash.R
import com.justcashback.ims_justcash.databinding.FragmentDashboardBinding
import com.justcashback.ims_justcash.ui.base.BaseFragment
import com.justcashback.ims_justcash.ui.base.viewbindings.withrefceltion.viewBinding

class DashboardFragment : BaseFragment(R.layout.fragment_dashboard) {

    private lateinit var dashboardViewModel: DashboardViewModel

    val asd: FragmentDashboardBinding by viewBinding()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
                ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        return root
    }
}