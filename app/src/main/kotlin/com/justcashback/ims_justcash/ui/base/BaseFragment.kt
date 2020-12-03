package com.justcashback.ims_justcash.ui.base

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.justcashback.ims_justcash.di.Injectable
import javax.inject.Inject

open class BaseFragment(@LayoutRes private val layoutId: Int) : Fragment(layoutId), Injectable {

    @Inject
    protected lateinit var viewModelFactory: ViewModelProvider.Factory
}