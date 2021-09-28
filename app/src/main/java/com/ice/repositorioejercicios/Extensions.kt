package com.ice.repositorioejercicios

import java.text.SimpleDateFormat
import java.util.*

fun Date?.customFormat() : String? {
    val formatear = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ", Locale.getDefault())
    if(this!=null){
        return formatear.format(this)
    }
    return null
}

val Date?.formatSize : Int
get() = this.customFormat()?.length ?: 0