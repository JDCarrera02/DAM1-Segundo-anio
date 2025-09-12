Algoritmo ejercicio9
	definir total_compra, sub_total, producto1, producto2, producto3 Como Real

	// Pedir los productos
	Escribir "Digita el valor del primer producto"
	leer producto1
	
	Escribir "Digita el valor del segundo producto"
	leer producto2
	
	Escribir "Digita el valor del tercer producto"
	leer producto3
	
	// Operaciones, sascar subtotal
	sub_total = (producto1+producto2+producto3)
	// Escribir en pantalla el subtotal
	Escribir "El precio de los productos sin el descuento: ",sub_total
	// Realizar descuento del 15%
	total_compra = sub_total * 0.15
	// Mostrar por pantalla el total de la compra con el descuento realizado
	Escribir "El total de la compra con el 15% de descuento aplicado: ",total_compra
FinAlgoritmo