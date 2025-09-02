# Distribuidora
Programa en  java de una empresa distribuidora que permite mostrar al usuario la informacion de los vehiculos que llevan sus predidos, el costo del o los producots,la distancia y el costo de la misma dependiendo del costo del producto y la distancia.
Requerimientos Funcionales.

-Registro de usuarios:<br>
*Permitir que el usuario se registre usando una cuenta de correo Gmail.<br>
*Validar que el correo ingresado sea de dominio @gmail.com.<br>
*Mostrar mensaje de éxito o error según corresponda.<br>

-Ingreso de datos del vehículo<br>
*Solicitar al usuario los datos del vehículo:<br>
Marca<br>
Modelo<br>
Cilindrada<br>
Tipo de combustible<br>
Capacidad en pasajeros<br>
*Guardar los datos ingresados y mostrarlos correctamente en la salida.<br>

-Ingreso de datos de compra<br>
*Solicitar al usuario el monto de la compra en pesos.<br>
*Solicitar la distancia en kilómetros hasta el domicilio.<br>

-Cálculo de costo de despacho<br>
*Si la compra es mayor a 50.000 pesos y la distancia ≤ 20 km, el despacho es gratuito.<br>
*Si la compra está entre 25.000 y 49.999 pesos, se cobra $150 por km.<br>
*Si la compra es menor a 25.000 pesos, se cobra $300 por km.<br>
*Mostrar al usuario el costo total del despacho y la tarifa aplicada.<br>

-Salida de información<br>
*Mostrar todos los datos ingresados del vehículo.<br>
*Mostrar los datos de la compra y el cálculo de despacho.<br>
*Informar al usuario claramente la tarifa aplicada y el costo final.<br>

Requerimientos No Funcionales.<br>
-Usabilidad<br>
*Debe guiar al usuario paso a paso (registro, ingreso de vehículo, compra).<br>

-Compatibilidad<br>
*Debe ejecutarse en cualquier sistema operativo que soporte Java (Windows, Linux, Mac).<br>
*Debe funcionar en la consola o terminal sin necesidad de IDE.<br>

-Seguridad<br>
-Validar que los correos ingresados sean Gmail para garantizar consistencia en el registro.<br>

-Rendimiento<br>
*El programa debe calcular y mostrar el costo de despacho de manera inmediata sin retrasos perceptibles.<br>

-Portabilidad<br>
*El programa se debe poder ejecutar en cualquier máquina con JDK instalado y acceso a la terminal.
