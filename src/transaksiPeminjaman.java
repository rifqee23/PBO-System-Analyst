public class transaksiPeminjaman extends anggotaPerpustakaan{
    private int idTransaksi;
    private double noAnggota;
    private double noISBN;
    private String tanggalPeminjaman;
    private String tenggatWaktu;
    private Buku buku;
    public transaksiPeminjaman(Buku buku){
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
