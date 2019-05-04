package com.myres.noban.simplemvp

class MainPresenter(view: MainView) {

    private var mView:MainView=view
    fun generateText(message:String){
        mView?.showToast(message+"By Noban")
    }

}