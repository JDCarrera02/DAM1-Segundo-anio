Algoritmo ejercicio8
	// Definicion de variables
	definir sueldo_base, total_sueldo, venta1, venta2, venta3, total_comision Como Real
	
	Escribir "Digita el sueldo del trabajador: "
	leer sueldo_base
	
	// Pedir el concepto vendido de cada una de las comisiones
	escribir "Digita el valor de cada una de las ventas "
	
	Escribir "Primera venta: "
	Leer venta1
	
	Escribir "Segunda venta: "
	Leer venta2
	
	Escribir "Tercera venta: "
	Leer venta3
	
	// Operaciones
	total_comision = (venta1+venta2+venta3) * 0.1
	// Sumar ganancias por comisiones al sueldo_total
	total_sueldo = sueldo_base + total_comision
	
	// Escribir mensajes
	Escribir "Retribucion en euros (comision) por las tres ventas realizadas: ", total_comision
	escribir "Total del salario tomando en cuenta retribuciones y sueldo base: ", total_sueldo
FinAlgoritmo