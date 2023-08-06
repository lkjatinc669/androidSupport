package project.sample.sample

data class helperModel(
    val id: Int,
    val name: String,
    val cover: String,
    val author: String,
    val pageCount: Int,
    val From: String,
    val rating: Double,
    val totalRating: Int,
    val type: String,
    val genre: String,
    val scrapedOn: String,
    val AddedToLibraryOn: String,
    val metadata: MetaData
)

data class MetaData(
    val keywords:String,
    val author: String
)