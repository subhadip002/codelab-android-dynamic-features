package com.app.impl

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IncodeKYCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_incode_kycactivity)

        // Get the asset manager with a refreshed context, to access content of newly installed apk.
        val assetManager = createPackageContext(packageName, 0).assets
        // Now treat it like any other asset file.
        val assets = assetManager.open("assets.txt")
        val assetContent = assets.bufferedReader()
            .use {
                it.readText()
            }

        findViewById<TextView>(R.id.textView).text = assetContent
    }
}