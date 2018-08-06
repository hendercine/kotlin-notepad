/*
 * Created by James Henderson on 2018
 * Copyright (c) Hendercine Productions and James Henderson 2018.
 * All rights reserved.
 *
 * Last modified 8/5/18 5:16 PM
 */

package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 *  kotlin-notepad created by artemis on 8/5/18.
 */

val Context.layoutInflater get() = LayoutInflater.from(this)