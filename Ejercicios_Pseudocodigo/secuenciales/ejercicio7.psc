Algoritmo ejercicio7
	definir entrada, horas, horas_minuto, minutos Como Entero
	Escribir "Digita la cantidad de minutos a convertir: "
	leer entrada
	
	horas = trunc(entrada / 60) // Obtencion de las horas, se necesita el valor entero, por eso se trunca el resultado
	
	horas_minuto = entrada % 60 // Obtencion de las horas_minuto
	
	escribir entrada, " equivale a: ",horas, " horas y ", horas_minuto, " minuto(s)"
FinAlgoritmo
