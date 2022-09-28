# Ejercicico 3 : Función Recursiva
# Imprimir número de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivio, por ejemplo, si pasamos el valor de 5, debe imprimir:
# 5
# 4
# 3
# 2
# 1
# En caso de ser e número 3 debe imprimir:
# 3
# 2
# 1
# Si se ingresan número negativos no imprime nada
def imprimir_numeros_recursivos(numero):
    if numero >= 1: # Caso Base
        print(numero)
        imprimir_numeros_recursivos(numero-1) #Caso recursivo
    elif numero == 0:
        return
    elif numero <= 0:
        print("El valor ingresado es incorrecto")

numIngresado = int(input("Ingrese un número: "))
resultado = imprimir_numeros_recursivos(numIngresado)
