public class SISWA{
    int id;
    String nama;
    double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    //Constructor
    //nama harus sama dgn Class
    public SISWA() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    }

    //Constructor Parameter
    public SISWA (String nama, int id, double ipk) {
        //variabel = parameter
        this.nama = nama;
        this.id = id;
        this.ipk = ipk;
    }

    //method print
    public void print() {
        System.out.println("Id : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Ipk : " + ipk);
    }
}