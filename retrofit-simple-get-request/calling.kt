private fun getData(){
    val data = APIService.apiInstance.getTODOS()
    data.enqueue(object: Callback<Model> {
        override fun onResponse(call: Call<Model>, response: Response<Model>) {
            val data = response.body()
            if (data != null){
                Log.d("SSD", data.toString())
            }
        }
        override fun onFailure(call: Call<Model>, t: Throwable) {
            Log.d("SSD", "ERROR $t")
        }
    })
}