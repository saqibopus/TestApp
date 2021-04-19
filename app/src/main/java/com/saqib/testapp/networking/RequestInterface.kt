package com.saqib.testapp.networking

import com.saqib.testapp.helper.Constants
import com.saqib.testapp.model.FactsModel
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET

interface RequestInterface {
    @GET(Constants.ENDPOINTS.FACTS_LIST)
    fun requestFactsList(): Observable<Response<FactsModel>>
}