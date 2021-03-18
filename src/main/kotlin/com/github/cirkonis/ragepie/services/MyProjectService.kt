package com.github.cirkonis.ragepie.services

import com.github.cirkonis.ragepie.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
