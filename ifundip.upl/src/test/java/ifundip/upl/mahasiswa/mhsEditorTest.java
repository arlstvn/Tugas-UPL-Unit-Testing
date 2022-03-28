package ifundip.upl.mahasiswa;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class mhsEditorTest {


	@Test
	public void shouldAddMahasiswa() {
		mhsEditor mhsEditor = new mhsEditor();
		mhsEditor.addMahasiswa("David", "24060119120099", "Ekonomi");
		Assertions.assertFalse(mhsEditor.getAllmahasiswa().isEmpty());
		Assertions.assertEquals(1, mhsEditor.getAllmahasiswa().size());
		Assertions.assertTrue(mhsEditor
				.getAllmahasiswa()
				.stream()
				.filter(mahasiswa -> mahasiswa.getnama().equals("Dheo") &&
						mahasiswa.getnim().equals("24060119120099") &&
						mahasiswa.getjurusan().equals("Ekonomi"))
				.findAny()
				.isPresent());
	}

}
