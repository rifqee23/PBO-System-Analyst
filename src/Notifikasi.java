public class Notifikasi extends Buku{
    private int idNotif;
    private int noAnggota;
    private String pesan;
    private String timeStamp;

    public Notifikasi(int idBuku, String judul, String noISBN, String statusKetersediaan) {
        super(idBuku, judul, noISBN, statusKetersediaan);
    }
}
