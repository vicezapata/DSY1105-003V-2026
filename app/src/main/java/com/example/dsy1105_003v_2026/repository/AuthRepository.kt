package com.example.dsy1105_003v_2026.repository

import com.example.dsy1105_003v_2026.model.Credential

class AuthRepository (
    private val validCredential: Credential = Credential.Admin
){
    fun login(username:String, password:String): Boolean{
        return username == validCredential.username && password == validCredential.password
    }

}