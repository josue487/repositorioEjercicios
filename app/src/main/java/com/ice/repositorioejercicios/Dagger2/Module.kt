package com.ice.repositorioejercicios.Dagger2

import com.ice.repositorioejercicios.Dagger2.Model.Arm
import com.ice.repositorioejercicios.Dagger2.Model.Body
import com.ice.repositorioejercicios.Dagger2.Model.Head
import com.ice.repositorioejercicios.Dagger2.Model.Leg
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton


@Module
class Module {

    @Provides
    @Singleton
    fun provideHead()=Head("Cabeza")

    @Provides
    @Singleton
    @Named("armR")
    fun provideArmR()=Arm("Brazo Derecho")

    @Provides
    @Singleton
    @Named("armL")
    fun provideArmL()=Arm("Brazo Izquierdo")

    @Provides
    @Singleton
    @Named("legR")
    fun provideLegR()=Leg("Pierna Derecha")

    @Provides
    @Singleton
    @Named("legL")
    fun provideLegL()=Leg("Pierna Izquierda")


    @Provides
    @Singleton
    fun provideBody(head : Head, @Named("armR") armR : Arm, @Named("armL") armL : Arm , @Named("legR") legR : Leg, @Named("legL") legL : Leg )=Body(head,armR,armL,legR,legL)


}