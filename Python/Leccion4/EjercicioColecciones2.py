# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que a continuación
# Cree las siguientes listas (en las que no debe haber repetición)
# 1 Lista de palabras que aparecen en las listas
# 2 Lista de palabras que aparecen en la primera lista pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista pero no la primera
# 4 Lista de palabras que aparecen en ambas listas

lista1 = ["Casa", "Moto", "Vidrio", "Auto", "Calle"]
lista1 = set(lista1)
print(f"Lista n°1 {list(set(lista1))}")

lista2 =["Edificio", "Calle", "Auto", "Colectivo", "Avenida"]
lista2 = set(lista2)
print(f"Lista n°2 {list(set(lista2))}")

listaFinal = lista1 - lista2
print(f"Lista de palabras que aparecen solo en lista n°1 {list(set(listaFinal))}")

listaFinal = lista2 - lista1
print(f"Lista de palabras que aparecen solo en lista n°2 {list(set(listaFinal))}")

listaFinal = lista1 | lista2
print(f"Lista de palabras que aparecen en ambas listas {list(set(listaFinal))}")
