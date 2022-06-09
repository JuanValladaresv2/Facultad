#Clase 6

# En esta clase veremos la sentencia if/else
"""
condicion=10
if condicion == True:
    print("Condicion verdadera")
elif condicion == False:
    print("Condicion falsa")
else:
    print("Condicion sin especificar")
"""

num = int(input("Digite un número en el rango de 1 al 3 "))
numTexto = ""
if num ==1:
    numTexto = "Número uno"
elif num == 2:
    numTexto = "Número dos"
elif num == 3:
    numTexto = "Número tres"
else:
    numTexto = "Has ingresado un número fuera de rango"
print(f"El número ingresado es:  {num} - {numTexto} ")