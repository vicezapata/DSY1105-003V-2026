package com.example.dsy1105_003v_2026.ui.theme.login

data class LoginUiState(
    val username:String ="",
    val password:String="",
    val isLoading: Boolean=false,
    val error:String? =null
)