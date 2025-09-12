Algoritmo ejercicio12
	definir x1,y1,x2,y2,distanciax, distanciay, distancia Como Entero
	// Pedir los puntos
	Escribir "Digita el punto x1: " 
	leer x1
	
	Escribir "Digita el punto y1: " 
	leer y1
	
	Escribir "Digita el punto x2: " 
	leer x2
	
	Escribir "Digita el punto y2: " 
	leer y2
	
	// Hallar las distancias en los respectivos ejes
	distanciax = x2 - x1
	distanciay = y2 - y1
	
	// Calcular la distancia de los puntos (suma y raiz cuadrada)
	distancia = rc((distanciax*distanciax) + (distanciay * distanciay))
	
	// Mostrar la distancia por pantalla
	Escribir "La distancia de los puntos es: ", distancia
FinAlgoritmo