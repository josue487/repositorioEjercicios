package com.ice.repositorioejercicios.Dagger2

import com.ice.repositorioejercicios.Dagger2Activity
import com.ice.repositorioejercicios.Inicio.InicioActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [Module::class])
interface Component {

    fun inject(dagger2Activity: Dagger2Activity)

}