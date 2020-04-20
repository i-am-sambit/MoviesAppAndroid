package com.sambitprakash.bookmymovie.networkManager

sealed class Result<out SuccessResponse, out FailureResponse> {
    data class Success<SuccessResponse>(val response: SuccessResponse) : Result<SuccessResponse, Nothing>()
    data class Failure<FailureResponse>(val response: FailureResponse) : Result<Nothing, FailureResponse>()
}


