Algoritmo ejercicio6
	definir letra Como Caracter
	definir numero_letra Como entero
	
	Escribir "Escribe una letra"
	Leer letra
	
	si Longitud(letra) > 1 Entonces
		Escribir "Digita un caracter"
	SiNo
		
		si letra >= "A" y letra <= "Z" Entonces
			Escribir "Es una letra mayuscula"
		SiNo
			si letra >= "a" y letra <= "z" Entonces
				Escribir "Es una letra minuscula"
			SiNo
				Escribir "No digitaste una letra"
			FinSi
		FinSi
		
	FinSi
FinAlgoritmo