package com.saqib.testapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.saqib.testapp.base.BaseVM
import com.saqib.testapp.helper.Constants
import com.saqib.testapp.model.FactsModel
import com.saqib.testapp.networking.ApiClient
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import retrofit2.Response

class MainActivityVM : BaseVM() {

    fun getFactsLists(): LiveData<FactsModel> {
        val model: MutableLiveData<FactsModel> = MutableLiveData()
        showLoading()
        ApiClient
            .getClient()
            .requestFactsList()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Response<FactsModel>> {
                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable) {
                    getDisposable().add(d)
                }

                override fun onNext(t: Response<FactsModel>) {
                    hideLoading()
                    when {
                        t.code() == Constants.ErrorCodes.OK200 -> {
                            model.postValue(t.body())
                        }
                        t.code() == Constants.ErrorCodes.ERROR401 -> {
                            hasError(Constants.ErrorMessage.COMMON_UN_IDENTIFIED)
                        }
                        else -> {
                            hasError(Constants.ErrorMessage.COMMON_UN_IDENTIFIED)
                        }
                    }
                }

                override fun onError(e: Throwable) {
                    hideLoading()
                    hasError("${e.cause}")
                }
            })
        return model
    }
}