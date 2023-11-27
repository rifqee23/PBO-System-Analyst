import java.util.List;

public class transaksiPeminjaman extends anggotaPerpustakaan{
    private int idTransaksi;
    private double noAnggota;
    private double noISBN;
    private String tanggalPeminjaman;
    private String tenggatWaktu;
    private final Buku buku;
    public transaksiPeminjaman(Buku buku){
        this.buku = buku;
    }
    public void catatanPeminjaman(){
        super.viewRiwayatPeminjaman();
    }
}
