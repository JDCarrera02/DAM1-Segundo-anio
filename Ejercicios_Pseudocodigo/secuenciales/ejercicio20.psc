Algoritmo ejercicio20
	definir monedas, resultado_final Como Real
	
	Escribir "Cuantas monedas de 2 euros tienes?: "
	leer monedas
	
	monedas = monedas * 2
	resultado_final = monedas
	
	escribir "Cuantas monedas de 1 euro tienes?: "
	leer monedas
	
	monedas = monedas * 1
	resultado_final = resultado_final + monedas
	
	escribir "Cuantas monedas de 50 centimos tienes?: "
	leer monedas
	
	monedas = monedas * 0.5
	resultado_final = resultado_final + monedas
	
	escribir "Cuantas monedas de 20 centimos tienes?: "
	leer monedas
	
	monedas = monedas * 0.2
	resultado_final = resultado_final + monedas
	
	escribir "Cuantas monedas de 10 centimos tienes?: "
	leer monedas
	
	monedas = monedas * 0.1
	resultado_final = resultado_final + monedas
	
	Escribir "El dinero total que tienes: ", resultado_final
FinAlgoritmo

// 3 monedas de 2 = 6 euros
// 3 monedas de 1 = 3 euros
// 4 monedas de 50 centimos = 2 euros
// 3 monedas de 20 centimos = 0.60 centimos
// 2 monedas de 10 centimos = 0.20 centimos