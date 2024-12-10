package com.app.impl

import android.content.Context
import android.content.Intent
import com.app.api.IncodeKYCLauncher

class IncodeKYCLauncherImpl(private val context: Context) : IncodeKYCLauncher {
    override fun launchIncodeKYC() {
        context.startActivity(Intent(context, IncodeKYCActivity::class.java))
    }
}