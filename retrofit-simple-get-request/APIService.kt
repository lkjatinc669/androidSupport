package project.sample.sample

val BASE_URL = "https://subdomain.domain.com/"

interface APIInterface {

    @GET("endpoint/")
    fun getTODOS(): Call<majorModel>

}

object APIService{
    val apiInstance: APIInterface

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apiInstance = retrofit.create(APIInterface::class.java)
    }
}
