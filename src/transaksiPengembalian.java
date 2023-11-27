public class transaksiPengembalian extends anggotaPerpustakaan{
    private int idTransaksi;
    private int noAnggota;
    private int noISBN;
    private String tanggalPengembalian;
    private final Buku buku;
    public transaksiPengembalian(Buku buku){
        this.buku = buku;
    }
}
