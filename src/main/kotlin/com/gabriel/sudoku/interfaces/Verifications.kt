package com.gabriel.sudoku.interfaces

interface Verifications {
    fun isValid(matrix : Array<IntArray>) : Boolean
    fun isSolved(matrix : Array<IntArray>) : Boolean
}