package com.github.cirkonis.ragepie

import com.intellij.openapi.actionSystem.AnActionEvent

import com.intellij.openapi.actionSystem.AnAction
import org.jetbrains.annotations.NotNull
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import org.jetbrains.annotations.Nullable


class PopupDialogAction : AnAction() {

override fun update(e: AnActionEvent) {
    // Set the availability based on whether a project is open
    val project = e.project
    e.presentation.isEnabledAndVisible = project != null
}


    override fun actionPerformed(@NotNull event: AnActionEvent) {
    // Using the event, create and show a dialog
    val currentProject:
            @Nullable Project? = event.project
    val dlgMsg = "ALL YOUR API ARE BELONG TO ME"
    val dlgTitle = "RAGE PIE DEMANDS"
    Messages.showMessageDialog(currentProject, dlgMsg, dlgTitle, Messages.getInformationIcon())
}

}
