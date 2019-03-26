package com.arch.compsmvvm.di

import com.arch.compsmvvm.presentation.activity.MainViewModel
import org.koin.android.viewmodel.experimental.builder.viewModel
import org.koin.dsl.module.module

val viewModelModule = module {
    viewModel<MainViewModel>()
}