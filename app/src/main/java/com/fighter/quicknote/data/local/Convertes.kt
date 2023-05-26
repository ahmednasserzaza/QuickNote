package com.fighter.quicknote.data.local

import androidx.room.TypeConverter
import java.util.Date

@TypeConverter
fun dateToLong(date: Date):Long{
    return date.time
}

@TypeConverter
fun longToDate(long:Long): Date {
    return Date(long)
}