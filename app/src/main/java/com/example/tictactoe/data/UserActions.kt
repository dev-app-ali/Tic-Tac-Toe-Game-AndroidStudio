package com.example.tictactoe.data

sealed class UserActions {
    object  PlayAgainButtonClicked : UserActions()
    data class  BoardTapped( val cellNo: Int): UserActions()
}