public class BukuDigital extends Buku {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    @Override
    public int hargaAkhir() {
        return super.hargaAkhir() * 80 / 100; // kali dulu, baru bagi
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("  Ukuran      : " + ukuranMB + " MB");
        System.out.println("  Harga akhir : " + formatRupiah(hargaAkhir()) + " (diskon 20%)");
    }
}