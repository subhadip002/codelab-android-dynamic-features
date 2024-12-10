package com.app.platform

import android.content.Context
import com.app.impl.IncodeKYCLauncherImpl
import com.app.navigation.IncodeKYCNavigator

class OpenNavigationModule(
    private val context: Context,
    private val invodeKYCNavigator: IncodeKYCNavigator = IncodeKYCNavigator(
        IncodeKYCLauncherImpl(
            context
        )
    )
) {
    fun startKYCNavigation() {
        invodeKYCNavigator.launchIncodeKyc()
    }
}