package com.example.mycoffee.data

import CafeModel
import com.example.mycoffee.R

object CafeData {
    private val cafeNames = arrayOf(
        "Tanamera",
        "Laju",
        "Tekoff",
        "Lantai Bumi",
        "Couvee",
        "Jnawi",
        "Simetri",
        "Hayati",
        "Balakosa",
        "Lumi",
        "Medpresso",
        "Ekologi"
    )


    private val cafeSubname = arrayOf(
        "Champion International Roaster",
        "Kecepatan Itu Baik",
        "Your Daily Need Of Ideas",
        "Directed By Wes Anderson",
        "Daily Dose",
        "Awaken The senses",
        "Because A Great Coffee Deserve A Great Home",
        "Coffee Roasters & Comfort Foods",
        "Think Honest",
        "A Place Between Home And Workplace",
        "Nongkrong & Ngopi Di Bawah Rindang Pohon",
        "Your Starting Point for a More Productive Day"
    )


    private val cafeImages = intArrayOf(
        R.drawable.logo_tanamera,
        R.drawable.logo_laju,
        R.drawable.logo_tekkof,
        R.drawable.logo_lantaibumi,
        R.drawable.logo_couvee,
        R.drawable.logo_jnawi,
        R.drawable.logo_simetri,
        R.drawable.logo_hayati,
        R.drawable.logo_balakosa,
        R.drawable.logo_lumi,
        R.drawable.logo_medpresso,
        R.drawable.logo_ekologi
    )

    private val cafeImageHeader = intArrayOf(
        R.drawable.img_tanamera,
        R.drawable.img_laju,
        R.drawable.img_tekoff,
        R.drawable.img_lantaibumi,
        R.drawable.img_couvee,
        R.drawable.img_jnawi,
        R.drawable.img_simetri,
        R.drawable.img_hayati,
        R.drawable.img_balakosa,
        R.drawable.img_lumi,
        R.drawable.img_medpresso,
        R.drawable.img_ekologi
    )

    private val cafeRating = arrayOf(
        "5",
        "4",
        "4",
        "4",
        "5",
        "4",
        "5",
        "4",
        "4",
        "4",
        "4",
        "5"
    )

    private val cafeAddress = arrayOf(
        "Jl. Jend. Sudirman No.3, Cokrodiningratan, Kec. Jetis, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55233",
        "Jl. Mrican Baru No.1, Mrican, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
        "GK 5 1053B, Jl. Sagan Tim., Terban, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55223",
        "Pogung Baru C28, Pogung Kidul, Sinduadi, Mlati, Sleman Regency, Special Region of Yogyakarta 55284",
        "Jl. Kaliurang No.Km 5.2, Manggung, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
        "Jl. Sareh, Kotabaru, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55224",
        "Jl. Sabirin No.20, Kotabaru, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55224",
        "Jl. Demangan Baru No.7, Demangan Baru, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
        "Jl. Nologaten, Nologaten, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
        "Jl. Sukoharjo No.8, Sanggrahan, Condongcatur, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
        "Jl. Cemp. Putih No.8, Karang Gayam, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
        "Jl. Pandean Sari No.4, Gejayan, Condongcatur, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281"
    )


    private val cafeDetail = arrayOf(
        "Since opening our doors in 2013, Tanamera Coffee has been at the forefront of the third wave coffee movement that has taken Indonesia by storm and since then we have shared hundreds of beautiful coffees with thousands of passionate customers. Our mission stayed the same that is to express our passion for Indonesian Arabica Beans and to make it accessible, appreciated and easy to enjoy.",
        "Operasional pertama kali tanggal 27 Mei 2018 lalu,  Laju mengusung konsep yang tidak biasa. Di sini, kita bisa memesan kopi lewat fitur drive-thru atau lantatur (Layanan Tanpa Turun). “Konsep drive-thru muncul karena menurut kami belum ada kopisop di Jogja dengan konsep yang benar-benar memudahkan take away dengan proses yang cepat dan ga ribet, tanpa harus antri masuk toko,”",
        "Tekoff Merupakan Salah Satu Specialty Coffee Di Jogja Yg Bertema Tropical Dengan Menyajikan Kopi2 Premium Dari Roastery2, Kemudian Menu Yang Menjadi Best Seller Di Kedai Kami Yaitu  Cappucino, Filter Coffee Dan Es Kopi Sagan,Perpaduan Antara Gurihnya Susu Dan Gula Kelapa Organik Bercampur Dengan Double Shots Espresso,Disini Juga Ada Beberapa Cake  Homemade Yg Cocok Untuk Dijadikan Teman Ngopi Seperti Greentea Cheesecake,Lemon Cheesecake,Blueberry Cheesecake,Red Velvet Cake.",
        "Lantai Bumi Coffee and Space yang memiliki konsep unfinished nan nyaman. Ide ini datang dari pengalaman waktu travelling ke luar maupun dalam negeri, sepertinya seru kalau ada seni tersendiri yang bisa gabungin antara desain interior dan kopi, dan kebetulan di Yogyakarta belum ada.",
        "Founded in April 2017 by two young man from Yogyakarta, Couvee comes from an idea that everyone can enjoy coffee. It’s all started at a small rented building on Jalan Kaliurang. By 2019, Couvee has 5 branches, one of them located in Jakarta.",
        "Pertama kali operasional 18 Januari 2019 lalu di acara expo sneaker. Nama Jnawi sendiri diambil dari semboyan “Gemah Ripah Loh Jinawi” yang mempunyai makna “tentram dan makmur serta sangat subur tanahnya”. Semboyan ini kerap digunakan untuk menggambarkan keadaan Indonesia.",
        "Simetri Coffee menggunakan bangunan rumah kolonial di Kotabaru. Suasananya terkesan homey dan nyamandengan banyak aksen kayu dan dominan warna putih. Kalau kamu datang ke sini dengan tujuan ngopi sambil mengerjakan tugas atau diskusi, pilihan kamu tepat sekali. Ada ruang-ruang yang bisa digunakan untuk berkelompok maupun personal. Di halaman samping juga tersedia ruang outdoor, jadi untuk pengunjung yang merokok bisa menggunakan ruangan ini. ",
        "Mulai beroperasional Februari 2017. Mengusung konsep minimalis namun tetap menarik. Setiap sudut ruangan dihias dengan mural dan ornamen yang apik.Hayati Specialty Coffee menawarkan konsep yang berbeda dari coffeeshop yang lainnya. Makna specialty adalah Hayati sangat memperhatikan kualitas kopi dan berstandar internasional.",
        "Dibuka awal tahun 2019. Waktu operasionalnya mulai pukul 11.00 WIB hingga tutup dinihari, tepatnya pukul 02.00 WIB. Di lantai satu terdapat banyak meja, tiap sudut lengkap dengan stop kontak. Tempat ini sebenarnya cocok untuk bersantai sambil bekerja. Di area luar, tanah lapang pun dimanfaatkan dengan menggelar karpet. ",
        "Beroperasi pada 2020. Lumi berusaha memberikan kesan minimalist terutama pada bangunan dan interiornya. Designnya juga dibuat homey. Barista yang ramah juga menjadi fokus utama Lumi. Selain itu kualitas minuman dan makanan yang disediakan pasti diperhatikan dengan sangat baik sehingga memberikan kesan baik pula bagi para customer.",
        "Coffee shop berkonsep taman dengan pohon-pohon hijau nan rindang. Masuk ke area Medpresso Coffee Garden, hawa sejuk alias adem langsung terasa. Kalau tak suka duduk di area outdoor karena biasanya di situ tak bisa bebas dari asap rokok, Medpresso Coffee Garden menyediakan area indoor berpendingin ruangan.",
        "Ekologi Caffee mengusung konsep eksterior dan interior yang rustic, dan mengedepankan view natural livin dan menyediakan aneka menu coffee dan western food. Di Ekologi Caffee terdapat 2 lantai dimana di lantai dua tersedia co working space yang memuat hingga 20 customers."
    )

    private val cafeReview1 = arrayOf(
        "Best coffee in town. Seneng ngopi dan makan disini, they served good coffee and generous meals. Paling suka cold brew nya. Mereka juga buka lebih pagi dibandingkan coffee shop lain jadi bisa buat janjian pagi² sekalian sarapan atau sekedar morning coffee.",
        "Menu recommended-nya adalah Ais Kopi Susu Gula Alpen. Kombinasi unik dari espresso, mix milk, dan salted caramel menghapus dahaga dengan cepat dan enak di siang hari.",
        "Bisa dicobain signature dari tekoff coffee and tea, cobain es kopi sagan, anggap aja seperti rumah sendiri dan cobain rasa ngopi di bawah rindangnya pohon ketepang kencana",
        "Ambience is good, the coffee is great. what is the meaning of our existence ? My opinion is we have to drink a lot of coffee and eats more healthy food. Dont forget to exercise more!",
        "Paling suka minum kopi ini. Kalau di Jakal ini biasanya cuman pesan online karena cukup ramai dan tempatnya sempit. Tapi kalau mau minum langsung biasanya ke outlet yang di Seturan.",
        "Perpaduan kopi dingin dengan soda dan lemon jadi jurus jitu hilangkan dahaga. Tempatnya pun cukup bersahaja namun kekinian.",
        "They served a lot of mushrooms.. The coffee is good.. Nice place for meet up.. You have to order and pay first then select your chair, they have non smoking room too.",
        "Simple coffee shop. White space. Good wifi. Cozy. Good food. Good smoothies bowl. Good coffee. Lil' bit pricey. Good ambience. Co-working space. Will go back to.",
        "Luas parkir dan lebih ramai. Apalagi petugasnyaa pada baik banget. Tempat sangat menarik banget. Pokoknya pada penasaran kalau belum mengunjungi balakosa. Terlalu keren",
        "Indoor & outdoor Harga normal, friendly juga, wifi ada Parkir motor luas, mobil its okay No dog, No food&baverage from outside.",
        "Salah satu tempat nongkrong santai ditengah kota jogja ini boleh dicoba, lokasinya ada di daerah caturtunggal.",
        "Tempatnya asik banget apalagi buat mau nugas bisa, buat nongkrong cocok banget. Ditambah wifinya juga kenceng. Buat recommend ke orang ngga ada salahnya dah. Menu favoritnya Ekologi Es Kopi Susu"
    )

    private val cafeReview2 = arrayOf(
        "Makanannya enak. Tempatnya enak. Dipakai meeting non formal enak. Tempat strategies. Menyenangkan. Kopinya juga enak. Dekat dengan marlioboro Dan dekat hotel.",
        "Suasana yang santai dan penataan minimalis membuat tempat ini pas untuk duduk sebentar dan menikmati kopi.",
        "Even it's relatively small coffeeshop, Tekoff offers a comfortable and beautifully designed seating area. And the coffee is delicious.",
        "Sebuah tempat nongkrong kekinian untuk para mahasiswa di Yogyakarta. Instagramable? Iyes. Lokasinya? Jauh dari pinggir jalan raya, jadi tenang buat mengerjakan tugas di sini. Makanan dan minuman? Interior? Well",
        "TERFAVORIT! suka banget sama Black Cookie, Cookie crumbe latte, and ofcourse matcha latte peneman kuliah banget lokasinya lumayan mudah aksesnya, menunya beraneka ragam dengan harga ok",
        "Tak hanya kopi, signature drink Jnawi juga ada yang non-kopi. Matcha Caramel bisa jadi pilihan saat tidak ingin menikmati kopi. Cita rasanya cukup unik, gurih dan manis.",
        "Stopped off for lunch. Great atmosphere in a quirky setting. Food is great with lots of care taken and the restaurant busy but a quiet and relaxed atmosphere. Managed to find amazing coffee.",
        "Ruangannya sangat bagus, pergi ke sana untuk ngobrol santai, menu kopi enak dan menu non kopi juga enak. Tapi di siang hari ruangan non ac akan terasa sangat panas. Overall, one of the best coffee shop in jogja.",
        "Convenient atmosphere and good food.",
        "Cozy Place, Friendly Staff, and Great Coffee. Sukses terus Lumi",
        "Vibes tempatnya banyak pepohonan ala ala bali gitu. Tempatnya cocok banget buat mahasiswa buat nugas ato buat santai santai sore Untuk minumannya banyak banget pilihannya dan rasanya enak-enak",
        "Tempatnya Instagram-able & menu kopinya juara. Harganya standar tp worth to try. Menu makanan yg wajib dicoba Balinese John Dory sih, mantapp!! Pelayanan ramah dan sangat membantu sekali"
    )

    val listData: ArrayList<CafeModel>
        get() {
            val list = arrayListOf<CafeModel>()
            for (position in cafeNames.indices) {
                val cafe = CafeModel()
                cafe.name = cafeNames[position]
                cafe.subname = cafeSubname[position]
                cafe.photo = cafeImages[position]
                cafe.imgheader = cafeImageHeader[position]
                cafe.rating = cafeRating[position]
                cafe.address = cafeAddress[position]
                cafe.detail = cafeDetail[position]
                cafe.review1 = cafeReview1[position]
                cafe.review2 = cafeReview2[position]

                list.add(cafe)
            }
            return list
        }

}