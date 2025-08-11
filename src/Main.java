import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        var salir = false;

        var userManagement = new userManagement(100);
  

       

        while (!salir) {
             System.out.println("""
            **** Sitema de Gestion de clientes ****
            1. Registrar nuevo usuario
            2. Buscar usuario
            3. Actualizar usuario
            4. Ingresar al Sistema 
            5. Salir
              """);
                System.out.print("Seleccione una opcion: ");
                var opcion = sc.nextInt();
         switch (opcion) {
            
            case 1:
            sc.nextLine();
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el Id: ");
            double id = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese el nombre Completo: ");
            String username = sc.nextLine();
            System.out.println("Ingrese la contraseña: ");
            double password = sc.nextDouble();
            sc.nextLine();
            //Pedimos los datos para crear el nuevo usuario
            //el maximo de historial no, porque ya lo definimos en la clase

            User newUser = new User(nombre, id, username, password);//Creamos el nuevo usuario con los datos pedidos

            userManagement.crearUsuario(newUser); // Guardamos el usuario en la clase userManagement
            System.out.println("Usuario creado correctamente :) ");
            
            break;
         
            case 2:
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

            case 3: 
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
                double newpassword = sc.nextDouble();
                sc.nextLine();
                UpgradeUser.setPassword(newpassword);

                System.out.println("usuario actualizado con exito :) ");
                System.out.printf("nuevo nombre: %s%nnuevo username: %s%nnuevo password: %f.0%n ", 
                UpgradeUser.getName(),UpgradeUser.getUsername(),
                UpgradeUser.getPassword());


                
            }else{
                System.out.println("Usuario no encontrado");
            }
            
                
         }
            
        }

    
        
    }
    
}
