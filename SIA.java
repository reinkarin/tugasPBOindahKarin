class SIA implements proses {
    private boolean statusLogin = false;

    @Override
    public boolean login(String username, String password) {
        System.out.println("Login dengan username: " + username);
        if (username != null && password != null && !username.isEmpty()) {
            statusLogin = true;
            System.out.println("Status: Berhasil login!");
            return true;
        } else {
            System.out.println("Status: Gagal login!");
            return false;
        }
    }

    @Override
    public void logout() {
        if (statusLogin) {
            System.out.println("Logout berhasil. Sampai jumpa lagi!");
            statusLogin = false;
        } else {
            System.out.println("Anda belum login!");
        }
    }
}
