package com.vinhbqph33437.lab6.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    private val _username = MutableLiveData<String>()
    val username: LiveData<String> = _username
    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password
    private val _rememberMe = MutableLiveData<Boolean>()
    val rememberMe: LiveData<Boolean> = _rememberMe
    private val _isAuthenticated = MutableLiveData<Boolean?>()
    val isAuthenticated: LiveData<Boolean?> = _isAuthenticated

    fun login(username: String, password: String, rememberMe: Boolean) {
        if (username.equals("vinhvn123") && password.equals("vinhvn123")) {
            _isAuthenticated.value = true
        } else {
            _isAuthenticated.value = false
        }
    }

    fun resetAuthenticationState() {
        _isAuthenticated.value = null
    }

    fun updateUsername(newUsername: String) {
        _username.value = newUsername
    }

    fun updatePassword(newPassword: String) {
        _password.value = newPassword
    }

    fun updateRememberMe(isRememberMe: Boolean) {
        _rememberMe.value = isRememberMe
    }
}
