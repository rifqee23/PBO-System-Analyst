


public class transaksiPeminjaman extends anggotaPerpustakaan{
    private int idTransaksi;
    private int noAnggota;
    private int noISBN;
    private String tanggalPeminjaman;
    private String tenggatWaktu;
    private Buku buku;

    public transaksiPeminjaman(int idTransaksi, int noAnggota, int noISBN, String tanggalPeminjaman, String tenggatWaktu, Buku buku) {
        super();
        this.idTransaksi = idTransaksi;
        this.noAnggota = noAnggota;
        this.noISBN = noISBN;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tenggatWaktu = tenggatWaktu;
        this.buku = buku;
    }


    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    @Override
    public int getNoAnggota() {
        return noAnggota;
    }

    @Override
    public void setNoAnggota(int noAnggota) {
        this.noAnggota = noAnggota;
    }

    public int getNoISBN() {
        return noISBN;
    }

    public void setNoISBN(int noISBN) {
        this.noISBN = noISBN;
    }

    public String getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(String tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public String getTenggatWaktu() {
        return tenggatWaktu;
    }

    public void setTenggatWaktu(String tenggatWaktu) {
        this.tenggatWaktu = tenggatWaktu;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

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
