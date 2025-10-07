class dosen extends user {
    private String nip;
    private String keahlian;

    public dosen(String idUser, String nama, String email, String nip, String keahlian) {
        super(idUser, nama, email);
        this.nip = nip;
        this.keahlian = keahlian;
    }

    @Override
    public String tampilInfo() {
        return "Dosen: " + nama + " (" + nip + "), Keahlian: " + keahlian;
    }
}
