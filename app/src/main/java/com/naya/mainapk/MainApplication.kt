package com.naya.mainapk

import com.akexorcist.localizationactivity.ui.LocalizationApplication
import java.util.*

class MainApplication: LocalizationApplication() {
    /* ... */
    override fun getDefaultLanguage() = Locale.ENGLISH
}