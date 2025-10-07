class mhsw extends user {
    private String nim;
    private String prodi;

    public mhsw(String idUser, String nama, String email, String nim, String prodi) {
        super(idUser, nama, email);
        this.nim = nim;
        this.prodi = prodi;
    }

    @Override
    public String tampilInfo() {
        return "Mahasiswa: " + nama + " (" + nim + "), Prodi: " + prodi;
    }
}