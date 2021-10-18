package com.ice.repositorioejercicios.Result

interface ResultContract {
    interface View{
        fun iniciarApp(name : String, vip : Boolean)
    }
    interface Presenter{
        fun iniciarApp()
        fun cerrarSecion()
    }
    interface Model{

    }
}