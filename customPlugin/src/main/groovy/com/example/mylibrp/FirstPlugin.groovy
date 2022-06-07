package com.example.mylibrp

import org.gradle.api.Plugin
import org.gradle.api.Project

 class TestPlugin implements Plugin<Project>  {
    void apply(Project project) {
        project.task('testTask') {
            println "Hello test gradle plugin"
        }
    }
}