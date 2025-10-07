abstract class user {
    protected String idUser;
    protected String nama;
    protected String email;

    public user(String idUser, String nama, String email) {
        this.idUser = idUser;
        this.nama = nama;
        this.email = email;
    }

    public abstract String tampilInfo();
}