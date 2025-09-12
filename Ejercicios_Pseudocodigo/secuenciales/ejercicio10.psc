Algoritmo ejercicio10
	definir nota1, nota2, nota3, promedio_notas, examen_final, trabajo_final, total_calificacion Como Real
	
	// Primer paso, pedir las tres notas
	Escribir "Digita la primera nota: "
	leer nota1
	
	Escribir "Digita la segunda nota: "
	leer nota2
	
	Escribir "Digita la tercera nota: "
	leer nota3
	// Segundo paso multiplicar por el porcentaje correspondiente de la nota final
	promedio_notas = ((nota1+nota2+nota3) / 3) * 0.55
	
	// Tercer paso, sacar porcentaje del examen final (primero pedirlo por pantalla)
	Escribir "Digita la calificacion del examen final: "
	leer examen_final
	
	// Operacion
	examen_final = examen_final * 0.3
	
	// Cuarto paso, sacar el porcentaje de la calificacion del trabajo_final (pedir primero por pantalla la calificacion)
	Escribir "Digita la calificacion del trabajo final: "
	Leer trabajo_final
	
	// Operacion
	trabajo_final = trabajo_final * 0.15
	
	// Quinto paso, sumar todo (ya con sus porcentajes aplicados)
	total_calificacion = promedio_notas+examen_final+trabajo_final
	
	// Mostrar resultado final
	Escribir "La calificacion final del estudiante es: ",total_calificacion
FinAlgoritmo
//2.93 = 4 5 7
// 2.1 = 7
// 1.05 = 7

// 6.08
