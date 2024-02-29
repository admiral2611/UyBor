package com.admiral26.uybor.core.cache

import android.content.Context
import com.admiral26.uybor.util.BooleanPreference
import com.admiral26.uybor.util.StringPreference
import com.securepreferences.SecurePreferences
import javax.inject.Singleton

@Singleton
class LocalStorage (context: Context) {
    private val KEY = "fqewjfqiwjfofjeihfjoqrhhfrRH[ORH[R[FHRhR=]E8JFQF9JFI"
    private val securePref = SecurePreferences(context,KEY,"local_security.xml")

    var isFirst:Boolean by BooleanPreference(securePref,true)
    var access:String by StringPreference(securePref,"")
}