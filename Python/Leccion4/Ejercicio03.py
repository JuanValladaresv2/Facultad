# Ejercicio 3: Insertar elementos y ordenarlos
# pedir numeros y meterlos a una lista, cuando el usuario
# introduzca un numero 0, nuestro programa dejaria de insertar
# por ultimo, mostrar los numeros ordenados de menor a mayor

lista = []
num = False
while not num:
    valor = int(input('Digite cualquier numero: '))
    if valor == 0:
        num = True
    else:
        lista.append(valor)

lista.sort()
print(lista)