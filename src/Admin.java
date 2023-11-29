
import java.time.LocalDate;
import java.util.ArrayList;

public class Admin {
    private int idAdmin;
    private String nama;

    public Admin(int idAdmin, String nama) {
        this.idAdmin = idAdmin;
        this.nama = nama;
    }
    ArrayList<anggotaPerpustakaan> daftarAnggota = new ArrayList<>();
    ArrayList<Buku> daftarbuku = new ArrayList<>();
    
    public void addBuku(int idBuku, String judul, String noISBN, String statusKetersediaan){
        Buku buku = new Buku(idBuku, judul, noISBN, statusKetersediaan);
        daftarbuku.add(buku);
        System.out.println("Berhasil Menambah Buku " + judul);
    }
    
    public void hapusBuku(String judul){
        for(Buku v : daftarbuku){
            if(v.getJudul().contains(judul)){
                daftarbuku.remove(v);
                System.out.println("Berhasil Menghapus Buku " + judul);
                System.out.println(" ");
            }
        }
    }    
    public void addAnggota(String nama, int noAnggota, String alamat){
        anggotaPerpustakaan a = new anggotaPerpustakaan(nama, noAnggota, alamat);
        daftarAnggota.add(a);
    }
    
    public void lihatAnggota(){
        StringBuilder daftar = new StringBuilder();
        System.out.println("\nDaftar Anggota Perpus");
        for(anggotaPerpustakaan v : daftarAnggota){
            daftar.append("Nama : " + v.getNama())
                    .append("\nNomor : " + v.getNoAnggota())
                    .append("\nAlamat : " + v.getAlamat() + "\n\n");
            System.out.println(daftar.toString());
        }
    }

    public void kirimNotifikasi(anggotaPerpustakaan anggota, int idNotif, int noAnggota, String pesan, LocalDate now) {
        LocalDate timeStamp = LocalDate.now();
        Notifikasi notifikasi = new Notifikasi(idNotif, noAnggota, pesan, timeStamp);
        anggota.notif.add(notifikasi);
    }




}
