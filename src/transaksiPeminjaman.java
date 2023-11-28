public class transaksiPeminjaman extends anggotaPerpustakaan{
    private int idTransaksi;
    private double noAnggota;
    private double noISBN;
    private String tanggalPeminjaman;
    private String tenggatWaktu;
    private Buku buku;

    public transaksiPeminjaman(int idTransaksi, double noAnggota, double noISBN, String tanggalPeminjaman, String tenggatWaktu, Buku buku) {
        this.idTransaksi = idTransaksi;
        this.noAnggota = noAnggota;
        this.noISBN = noISBN;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tenggatWaktu = tenggatWaktu;
        this.buku = buku;
    }

    
    public void catatanPeminjaman(){
        System.out.println("Catatan Peminjaman: Transaksi " + this.idTransaksi + ", Anggota " + this.noAnggota +
                ", Buku ISBN " + this.noISBN + ", Tanggal Peminjaman " + this.tanggalPeminjaman +
                ", Tenggat Waktu " + this.tenggatWaktu +
                "\nID Buku " + this.buku.getIdBuku() + "Judul " + this.buku.getJudul() + "NO ISBN " +
                this.buku.getNoISBN() + "Status Ketersediaan : " + this.buku.getStatusKetersediaan());
    }
}
