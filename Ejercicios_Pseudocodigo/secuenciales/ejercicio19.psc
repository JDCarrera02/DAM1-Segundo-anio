Algoritmo ejercicio19
	definir correctas, incorrectas, blanco, nota_final Como Entero
	
	escribir "Ingresa el numero de respuestas correctas "
	leer correctas
	
	escribir "Ingresa el numero de respuestas incorrectas "
	leer incorrectas
	
	escribir "Ingresa el numero de respuestas en blanco "
	leer blanco
	
	nota_final = (correctas*5)+(incorrectas*(-1))+(blanco*0)
	
	escribir "Nota final del alumno: ", nota_final
	
FinAlgoritmo