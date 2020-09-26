package com.github.evelios.intellijelmmarkup.services

import com.intellij.openapi.project.Project
import com.github.evelios.intellijelmmarkup.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
