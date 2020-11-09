package ragilputri.stematel.myrecyclerview

import android.accounts.AuthenticatorDescription
import android.os.Parcelable
import android.provider.ContactsContract
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Hero (
    var name: String,
    var description: String,
    var photo: String
) : Parcelable