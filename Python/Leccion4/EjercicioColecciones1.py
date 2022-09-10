# Ejercico 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuación
# elimine los elementos repetidos, por último mostrar la lista

#Creamos una lista
lista = [1,7,1,"Arbol","Casa",1,7,15,3,4,4,"Arbol",5]
lista = list(set(lista))
print(lista)

# 