package com.ice.repositorioejercicios.Interfaces

interface Game {
    val game : String
     fun play() : String
     fun stream() : String {
         return "Estoy haciendo stream de mi juego $game"
     }
}