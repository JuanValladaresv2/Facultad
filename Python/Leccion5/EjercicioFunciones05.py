# Ejercicio 5: Convertidor de temperaturas
# Realizar dos funciones para convertir de grados a celcius
# a fahrenheit y viceversa.
# Investigar las formulas

# Funcion que convierte de Celcius a Fahrenheit
def celcius_fahrenheit(celcius):
    return celcius * 9 / 5 + 32 # La presedencia: multiplicación, división y suma

#Funcion que convierte de fahrenheit a celcius
def fahrenheit_celcius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9 # Respetar la presedencia utilizando paréntesis

celcius = float(input("Digite el valor de Celcius: "))
resultado = celcius_fahrenheit(celcius)
print(f"{celcius} C° a F° -> {resultado:.2f}")

fahrenheit = float(input("Digite el valor de Fahrenheit: "))
resultado = fahrenheit_celcius(fahrenheit)
print(f"{fahrenheit} F° a C° -> {resultado:.2f}")