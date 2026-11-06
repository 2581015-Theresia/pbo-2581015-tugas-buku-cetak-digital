public class TokoBuku {
    public static void main(String[] args) {
        Buku[] keranjang = {
                new BukuCetak("Pemrograman Java", "John Doe", 120000, 750),
                new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400),
                new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5)
        };

        System.out.println("=============== KERANJANG ===============");
        int total = 0;
        for (Buku b : keranjang) {
            b.tampilkanInfo();
            total += b.hargaAkhir();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total bayar   : " + formatTotal(total));

        /*
         * Percobaan: baris super(...) di constructor BukuDigital dihapus sementara.
         * Pesan error yang muncul (salin dari IntelliJ milikmu, kira-kira berbunyi):
         *
         * constructor Buku in class Buku cannot be applied to given types;
         *   required: String,String,int
         *   found:    no arguments
         *   reason: actual and formal argument lists differ in length
         *
         * Penyebabnya: tanpa super(...), Java menyisipkan super() otomatis,
         * padahal Buku tidak punya constructor tanpa parameter.
         * Baris super(...) sudah dikembalikan.
         */
    }

    // formatRupiah di Buku bersifat protected, jadi TokoBuku (bukan subclass)
    // tidak bisa memanggilnya. Buku ada di package yang sama (default package),
    // sehingga akses protected tetap diizinkan lewat Buku.formatRupiah.
    private static String formatTotal(int angka) {
        return Buku.formatRupiah(angka);
    }
}