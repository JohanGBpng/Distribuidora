import java.util.Scanner;  //importamos libreria Scanner

//creacion de la clase publica Distribuidora
public class Distribuidora {   
    public static void main(String[] args) { //creamos el metodo de la clase 
        Scanner sc = new Scanner(System.in);  //variable scanner que leeara datos ingresados por usuario

        // Registro de usuario con Gmail 
        String correo;   //cariable correo en caracter
        System.out.print("Ingrese su correo Gmail para registrarse: "); //imprime en pantalla ingresar correo
        correo = sc.nextLine();  //guarda la informacion ingresada

        // Validar que el correo sea de Gmail
        if (!correo.endsWith("@gmail.com")) {  //valida que lo ingresado termine en @gmail.com con una condicional
            System.out.println("Error: Solo se permiten correos Gmail para registrarse."); // imprime en pantalla si existe error
            return; // termina el programa si no es válido  
        }

        System.out.println("Registro exitoso con la cuenta: " + correo);  //imprime en pantalla si el correo era correcto

        // Datos del vehículo
        String marca, modelo, cilindrada, tipoCombustible; //variables del vehiculo que son caracteres
        int capacidad; //variable del vehiculo que es entero 

        System.out.print("Ingrese la marca del vehículo: "); //imprime en pantalla marca de vehiculo
        marca = sc.nextLine(); //guarda la info del usuario

        System.out.print("Ingrese el modelo del vehículo: "); //imprime en pantalla modelo del vehiculo
        modelo = sc.nextLine(); //guarda la info del usuario

        System.out.print("Ingrese la cilindrada del vehículo: "); //imprime en pantalla la cilindrada 
        cilindrada = sc.nextLine(); //guarda la info del usuario

        System.out.print("Ingrese el tipo de combustible: "); //imprime en pantalla el tipo de combustible
        tipoCombustible = sc.nextLine(); //guarda la info del usuario
 
        System.out.print("Ingrese la capacidad en pasajeros: "); //imprime en pantalla la capacidad de pasajeros
        capacidad = sc.nextInt(); //guarda la info del usuario

        // Datos de la compra
        int montoCompra, km; //variables en entero
        System.out.print("\nIngrese el monto de la compra en pesos: "); //imprime en pantalla monto de compra
        montoCompra = sc.nextInt(); //guarda la info del usuario

        System.out.print("Ingrese la distancia en km hasta el domicilio: "); //imprime en pantalla distancia de km
        km = sc.nextInt(); //guarda la info del usuario

        // Cálculo de despacho
        int costoDespacho = 0; //variable entero de costo de despacho
        String tarifa =""; //variable en caracter de la tarifa

	//condicional 
        if (montoCompra >= 50000 && km <= 20) {   //si la compra es mayor o igual a 50000 y menor o igual a 20
            costoDespacho = 0;  // despacho gratis
        } else if (montoCompra >= 25000 && montoCompra <= 49999) { //si la compra es mayor o igual y menor o igual a 49999
            costoDespacho = km * 150; //costo por km de 150
            tarifa ="$150 por km"; //tarifa por km 150
        } else if (montoCompra > 25000) { //si la compra es nenor a 25000
            costoDespacho = km * 300; //costo por km 300
            tarifa ="$300 por km"; //tarifa por km 300
        }

        // Salida de datos
        System.out.println("\nLa marca que ha ingresado es: " + marca); //imprime en pantalla marca ingresada por usuario
        System.out.println("El modelo que ha ingresado es: " + modelo); //imprime en pantalla modelo ingresada por usuario
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada); //imprime en pantalla cilindrada ingresada por usuario
        System.out.println("El tipo de combustible es: " + tipoCombustible); //imprime en pantalla tipo de combustible ingresada por usuario
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros."); //imprime en pantalla cantiadad de pasajeros ingresada por usuario
        System.out.println("El costo por km es de: " + tarifa); //imprime en pantalla costo por kilometro
        System.out.println("\nMonto de la compra: $" + montoCompra); //imprime en pantalla monto de la compra 
        System.out.println("Distancia hasta el domicilio: " + km + " km"); //imprime en pantalla la distancia
        System.out.println("El costo del despacho es: $" + costoDespacho); //imprime el costo del desacho
    }
}
