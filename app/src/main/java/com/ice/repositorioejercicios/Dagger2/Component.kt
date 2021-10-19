package com.ice.repositorioejercicios.Dagger2

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [Module::class])
interface Component {

    fun inject(dagger2Activity: Dagger2Activity)

}