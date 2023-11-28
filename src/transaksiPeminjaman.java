public class transaksiPeminjaman {
    private int idTransaksi;
    private int noAnggota;
    private double noISBN;
    private String tanggalPeminjaman;
    private String tenggatWaktu;

    public transaksiPeminjaman(int idTransaksi, int noAnggota, double noISBN, String tanggalPeminjaman, String tenggatWaktu) {
        this.idTransaksi = idTransaksi;
        this.noAnggota = noAnggota;
        this.noISBN = noISBN;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tenggatWaktu = tenggatWaktu;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getNoAnggota() {
        return noAnggota;
    }

    public void setNoAnggota(int noAnggota) {
        this.noAnggota = noAnggota;
    }

    public double getNoISBN() {
        return noISBN;
    }

    public void setNoISBN(double noISBN) {
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
    
    public void catatanPeminjaman(){
        System.out.println("Catatan Peminjaman: Transaksi " + idTransaksi + ", Anggota " + noAnggota +
                ", Buku ISBN " + noISBN + ", Tanggal Peminjaman " + tanggalPeminjaman +
                ", Tenggat Waktu " + tenggatWaktu);
    }
}
