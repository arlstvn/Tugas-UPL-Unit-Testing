package ifundip.upl.mahasiswa;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class mhsEditor {
    Map<String, mahasiswa> mahasiswaList = new ConcurrentHashMap<String, mahasiswa>();

    public void addMahasiswa(String nama, String nim, String jurusan) {
        mahasiswa mahasiswa = new mahasiswa(nama, nim, jurusan);
        mahasiswaList.put(generateKey(mahasiswa), mahasiswa);
    }
    
    public Collection<mahasiswa> getAllmahasiswa() {
        return mahasiswaList.values();
    }
    
    
    private String generateKey(mahasiswa mahasiswa) {
        return String.format("%s", mahasiswa.getnama());
    }
}
