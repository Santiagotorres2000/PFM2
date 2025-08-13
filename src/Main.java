import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        var salir = false;

        var userManagement = new userManagement(100);
        authentication authe = new authentication(userManagement.getUsers());
        


        while (!salir) {
             System.out.println("""
            **** Sitema de Gestion de clientes ****
            1. Ingresar al Sistema
            2. Registrar nuevo usuario
            3. Buscar usuario
            4. Actualizar usuario
            5. Eliminar usuario 
            6. Listar personas
            7. Salir
              """);
                System.out.print("Seleccione una opcion: ");
                var opcion = sc.nextInt();
         switch (opcion) {
            case 1: 
            sc.nextLine();
            System.out.print("Ingrese su nombre de Usuario: ");
            var valiUser = sc.nextLine();

            System.out.print("Ingrese la Contraseña: ");
            var valiPassw = sc.nextLine();

            if (authe.login(valiUser, valiPassw) != null) {
                System.out.println("Ingreso de sesion exitoso :) ");
                
            }else {
                System.out.println("Usuario y/o contraseña incorrecta");
            }
            break;

            case 2:
            sc.nextLine();
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el Id: ");
            double id = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese el nombre Completo: ");
            String username = sc.nextLine();
            System.out.println("Ingrese la contraseña: ");
            String password = sc.nextLine();
            
            //Pedimos los datos para crear el nuevo usuario
            //el maximo de historial no, porque ya lo definimos en la clase

            User newUser = new User(nombre, id, username, password);//Creamos el nuevo usuario con los datos pedidos

            userManagement.crearUsuario(newUser); // Guardamos el usuario en la clase userManagement
            System.out.println("Usuario creado correctamente :) ");
            
            break;
         
            case 3:
            sc.nextLine();
            System.out.print("Ingrese el id del usuario a buscar: ");
            double idBuscar = sc.nextDouble();
            userManagement.buscarPorId(idBuscar);

            User findUser = userManagement.buscarPorId(idBuscar);

            if (findUser != null) {
                System.out.println("Persona encontrada");
                System.out.println("Nombre: "+ findUser.getName());
                System.out.println("Username: "+ findUser.getUsername());
                
            }else{
                System.out.println("Usuario no encontrado, por favor seleccione de nuevo la opcion y verifique el id ");
            }

         
            break;

            case 4: 
            sc.nextLine();
            System.out.println("ingrese el id del usuario a actualizar: ");
            double idact = sc.nextDouble();
            sc.nextLine();

            User UpgradeUser = userManagement.buscarPorId(idact);

            if (UpgradeUser != null) {
                System.out.println("Nuevo nombre: ");
                String nuevoNombre = sc.nextLine();
                UpgradeUser.setName(nuevoNombre);

                System.out.println("Nuevo username: ");
                String nuevoUsername = sc.nextLine();
                UpgradeUser.setUsername(nuevoUsername);

                System.out.println("Nueva Contraseña: ");
                String newpassword = sc.nextLine();
                sc.nextLine();
                UpgradeUser.setPassword(newpassword);

                System.out.println("usuario actualizado con exito :) ");
                System.out.printf("nuevo nombre: %s%nnuevo username: %s%nnuevo password: %f.0%n ", 
                UpgradeUser.getName(),UpgradeUser.getUsername(),
                UpgradeUser.getPassword());


                
            }else{
                System.out.println("Usuario no encontrado");
            }

            break;

            case 5:
            sc.nextLine();
            System.out.print("Ingrese el id del usuario que desea eliminar: ");
            double idDelete = sc.nextDouble();
            sc.nextLine();

            User DeletetoUser = userManagement.buscarPorId(idDelete);

            if (DeletetoUser != null) {
                User Delete = userManagement.DeleteUser(DeletetoUser);
                if (Delete != null) {
                    System.out.printf("Usuario: %s ha sido eliminado correctamente%n", Delete.getName());
                    
                }
                
            }else{
                System.out.println("Usuario no encontrado");
            }
            break;
            case 6:
            sc.nextLine();
            userManagement.listarUsuarios();
            break;


            case 7:
            salir = true;
            System.out.println("Saliendo del Sistema...");
            break;

                
         }
            
        }

    
        
    }
    
}
