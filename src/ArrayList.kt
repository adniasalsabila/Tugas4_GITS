fun main() {
    var arrayList = arrayListOf<String>("Mawar", "Melati", "Anggrek", "Matahari")
    arrayList.add("Kaktus")

    val namedSortedByLength = arrayList.sortedWith(compareBy {
        it.capitalize()
    })

    println("Daftar Bunga Berdasarkan Array List :")
    println(arrayList)

    println("\nDaftar Bunga Diurut Berdasarkan Abjad :")
    for (index in 0..arrayList.size - 1) {
        println("${index + 1}. Bunga ${namedSortedByLength.get(index)}")
    }
}
