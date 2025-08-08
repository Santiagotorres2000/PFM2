
public class userManagement{
    private User [] users;
    private Integer cantidadUsuarios;

    public userManagement(Integer capacidadMaxima){
        users = new User[capacidadMaxima];
        cantidadUsuarios = 0;
    }

    public void crearUsuario(User newUser){
        if(cantidadUsuarios < users.length){
            users[cantidadUsuarios]= newUser;
            cantidadUsuarios++;
        }else{
            System.out.println("No se pueden crear mas usuarios");
        }

    }
    public User buscarPorId(String idBuscar){
        for (int i = 0; i < cantidadUsuarios; i++) {
            if(users[i].getId().equals(idBuscar)){
                return users[i];
            }
            
        }return null; //No encontrado el usuario
    }
    public User ActUser(User actualizaUser){
        for (int i = 0; i < cantidadUsuarios; i++) {
            if (users[i].getId().equals(actualizaUser.getId())) {
                users[i] = actualizaUser;
                return users[i];
            }
        }
        return null; // Usuario no encontrado
    }

    public User DeleteUser(User Delete){
        for (int i = 0; i < cantidadUsuarios; i++) {
            if (users[i].getId().equals(Delete.getId())) {
                User deletedUser = users[i];
                // ciclo para organizar el espacio que queda al eliminar un usuario
                for (int j = i; j < cantidadUsuarios - 1; j++) {
                    users[j] = users[j + 1];
                }
                users[cantidadUsuarios - 1] = null;
                cantidadUsuarios--;
                return deletedUser;
            }
        }
        return null; // Usuario no encontrado
    }
    
    

    public User[] getUsers() {
        return users;
    }

    public Integer getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    



}