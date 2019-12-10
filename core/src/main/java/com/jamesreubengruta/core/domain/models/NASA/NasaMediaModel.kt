package com.jamesreubengruta.core.domain.models.NASA


import com.google.gson.annotations.SerializedName



data class NasaMediaModel(
    @SerializedName("collection")
    var collection: Collection?
) {

    data class Collection(
        @SerializedName("href")
        var href: String?, // https://images-api.nasa.gov/search?q=asteroid
        @SerializedName("items")
        var items: List<Item?>?,
        @SerializedName("links")
        var links: List<Link?>?,
        @SerializedName("metadata")
        var metadata: Metadata?,
        @SerializedName("version")
        var version: String? // 1.0
    ) {

        data class Item(
            @SerializedName("data")
            var `data`: List<Data?>?,
            @SerializedName("href")
            var href: String?, // https://images-assets.nasa.gov/video/273_InternationalAsteroidHunt/collection.json
            @SerializedName("links")
            var links: List<Link?>?
        ) {

            data class Data(
                @SerializedName("album")
                var album: List<String?>?,
                @SerializedName("center")
                var center: String?, // HQ
                @SerializedName("date_created")
                var dateCreated: String?, // 2018-06-30T00:00:00Z
                @SerializedName("description")
                var description: String?, // A coordinated effort is being made by many nations around the world to detect and track near-Earth objects, such as asteroids.
                @SerializedName("keywords")
                var keywords: List<String?>?,
                @SerializedName("media_type")
                var mediaType: String?, // video
                @SerializedName("nasa_id")
                var nasaId: String?, // 273_InternationalAsteroidHunt
                @SerializedName("title")
                var title: String? // NASA ScienceCasts: The International Asteroid Hunt
            )


            data class Link(
                @SerializedName("href")
                var href: String?, // https://images-assets.nasa.gov/video/273_InternationalAsteroidHunt/273_InternationalAsteroidHunt.srt
                @SerializedName("rel")
                var rel: String?, // captions
                @SerializedName("render")
                var render: String? // image
            )
        }


        data class Link(
            @SerializedName("href")
            var href: String?, // https://images-api.nasa.gov/search?page=2&q=asteroid
            @SerializedName("prompt")
            var prompt: String?, // Next
            @SerializedName("rel")
            var rel: String? // next
        )


        data class Metadata(
            @SerializedName("total_hits")
            var totalHits: Int? // 2865
        )
    }
}