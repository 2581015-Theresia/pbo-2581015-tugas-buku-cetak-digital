public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    public int hitungOngkir() {
        int blok = (beratGram + 499) / 500; // pembulatan ke atas
        return blok * 5000;
    }

    @Override
    public int hargaAkhir() {
        return super.hargaAkhir() + hitungOngkir();
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("  Berat       : " + beratGram + " gram");
        System.out.println("  Ongkir      : " + formatRupiah(hitungOngkir()));
        System.out.println("  Harga akhir : " + formatRupiah(hargaAkhir()));
    }
}