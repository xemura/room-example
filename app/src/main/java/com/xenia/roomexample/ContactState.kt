package com.xenia.roomexample

data class ContactState (
    val contacts: List<ModelContact> = emptyList(),
    val firstName: String = "",
    val lastName : String = "",
    val phoneNumber : String = "",
    val isAddingContact : Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME
)