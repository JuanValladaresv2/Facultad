import math #Importamos la clase math para hacer uso de la funcion sqrt(raíz cuadrada)
# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8)

lista = [] # Difinimos la lista
# Filtramos los elementos menores a 5 en la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)

# Ejercicio de matematicas
# Para sacar la raiz cuadrada de un número positivo

numero = int(input("Digite un número positivo:"))
while numero < 0:
    print("Error -> debería ser un número positivo")
    numero = int(input("Digite un número positivo: "))
print(f"\n Su raíz cuadrada es: {math.sqrt(numero):.2f}")