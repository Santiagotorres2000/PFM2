
public class authentication{
    private User [] users;
    

    public authentication(User[] users) {
        this.users = users;
    }


    public User login(String username, String password) {
        for (int i = 0; i < users.length; i++) {
            User u = users[i];
            if (u != null &&
                u.getUsername().equalsIgnoreCase(username) &&
                u.getPassword().equals(password)) {
                return u; // login exitoso
            }
        }
        return null; // login fallido
    }
}
