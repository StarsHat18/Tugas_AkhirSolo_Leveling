package id.alamsyah.muhammad.sololeveling

data class MainModel ( val result: ArrayList<Result> ){
     data class Result ( val id: Int, val title: String, val image: String)
     //model data diambil dari array yg dimasukan dimocky.io kemudain data di uraikan menjadi beberapa vaiabel
}