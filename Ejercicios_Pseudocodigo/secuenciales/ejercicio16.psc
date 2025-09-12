Algoritmo ejercicio16
	definir v1, v2, distancia, tiempo_minutos, v_relativa Como real
	// Pedir la distancia
	escribir "Digita la distancia que separa a los dos vehiculos: "
	Leer distancia
	// Pedir las velocidades de los dos vehiculos
	Escribir "Digita la velocidad del Vehiculo 1: "
	Leer v1

	Escribir "Digita la velocidad del Vehiculo 2: "
	Leer v2
	
	// Calculos
	// Hallar la velocidad relativa con la formula v2-v1
	v_relativa = abs(v2-v1) // Devolver el valor absoluto de la resta, ya que para el calculo debe pasarse el valor positivo
	tiempo_minutos = (distancia/v_relativa) * 60 // La distancia de divide entre la velocidad relativa y el resultado se multiplica por 60 porque equivale a los 60 minutos de una hora
	// Escribir en pantalla el resultado
	escribir "El vehiculo mas rapido alcanzara al mas lento en: ", tiempo_minutos, " minuto(s)"
	
FinAlgoritmo