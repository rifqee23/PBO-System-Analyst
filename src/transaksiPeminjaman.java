import java.util.List;

public class transaksiPeminjaman extends anggotaPerpustakaan{
    private int idTransaksi;
    private double noAnggota;
    private double noISBN;
    private String tanggalPeminjaman;
    private String tenggatWaktu;
    private final List<Buku> buku;
    public transaksiPeminjaman(List<Buku> buku){
        this.buku = buku;
    }
    public void catatanPeminjaman(){}
}
