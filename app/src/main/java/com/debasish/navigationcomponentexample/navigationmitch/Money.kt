package com.debasish.navigationcomponentexample.navigationmitch

import java.math.BigDecimal
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Money(val amount: BigDecimal): Parcelable {

}