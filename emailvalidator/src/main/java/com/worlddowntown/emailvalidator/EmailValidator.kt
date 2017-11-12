package com.worlddowntown.emailvalidator

/**
 * Created by shoji on 2017/11/12.
 */
class EmailValidator(val email: String) {
    val isValid: Boolean = "@".toRegex().containsMatchIn(email)
}