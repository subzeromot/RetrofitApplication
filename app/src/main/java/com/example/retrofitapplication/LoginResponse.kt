package com.example.retrofitapplication

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("access_token")
    var authToken: String
)
