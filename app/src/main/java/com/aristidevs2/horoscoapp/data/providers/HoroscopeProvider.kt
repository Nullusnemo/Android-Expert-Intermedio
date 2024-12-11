package com.aristidevs2.horoscoapp.data.providers

import com.aristidevs2.horoscoapp.domain.model.HoroscopeInfo
import com.aristidevs2.horoscoapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}


//import javax.inject.Inject
//
//class HoroscopeProvider @Inject constructor() {
//    fun getHoroscopes(): List<HoroscopeInfo> {
//        return listOf(