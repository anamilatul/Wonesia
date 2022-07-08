package me.anamila.wonesia.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import me.anamila.wonesia.Adapter.AdapterWonesiaTour;
import me.anamila.wonesia.R;

public class WonesiaTour extends AppCompatActivity {
    private ArrayList<String> fotoWisata = new ArrayList<>();
    private ArrayList<String> namaWisata = new ArrayList<>();
    private ArrayList<String> deskripsiWisata = new ArrayList<>();
    private ArrayList<String> lokasiWisata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonesia_tour);

        data();

    }
    private void ruleRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        AdapterWonesiaTour adapter = new AdapterWonesiaTour(fotoWisata, namaWisata,  deskripsiWisata, lokasiWisata,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void data() {
        fotoWisata.add("https://heritage.kai.id/media/cover%2013.jpg?1505617606123");
        namaWisata.add("Lawang Sewu");
        deskripsiWisata.add("Lawang Sewu adalah gedung bersejarah milik PT Kereta Api Indonesia (Persero) yang awalnya digunakan sebagai Kantor Pusat perusahaan kereta api swasta Nederlandsch - Indische Spoorweg Maatschappij (NISM). \n "
                +"\n"+"Gedung Lawang Sewu dibangun secara bertahap di atas lahan seluas 18.232 m2. "+
                "Bangunan utama dimulai pada 27 Februari 1904 dan selesai pada Juli 1907. \nSedangkan bangunan tambahan dibangun sekitar tahun 1916 dan selesai tahun 1918. Bangunannya dirancang oleh Prof. Jakob F. Klinkhamer dan B.J. Ouendag, arsitek dari Amsterdam dengan ciri dominan berupa elemen lengkung dan sederhana. Bangunan di desain menyerupai huruf L serta memiliki jumlah jendela dan pintu yang banyak sebagai sistem sirkulasi udara.\n"+"\n"+
                "Karena jumlah pintunya yang banyak maka masyarakat menamainya dengan Lawang Sewu yang berarti seribu pintu." +
                "Selain desain bangunanya yang unik, Lawang Sewu memiliki ornamen kaca patri pabrikan Johannes Lourens Schouten. \nKaca patri tersebut bercerita tentang kemakmuran dan keindahan Jawa, kekuasaan Belanda atas Semarang dan Batavia, kota maritim serta kejayaan kereta api. " +
                "Ragam hias lainnya pada Lawang Sewu antara lain ornamen tembikar pada bidang lengkung di atas balkon, kubah kecil di puncak menara air yang dilapisi tembaga, dan puncak menara dengan hiasan perunggu. \n"+"\n"+
                "Saat ini Gedung Lawang Sewu dimanfaatkan sebagai museum yang menyajikan beragam koleksi dari masa ke masa perkeretaapian di Indonesia. Koleksi yang dipamerkan antara lain: koleksi Alkmaar, mesin Edmonson, Mesin Hitung, Mesin Tik, Replika Lokomotif Uap, Surat Berharga dan lain-lain. Lawang Sewu menyajikan proses pemugaran gedung Lawang Sewu yang terdiri dari foto, video, dan material restorasi. Mendekati pintu keluar, terdapat perpustakaan berisikan buku-buku tentang kereta api.\n" +"\n"+
                "Selain menjadi tempat wisata sejarah, Gedung Lawang Sewu juga dapat disewa untuk kegiatan Pameran, Ruang Pertemuan, Pemotretan, Shooting, Pesta Pernikahan, Festival, Bazar, Pentas Seni, Workshop, dll.");
        lokasiWisata.add("Jl. Pemuda, Sekayu, Kec. Semarang Tengah, \nKota Semarang, Jawa Tengah 50132");

        fotoWisata.add("https://awsimages.detik.net.id/community/media/visual/2019/08/27/7f7d7964-0327-489c-b598-0f7f7833de92_169.jpeg?w=700&q=90");
        namaWisata.add("Kota Lama");
        deskripsiWisata.add("Kota Lama Semarang merupakan tempat wisata yang memiliki julukan Little Netherland. Kawasan ini dinamai Kota Lama karena memang bangunan-bangunan di wilayah tersebut memiliki gaya arsitektur zaman dulu.\n" +
                "\n" +
                "Tempat wisata ini menawarkan indahnya bangunan-bangunan bergaya arsitektur Eropa tahun 1700-an. Bangunan-bangunan tersebut adalah saksi bisu sejarah masa kolonial Belanda. Selain itu, terdapat kanal-kanal air yang dibangun oleh pemerintah kolonial di sekitar Kota Lama Semarang ini.\n" +
                "\n" +
                "Di kawasan ini, terdapat banyak ikon-ikon Kota Semarang yang terkenal seperti Gereja Blenduk, pabrik rokok, stasiun dan lain sebagainya yang mempunyai gaya khas Eropa masa lalu.\n" +
                "\n" +
                "Kota Lama ini sudah ramai dari abad ke-17. Saat itu, kawasan ini merupakan salah satu pusat perdagangan di Indonesia. Di abad ke-18 hingga abad ke-19, banyak pedagang Cina dan Arab yang memenuhi kawasan ini.\n" +
                "\n" +
                "Untuk fasilitas publik di Kota Lama Semarang sendiri terbilang lengkap dan baik. Mulai dari mushola, jalan, toilet, sampai tempat sampah tersedia dalam jumlah yang memadai dan kondisi yang baik.");
        lokasiWisata.add("Jl. Letjen Suprapto No.31, Tj. Mas, Kec. Semarang Utara, Kota Semarang, Jawa Tengah 50137");

        fotoWisata.add("https://dolanyok.com/wp-content/uploads/Brown-Canyon-Atas.jpg");
        namaWisata.add("Brown Canyon");
        deskripsiWisata.add("asal usul dari pamor Brown Canyon dikarenakan adanya masyarakat Semarang serta warga luar kota yang mencari alternatif tempat liburan dalam menghindari keramaian serta untuk hari tenang dari kesemrawutan kota.\n" +
                "\n" +
                "Dan kemudian dijumpai sebuah tempat berupa tebing yang kemudian dinamai Brown Canyon.\n" +
                "\n" +
                "Tempat wisata satu ini ada akibat adanya proses penggalian serta penambangan yang sudah ditinggalkan lebih dari 10 tahun lalu. Dari proses penggalian itu, kemudian terbentuk suatu tebing dengan ragam bentuk yang berbeda. Serta memiliki tampilan alam yang lebih menarik.\n" +
                "\n" +
                "Hal tersebut tentu saja langsung mengundang perhatian dari masyarakat kota Semarang. Sehingga mengundang wisatawan dari luar daerah tertarik untuk berkunjung.");
        lokasiWisata.add("Rowosari, Kec. Tembalang, Kota Semarang, Jawa Tengah 50279");

        fotoWisata.add("https://idetrips.com/wp-content/uploads/2018/12/sam-poo-kong.jpeg");
        namaWisata.add("Klenteng Sam Poo Kong");
        deskripsiWisata.add("Klenteng Sam Poo Kong salah satu situs sejarah tentang perkembangan Islam di Semarang yang disebarkan seorang penjelajah dari China bernama Laksamana Cheng Ho. Klenteng Sam Poo Kong terletak di Jalan Simongan Raya nomor 129, Bongsari, Kecamatan Semarang Barat, Kota Semarang. Tidak hanya bernuansa Tionghoa, klenteng ini juga memiliki nuansa Islam dengan corak pada langit-langit berwarna hijau dan terdapat bedug." +
                "\nKlenteng ini merupakan tempat ibadah cocok untuk wisata religi. Namun, tak jarang pengunjung datang untuk berburu foto.\nKlenteng ini biasanya menjadi tempat digelarnya festival, " +
                "seperti peringatan HUT Sam Poo Kong dan hari raya Imlek. Harga tiket pada hari biasa adalah Rp 8.000 per orang dewasa dan Rp 5.000 per anak. Saat akhir pekan, harga tiket masuk adalah Rp 12.000 per orang dewasa dan Rp 8.000 per anak. Tiket masuk hanya untuk area area wisata, untuk memasuki area ibadah pengunjung akan dikenai biaya tambahan." +
                "\n");
        lokasiWisata.add("Klenteng Sam Po Kong, Bongsari, Kec. Semarang Bar., Kota Semarang, Jawa Tengah 50148");

        fotoWisata.add("https://4.bp.blogspot.com/-vzmFX-LT5Tw/ViDmVlK9pcI/AAAAAAAAA2M/dw2AOviIvIE/w1200-h630-p-k-no-nu/wisata%2Bcandi%2Bprambanan.jpg");
        namaWisata.add("Candi Prambanan");
        deskripsiWisata.add("Candi Prambanan atau Candi Loro Jonggrang adalah kompleks candi Hindu terbesar di Indonesia yang dibangun pada abad ke-9 masehi. \n"+"\nCandi ini dipersembahkan untuk Trimurti, tiga dewa utama Hindu yaitu Brahma sebagai dewa pencipta, Wishnu sebagai dewa pemelihara, dan Siwa sebagai dewa pemusnah. Berdasarkan prasasti Siwagrha nama asli kompleks candi ini adalah Siwagrha (bahasa Sanskerta yang bermakna ‘Rumah Siwa’), dan memang di garbagriha (ruang utama) candi ini bersemayam arca Siwa Mahadewa setinggi tiga meter yang menujukkan bahwa di candi ini dewa Siwa lebih diutamakan." +
                "\n\nCandi ini adalah termasuk Situs Warisan Dunia UNESCO, candi Hindu terbesar di Indonesia, sekaligus salah satu candi terindah di Asia Tenggara. Arsitektur bangunan ini berbentuk tinggi dan ramping sesuai dengan arsitektur Hindu pada umumnya dengan candi Siwa sebagai candi utama memiliki ketinggian mencapai 47 meter menjulang di tengah kompleks gugusan candi-candi yang lebih kecil. Sebagai salah satu candi termegah di Asia Tenggara, candi Prambanan menjadi daya tarik kunjungan wisatawan dari seluruh dunia.");
        lokasiWisata.add("Jl. Raya Solo - Yogyakarta No.16, Kranggan, Bokoharjo, Kec. Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55571");

        fotoWisata.add("https://3.bp.blogspot.com/-uLFc4shrduk/VzollynJrBI/AAAAAAAAAaw/qjpET5yvTw0nblJ8vlk3VAbOKiP7vq8dQCLcB/s1600/taman%2Bsari%2B1.jpg");
        namaWisata.add("Taman Sari");
        deskripsiWisata.add("Tamansari, yang berarti taman yang indah, pada mulanya merupakan sebuah taman atau kebun istana Keraton Yogyakarta. Kompleks ini dibangun secara bertahap pada masa Sri Sultan Hamengku Buwono I. Pembangunan dimulai pada tahun 1758 M, ditandai oleh candra sengkala \"Catur Naga Rasa Tunggal\" yang menunjuk tahun 1684 Jawa. Sengkalan yang dapat diartikan sebagai \"empat naga satu rasa\" ini dapat ditemukan di Gapura Panggung, Bagian-bagian penting dari kompleks bangunan diselesaikan pada tahun 1765 M, ditandai candra sengkala \"Lajering Sekar Sinesep Peksi\" yang menunjuk tahun 1691 Jawa. Sengkalan yang berarti \"kuntum bunga dihisap burung\" ini dapat ditemui di Gapura Agung dan ornamen beberapa dinding bangunan.\n" +
                "\n" +
                "Tamansari memiliki luas lebih dari 10 hektar dengan 57 bangunan di dalamnya. Bangunan-bangunan tersebut berbentuk gedung, kolam pemandian, jembatan gantung, kanal air, danau buatan, pulau buatan, masjid, dan lorong bawah tanah.\n" +
                "Taman ini dijuluki Water Kasteel karena kolam-kolam dan unsur air yang mengelilinginya. Disebut juga sebagai The Fragrant Garden karena pohon-pohon dan bunga-bunga yang harum ditanam di kebun-kebun sekitar bangunan.\n" +
                "\n" +
                "Desain Tamansari didasarkan pada gagasan dari Sri Sultan Hamengku Buwono I, adapun gambar teknisnya dikerjakan oleh seorang berkebangsaan Portugis yang diduga datang dari wilayah Gowa, Sulawesi. Arsitek dari Portugis ini dikenal sebagai Demang Tegis, nama yang kemungkinan besar bersumber dari kebangsaannya. Adapun pimpinan proyek pembangunan Tamansari dipegang oleh Tumenggung Mangundipuro yang kemudian digantikan oleh Pangeran Notokusumo.");
        lokasiWisata.add("Patehan, Kecamatan Kraton, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55133");

        fotoWisata.add("https://gaetlokal.id/cni-content/uploads/modules/posts/20201115100334.png");
        namaWisata.add("Candi Borobudur");
        deskripsiWisata.add("Candi Borobudur adalah candi budha yang paling besar dan mewah yang ada di Indonesia. Bentuk daripada candi ini nampak seperti piramida / bangun limas segi empat. Candi ini mempunyai banyak relief dan juga stupa.\n" +
                "\n" +
                "Karena kemegahan dan ukuran candi, membuat pesona candi bak seperti gunung yang menjulang tinggi. Bahkan dari arah kejauhan telah nampak dengan jelas akan pesona dari candi ini.Candi Borobudur terdiri dari 3 buah tingkatkan. Tingkat pertama /paling bawah disebut dengan kamadhatu. Pada bagian akhir ini terdapat relief yang berjumlah 160 buah. Relief tersebut mengandung suatu kisah tentang Karmawibhangga / berbagai macam kisah tentang dosa.\n" +
                "\n" +
                "Pada tingkat yang kedua yaitu rupadhatu. Pada tingkat ini berupa 4 buah teras. Teras itu seolah membentuk lorong yang berputar. Di tingkat rupadhatu terdapat 1300 relief.Sedangkan pada tingkat kedua ini terdapat beberapa patung budha berukuran kecil. Jumlah keseluruhan patung budha yaitu 432 patung. Patung itu terletak di dalam suatu relung terbuka yang ada di sepanjang pagar langkan. Pagar langkan adalah suatu bentuk peralihan dari rupadhatu dan arupadhatu.\n" +
                "\n" +
                "Tingkat yang paling atas yaitu arupadhatu. Khusus untuk tingkat ini sama sekali tidak dihiasi relief pada dindingnya. Bentuk dari lantai arupadhatu yaitu lingkaran.\n" +
                "\n" +
                "Di sini ada 72 stupa kecil. Semua stupa kecil tersusun atas 3 buah barisan yang seolah mengelilingi stupa induk. Bentuk dari stupa kecil menyerupai lonceng. Di dalam stupa terdapat patung budha.\n" +
                "\n" +
                "Di bagian tengah arupadhatu terdapat sebuah stupa induk. Stupa ini memiliki patung budha dan mempunyai ukuran paling besar daripada stupa lainnya.");
        lokasiWisata.add("Jl. Badrawati, Kw. Candi Borobudur, Borobudur, Kec. Borobudur, Magelang, Jawa Tengah");

        fotoWisata.add("https://media.suara.com/pictures/653x366/2019/10/14/14093-tugu-pal-putih-atau-tugu-yogyakarta-suaraeleonora-pew.jpg");
        namaWisata.add("Tugu Yogyakarta");
        deskripsiWisata.add("Tugu Jogja merupakan landmark yang sangat lekat dengan Kota Jogja. Tugu ini terletak di tengah perempatan Jalan Jenderal Sudirman, Jalan Margo Utomo, Jalan AM Sangaji, dan Jalan Diponegoro.\n" +
                "\n" +
                "Awalnya tugu ini bernama Tugu Golong Gilig. Namun, saat ini lebih dikenal dengan sebutan nama Tugu Pal Putih. Hal ini didasari warna cat yang digunakan sejak dulu adalah berwarna putih.\n" +
                "\n" +
                "Tugu Jogja merupakan penanda batas utara kota tua Jogja. Bukan tugu sembarangan, Tugu Jogja adalah tugu yang memiliki mitos bersejarah dan sejuta misteri di dalamnya, sehingga menjadi salah satu keistimewaan yang dimiliki Kota Jogja.\n" +
                "\n" +
                "Sekarang, tugu ini menjadi salah satu objek wisata yang populer untuk berfoto bagi wisatawan. Rasanya tidak lengkap, berkunjung ke Jogja tanpa melihat dari dekat tugu bersejarah dan nilai simbolis yang cukup magis ini.");
        lokasiWisata.add("Gowongan, Kec. Jetis, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55233");

        fotoWisata.add("https://duitologi.com/media/5ZNKKORS9CTWC6NL1O3U74AXK7QT191G00NJNSNXQUKFVRJVSGPSUD9MNZD9RC4N.jpg.1250x660_q85.jpg");
        namaWisata.add("Monumen Nasional");
        deskripsiWisata.add("\n" +
                "    Monumen Nasional atau biasa disebut dengan Monas terletak di Jakarta Pusat, Indonesia. Tugu ini dibangun pada tahun 1961 dengan tujuan untuk memperingati perjuangan dan pertarungan rakyat Indonesia untuk mencapai kemerdekaan mereka. Bangunan ini dibuka untuk umum pada tahun 1975.\n" +
                "\n" +
                "    Monumen Nasional adalah sebuah menara berbentuk persegi panjang dengan tinggi 132 meter. Bagian khusus dari bangunan ini yang menjadi ciri khas nya adalah bentuk api yang dilapisi dengan lembaran emas yang terletak di bagian paling atas bangunan. Terdapat sebuah musium di bagian dasar menara ini dengan ukuran 80 x 80 meter. Semua orang bisa mengunjungi musium itu untuk mempelajari sejarah Indonesia. Ada juga sebuah amphiteater dalam bangunan ini yang disebut Ruang Kemerdekaan, ruang ini terletak di bagian cawan Monas dan itu bisa dicapai dengan menggunakan tangga berputar di pintu utara dan selatan. Jika kamu pergi ke sisi selatan bangunan ini, kamu akan menemukan sebuah lift yang bisa digunakan untuk menuju lantai paling atas dimana kita akan menemukan dek pengamatan dan api kemerdekaan.\n");
        lokasiWisata.add("Gambir, Kecamatan Gambir, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta");

        fotoWisata.add("https://akcdn.detik.net.id/visual/2021/04/08/wisata-tmii_169.jpeg?w=650");
        namaWisata.add("Taman Mini Indonesia Indah");
        deskripsiWisata.add("Taman ini merupakan rangkuman kebudayaan bangsa Indonesia, yang mencakup berbagai aspek kehidupan sehari-hari masyarakat 33 provinsi Indonesia (pada tahun 1975) yang ditampilkan dalam anjungan daerah berarsitektur  tradisional, serta menampilkan aneka busana, tarian dan tradisi daerah.\n" +
                "\n" +
                "Disamping itu, di tengah-tengah TMII terdapat sebuah danau yang menggambarkan miniatur kepulauan Indonesia di tengahnya, kereta gantung, berbagai museum, dan Teater IMAX Keong Mas dan Teater Tanah Airku), berbagai sarana rekreasi ini menjadikan TMIII sebagai salah satu kawasan wisata terkemuka di ibu kota.\n" +
                "\n" +
                "TMII memiliki logo yang pada intinya terdiri atas huruf TMII, Singkatan dari \"Taman Mini Indonesia Indah\". Sedangkan maskotnya berupa tokoh wayang Hanoman yang dinamakan NITRA (Anjani Putra). Maskot Taman Mini \"Indonesia Indah\" ini diresmikan penggunaannya oleh Ibu Tien Soeharto, bertepatan dengan dwi windu usia TMII, pada tahun 1991.");
        lokasiWisata.add("Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta");

        fotoWisata.add("https://res.klook.com/images/fl_lossy.progressive,q_65/c_fill,w_1200,h_630/w_80,x_15,y_15,g_south_west,l_klook_water/activities/atbhykkiwhuhhdibdzsj/[Lewati%20Antrean]%20Tiket%20Dufan%20(Dunia%20Fantasi%20Ancol)%20di%20Jakarta.jpg");
        namaWisata.add("Dunia Fantasi");
        deskripsiWisata.add("Dunia Fantasi (Dufan) merupakan tempat wisata hiburan di Taman Impian Jaya Ancol, Jakarta Utara dan memiliki banyak wahana permainan serta sebagai kawasan edutainment. Dunia Fantasi merupakan theme park pertama di Indonesia layaknya Disney Land, Universal Studios atau Trans Studio.\n" +
                "\n" +
                "Saat berkunjung ke Dufan Ancol, pengunjung akan merasakan tema-tema bernuansakan Indonesia, Jakarta, Asia, Eropa, Amerika, Yunani, Hikayat, dan Kalila. Dunia Fantasi Ancol dibuka untuk umum pada tahun 1985 dan hingga saat ini masih terus menambah unit wahana permainan dan kawasan bertematik.\n" +
                "\n" +
                "Sebagai tujuan wisata untuk keluarga, terutama di musim liburan anak sekolah, Dunia Fantasi juga cocok untuk pengunjung yang ingin merasakan keseruan hiburan bermain di wahana permainan, menonton parade dan atraksi serta berpetualang menyusuri berbagai kawasan bertematik di Dufan.");
        lokasiWisata.add("Jl. Lodan Timur No.7, RW.10, Ancol, Kec. Pademangan, Kota Jkt Utara, Daerah Khusus Ibukota Jakarta 14430");

        fotoWisata.add("https://cdn-2.tstatic.net/wartakota/foto/bank/images/museum-fatahillah_20170817_005256.jpg");
        namaWisata.add("Museum Sejarah Jakarta");
        deskripsiWisata.add("Museum Sejarah Jakarta pada mulanya digunakan sebagai gedung Balaikota (Stadhuis). Gedung ini merupakan gedung Balaikota kedua yang dibangun pada masa pemerintahan VOC di Batavia.\n" +
                "\n" +
                "Pada tanggal 27 April 1626, Gubernur Jenderal Pieter de Carpentier (1623-1627) memutuskan untuk menbangun gedung balaikota yang baru ini kemudian direnovasi pada tanggal 25 Januari 1707 di masa pemerintahan Gubernur Jenderal Joan van Hoorn dan selesai direnovasi pada tanggal 10 Juli 1710 di masa pemerintahan Gubernur Jenderal Abraham van Riebeeck.\n" +
                "\n" +
                "Selain sebagai Balaikota, gedung ini juga berfungsi sebagai Pengadilan, Kantor Catatan Sipil, tempat warga beribadah di hari Minggu, dan Dewan Kotapraja (College van Scheppen). Pada tahun 1925-1942 gedung ini juga dimanfaatkan sebagai Kantor Pemerintah Provinsi Jawa Barat dan pada tahun 1942-1945 dipakai untuk kantor pengumpulan logistik Dai Nippon. Tahun 1952 dipakai sebagai Markas Komando Militer Kota (KMK) I yang kemudian menjadi Kodim 0503 Jakarta Barat. Setelah itu pada tahun 1968 gedung ini diserahkan kepada Pemda DKI Jakarta dan kemudian dijadikan sebagai Museum pada tahun 1974.");
        lokasiWisata.add("Jalan Taman Fatahillah No.1, Pinangsia, Kec. Taman Sari, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11110");

        ruleRecyclerView();
    }
}
