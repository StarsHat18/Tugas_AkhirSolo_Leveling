package id.alamsyah.muhammad.sololeveling.retrofit

import id.alamsyah.muhammad.sololeveling.MainModel
import retrofit2.Call
import retrofit2.http.GET
//api Endpoint adalah titik masuk applikasi supaya bisa terhubung ke protokol http
interface ApiEndpoint {

    @GET( "0994c471-3b43-4b6b-aa3c-63382942b964")
    //sy buat data api di https://designer.mocky.io/ data yg dibuat https://run.mocky.io/v3/5afe95ee-b083-458b-a521-118f586e6e96
    fun getData(): Call<MainModel>

}