package com.example.mylibrp

import org.gradle.api.Plugin
import org.gradle.api.Project

 class FirstPlugin implements Plugin<Project>  {
    void apply(Project project) {
        project.task('testTask') {
            println "Hello Fist gradle plugin"
        }
    }
}