package com.ice.repositorioejercicios.ReciclerView

class ReciclerViewPresenter(private val reciclerViewView:ReciclerViewContract.View, private val reciclerViewModel : ReciclerViewContract.Model) : ReciclerViewContract.Presenter {

    override fun getListSuperHeros(){
        reciclerViewView.initRecycler(reciclerViewModel.getListSuperHeros())
    }
}