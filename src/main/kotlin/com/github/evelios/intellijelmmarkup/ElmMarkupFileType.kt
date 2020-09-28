package com.github.evelios.intellijelmmarkup

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object ElmMarkupLanguage :
    Language("Elm Markup", "text/elm-markup", "text/x-elm-markup", "application/x-elm-markup")

object ElmMarkupFileType : LanguageFileType(ElmMarkupLanguage) {

    override fun getName(): String {
        return "Elm Markup"
    }

    override fun getDescription(): String {
        return "Structured Data Markup Language"
    }

    override fun getDefaultExtension(): String {
        return "emu"
    }

    override fun getIcon(): Icon {
        return IconLoader.getIcon("/icons/icon.png")
    }
}
