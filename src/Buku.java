public class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public int hargaAkhir() {
        return harga;
    }

    public void tampilkanInfo() {
        System.out.println(judul + " (" + penulis + ")");
        System.out.println("  Harga       : " + formatRupiah(harga));
    }

    protected static String formatRupiah(int angka) {
        String s = String.valueOf(angka);
        StringBuilder sb = new StringBuilder();
        int hitung = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (hitung > 0 && hitung % 3 == 0) {
                sb.append('.');
            }
            sb.append(s.charAt(i));
            hitung++;
        }
        return "Rp" + sb.reverse().toString();
    }
}