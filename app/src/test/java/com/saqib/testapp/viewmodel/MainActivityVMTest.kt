package com.saqib.testapp.viewmodel

import androidx.lifecycle.*
import com.saqib.testapp.model.FactsModel
import junit.framework.Assert.assertNotNull
import junit.framework.Assert.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MainActivityVMTest {

    private lateinit var viewModel: MainActivityVM

    @Mock
    var lifecycleOwner: LifecycleOwner? = null
    var lifecycle: Lifecycle? = null

    @Mock
    var observer: Observer<FactsModel>? = null

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        lifecycle = LifecycleRegistry(lifecycleOwner!!)
        viewModel = MainActivityVM()
        observer?.let { viewModel.getFactsLists().observeForever(it) }
    }

    @Test
    fun testNull() {
        `when`(viewModel.getFactsLists()).thenReturn(null)
        assertNotNull(viewModel.getFactsLists())
        assertTrue(viewModel.getFactsLists().hasObservers())
    }

    @Test
    fun fetchValidData() {
        val model: MutableLiveData<FactsModel> = MutableLiveData()
        `when`(viewModel.getFactsLists())
            .thenReturn(model)
        val values = viewModel.getFactsLists()
        verify(observer)?.onChanged(values.value)
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
    }


}