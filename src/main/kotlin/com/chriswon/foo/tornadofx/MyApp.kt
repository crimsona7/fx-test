package com.chriswon.foo.tornadofx

import javafx.collections.FXCollections
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import tornadofx.*

class MyApp: App(MyView::class)

class MyView: View() {
    val controller: MyController by inject()
    var inputField: TextField by singleAssign()

    override val root = vbox {
        label("My items")
        listview(controller.values)

    }
}

class MyController: Controller() {
    val values = FXCollections.observableArrayList("Alpha", "Beta", "Gamma", "Delta")
}

