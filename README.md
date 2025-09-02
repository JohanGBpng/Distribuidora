# Distribuidora
Programa en  java de una empresa distribuidora que permite mostrar al usuario la informacion de los vehiculos que llevan sus predidos, el costo del o los producots,la distancia y el costo de la misma dependiendo del costo del producto y la distancia.
Requerimientos Funcionales.

-Registro de usuarios:
*Permitir que el usuario se registre usando una cuenta de correo Gmail.
*Validar que el correo ingresado sea de dominio @gmail.com.
*Mostrar mensaje de éxito o error según corresponda.

-Ingreso de datos del vehículo
*Solicitar al usuario los datos del vehículo:
Marca
Modelo
Cilindrada
Tipo de combustible
Capacidad en pasajeros
*Guardar los datos ingresados y mostrarlos correctamente en la salida.

-Ingreso de datos de compra
*Solicitar al usuario el monto de la compra en pesos.
* Solicitar la distancia en kilómetros hasta el domicilio.

-Cálculo de costo de despacho
*Si la compra es mayor a 50.000 pesos y la distancia ≤ 20 km, el despacho es gratuito.
*Si la compra está entre 25.000 y 49.999 pesos, se cobra $150 por km.
*Si la compra es menor a 25.000 pesos, se cobra $300 por km.
*Mostrar al usuario el costo total del despacho y la tarifa aplicada.

-Salida de información
*Mostrar todos los datos ingresados del vehículo.
*Mostrar los datos de la compra y el cálculo de despacho.
*Informar al usuario claramente la tarifa aplicada y el costo final.

Requerimientos No Funcionales.
-Usabilidad
*Debe guiar al usuario paso a paso (registro, ingreso de vehículo, compra).

-Compatibilidad
*Debe ejecutarse en cualquier sistema operativo que soporte Java (Windows, Linux, Mac).
*Debe funcionar en la consola o terminal sin necesidad de IDE.

-Seguridad
-Validar que los correos ingresados sean Gmail para garantizar consistencia en el registro.

-Rendimiento
*El programa debe calcular y mostrar el costo de despacho de manera inmediata sin retrasos perceptibles.

-Portabilidad
*El programa se debe poder ejecutar en cualquier máquina con JDK instalado y acceso a la terminal.
