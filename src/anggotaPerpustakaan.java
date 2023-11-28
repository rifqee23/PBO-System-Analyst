import java.util.ArrayList;

public class anggotaPerpustakaan {
        private String nama;
        private int noAnggota;
        private String alamat;
        private ArrayList<transaksiPeminjaman> riwayatPeminjaman;

        public anggotaPerpustakaan(String nama, int noAnggota, String alamat, ArrayList<transaksiPeminjaman> riwayatPeminjaman) {
                this.nama = nama;
                this.noAnggota = noAnggota;
                this.alamat = alamat;
                this.riwayatPeminjaman = riwayatPeminjaman;
        }

        public anggotaPerpustakaan() {

        }

        public String getNama() {
                return nama;
        }

        public void setNama(String nama) {
                this.nama = nama;
        }

        public int getNoAnggota() {
                return noAnggota;
        }

        public void setNoAnggota(int noAnggota) {
                this.noAnggota = noAnggota;
        }

        public String getAlamat() {
                return alamat;
        }

        public void setAlamat(String alamat) {
                this.alamat = alamat;
        }

        public ArrayList<transaksiPeminjaman> getRiwayatPeminjaman() {
                return riwayatPeminjaman;
        }

        public void setRiwayatPeminjaman(ArrayList<transaksiPeminjaman> riwayatPeminjaman) {
                this.riwayatPeminjaman = riwayatPeminjaman;
        }

        public void viewRiwayatPeminjaman(){
                System.out.println("Riwayat Peminjaman: ");
                for (transaksiPeminjaman transaksi : riwayatPeminjaman){
                        System.out.println("ID Transaksi  \t: " + transaksi.getIdTransaksi());
                        System.out.println("No Anggota\t\t: " + transaksi.getNoAnggota());
                        System.out.println("No ISBN   \t\t: " + transaksi.getNoISBN());
                        System.out.println("Tanggal Peminjaman: " + transaksi.getTanggalPeminjaman());
                        System.out.println("Tenggat Waktu \t: " + transaksi.getTenggatWaktu());


                }
        }
        public void mencariBuku(String judul){
                for (transaksiPeminjaman transaksi : riwayatPeminjaman){
                        if(transaksi.getBuku().getJudul().equals(judul)){
                                System.out.println("Buku " + judul + " tersedia");
                                return;
                        }
                        System.out.println("Buku " + judul + " Tidak tersedia/sedang dipinjam");
                }
        }
        public void terimaNotif(){}

}
