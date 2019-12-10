package com.jamesreubengruta.core.domain.models.NASA


import com.google.gson.annotations.SerializedName



data class NasaAPODMedia(
    @SerializedName("copyright")
    var copyright: String?, // Egon Filter
    @SerializedName("date")
    var date: String?, // 2019-12-10
    @SerializedName("explanation")
    var explanation: String?, // What are those streaks over the horizon? New Starlink satellites reflecting sunlight. SpaceX launched 60 Starlink communication satellites in May and 60 more in November. These satellites and thousands more are planned by communications companies in the next few years that may make streaks like these relatively common. Concern has been voiced by many in the astronomical community about how reflections from these satellites may affect future observations into space.  In the pictured composite of 33 exposures, parallel streaks from Starlink satellites are visible over southern Brazil. Sunflowers dot the foreground, while a bright meteor was caught by chance on the upper right. Satellite reflections are not new -- the constellation of 66 first-generation Iridium satellites launched starting 20 years ago produced some flares so bright that they could be seen during the day. Most of these old Iridium satellites, however, have been de-orbited over the past few years.    Infinite Loop: Create an APOD Station in your classroom or Science Center.
    @SerializedName("hdurl")
    var hdurl: String?, // https://apod.nasa.gov/apod/image/1912/StarlinkTrails_Filter_2048.jpg
    @SerializedName("media_type")
    var mediaType: String?, // image
    @SerializedName("service_version")
    var serviceVersion: String?, // v1
    @SerializedName("title")
    var title: String?, // Starlink Satellite Trails over Brazil
    @SerializedName("url")
    var url: String? // https://apod.nasa.gov/apod/image/1912/StarlinkTrails_Filter_1080.jpg
)