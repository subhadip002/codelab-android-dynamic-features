/*
 * Copyright 2018 Google LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.samples.dynamicfeatures.ondemand

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.google.android.samples.dynamicfeatures.BaseSplitActivity
import com.google.android.samples.dynamicfeatures.ondemand.kotlin.R

/** A simple Activity displaying some text, written in Kotlin. */
class KotlinSampleActivity : BaseSplitActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_kotlin)

        val imageView = findViewById<View>(R.id.imageView) as ImageView

        Glide
            .with(this)
            .load("https://farm2.staticflickr.com/1533/26541536141_41abe98db3_z_d.jpg")
            .fitCenter()
            .into(imageView)

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
