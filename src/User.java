public class User {
    private String name;
    private Double id;
    private String username;
    private Double password;
    private Roles roles;
    private Record [] records;
    private int historyCount;


    public User(String name, Double id, String username, Double password, int maxHistorySize) {
        this.name = name;
        this.id = id;
        this.username = username;
        this.password = password;
        records = new Record[maxHistorySize];
        historyCount = 0;
      
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
     public void printhistory(){
        System.out.println("Historial de acciones de " + username + ":");
        for (int i = 0; i < historyCount; i++) {
            System.out.println(records[i]);
            
        }
     }
     public void addAction(String action){
        if(historyCount < records.length){
            records[historyCount] = new Record(action, System.currentTimeMillis());
            historyCount++;
        }else {
            System.out.println("Historial lleno para el usuario "+ username);
        }
     }


    

    

}