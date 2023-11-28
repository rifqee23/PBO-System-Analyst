import java.util.List;
public class Admin {
    private int idAdmin;
    private String namaAdmin;
    private String peran;
    private List<String> aktivitasList;

    public Admin(int idAdmin, String namaAdmin, String peran, List<String> aktivitasList) {
        this.idAdmin = idAdmin;
        this.namaAdmin = namaAdmin;
        this.peran = peran;
        this.aktivitasList = aktivitasList;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public String getPeran() {
        return peran;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }

    public List<String> getAktivitasList() {
        return aktivitasList;
    }

    public void setAktivitasList(List<String> aktivitasList) {
        this.aktivitasList = aktivitasList;
    }
    
    public void aturAnggota(){
        System.out.println("Admin " + namaAdmin + peran + " anggota.");
    }
    
    public void aturBuku(){
        System.out.println("Admin " + namaAdmin + peran + " buku.");
    }
    
    public void laporanAktivitas(){
        System.out.println("Laporan Aktivitas Admin " + namaAdmin + ": ");
        System.out.println();
        for (String aktivitas : aktivitasList) {
            System.out.println(aktivitas);
        }
    }

}
