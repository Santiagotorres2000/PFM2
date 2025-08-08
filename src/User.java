public class User {
    private String name;
    private Double id;
    private String username;
    private Double password;
    private Roles roles;


    public User(String name, Double id, String username, Double password) {
        this.name = name;
        this.id = id;
        this.username = username;
        this.password = password;
    }


    public String getName() {
        return name;
    }


    public Double getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }


    public Double getPassword() {
        return password;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPassword(Double password) {
        this.password = password;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public Roles getRoles() {
        return roles;
    }
    


    

    

}