package com.admiral26.uybor.core.model.home


import com.google.gson.annotations.SerializedName

data class ResultArticle(
    @SerializedName("area")
    val area: String, // 45.00
    @SerializedName("author")
    val author: String, // diyorbek
    @SerializedName("building_floor")
    val buildingFloor: Int, // 6
    @SerializedName("building_material")
    val buildingMaterial: String, // Monolit
    @SerializedName("comforts")
    val comforts: List<Int>,
    @SerializedName("count_rooms")
    val countRooms: Int, // 1
    @SerializedName("created")
    val created: String, // 2024-03-04T19:46:19.064106+05:00
    @SerializedName("description")
    val description: String, // Yer sotiladi
    @SerializedName("floor")
    val floor: Int, // 4
    @SerializedName("home_type")
    val homeType: Int, // 4
    @SerializedName("id")
    val id: Int, // 3
    @SerializedName("location")
    val location: String, // namangan, chust
    @SerializedName("location_latlong")
    val locationLatlong: List<Double>,
    @SerializedName("me_like")
    val meLike: Boolean, // false
    @SerializedName("owner")
    val owner: String, // 1fd330e0-5dc7-44a0-bd7b-0fd7985a01e6
    @SerializedName("pictures")
    val pictures: List<Picture>,
    @SerializedName("price")
    val price: String, // 432.00
    @SerializedName("repair")
    val repair: String, // Tamir talab
    @SerializedName("type")
    val type: Int, // 1
    @SerializedName("updated")
    val updated: String, // 2024-03-04T19:46:19.064125+05:00
    @SerializedName("user_phone_number")
    val userPhoneNumber: Any // null
)