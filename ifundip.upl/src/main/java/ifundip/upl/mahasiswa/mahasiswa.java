package ifundip.upl.mahasiswa;

public class mahasiswa {
	private String nama;
	private String nim;
	private String jurusan;
	
    public mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }
    
    public String getnama() {
        return nama;
    }
    
    public String getnim() {
        return nim;
    }
    
    public String getjurusan() {
        return jurusan;
    }

	
}
