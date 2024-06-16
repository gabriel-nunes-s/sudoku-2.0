package com.gabriel.sudoku.controller

import com.gabriel.sudoku.businessRules.Solver
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import java.net.URL
import java.util.*
import kotlin.collections.ArrayList

class MainViewController : Initializable {

    @FXML
    lateinit var gridPane: GridPane

    @FXML
    lateinit var btnSolve: Button

    @FXML
    lateinit var btnClear: Button

    @FXML
    lateinit var lblMessage: Label

    override fun initialize(p0: URL?, p1: ResourceBundle?) {

    }

    fun onBtnSolveClick() {
        val sudoku = getGridPaneValues()
        val solver = Solver(sudoku)

    }

    fun onBtnClearClick() {
        TODO("Not yet implemented")
    }

    private fun getGridPaneValues() : Array<Int>{
        val gridPaneChildren = gridPane.children
        val sudokuArray : ArrayList<Int> = ArrayList()

        for (node in gridPaneChildren) {
            if (node is TextField) {
                sudokuArray.add(if (node.text.isEmpty()) 0 else node.text.toInt())
            }
        }

        return sudokuArray.toTypedArray()
    }

    fun showSolvedGrid() {
        TODO("Not yet implemented")
    }
}