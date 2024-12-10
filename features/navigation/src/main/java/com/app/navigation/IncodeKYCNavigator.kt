package com.app.navigation

import com.app.api.IncodeKYCLauncher

class IncodeKYCNavigator(private val inccodeKYCLauncher: IncodeKYCLauncher) {
    fun launchIncodeKyc() {
        inccodeKYCLauncher.launchIncodeKYC()
    }
}