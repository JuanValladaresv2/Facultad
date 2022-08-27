
# lista = Santiago, Matias, Juani, Tomas
# Colecciones en Python

#Las listas es lo que se conoce en otros lenguajes como arreglos o vectores

#nombres = ['Santiago', 'Matias', 'Juani', 'Tomas']
#print(nombres)
#print(nombres[0])
#print(nombres[1])
#print(nombres[3])
#print(nombres[-1])
#print(nombres[-2])

nombres = ['Santiago', 'Matias', 'Juani', 'Tomas']
print(nombres)
print(nombres[0:2]) #Solo muestra el indice 0,1 pero no el indice 2
# ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3]) #Indices a mostrar 0, 1, 2
#Desde el indice indicado hasta el final
print(nombres[1: ])
#Modificamos un valor
nombres[2] = 'Tobias'
nombres[0] = 'Franco'
print(nombres)
#Iterar una lista
for nombre in nombres: #nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

#Preguntamos cuantos elementos tiene
print(len(nombres)) #le pasamos como parametro la lista

#Agregamos un elemento
nombres.append('Agustin')
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4, 5])
nombres.append(7)
print(nombres)

# Insertar un elemento en un indice especifico
nombres.insert(1, 'Marcelo')
print(nombres)
nombres.insert(3, 'Maria')
print(nombres)

#Eliminamos un elemento
nombres.remove('Maria')
print(nombres)

#Eliminamos el ultimo elemento
nombres.pop()
print(nombres)

#Eliminar un indice especifico
del nombres[2] # del significa delete (eliminar)
print(nombres)

#Eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)

#Eliminar la lista
del nombres
#print(nombres) #Aqui nos mostrara un error


# Definimos una tupla
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

# Acceder a un elemento, para esto utilizamos corchetes no parentesis
print(cocina[0])
#mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango
print(cocina[0:2])

# Ejemplo
verduras = ('papa',) #Una tupla necesita aunque sea un elemento: la coma
# de lo contrario solo seria un tipo string cadena

# Recorremos los elementos de la tupla
for cocinar in cocina: # Print esta usando /n para saltos de lineas
    print(cocinar, end=' ') # Usamos end= para eliminar los saltos de lineas

cocinaLista = list(cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

del cocina
print(cocina)

#del cocina esto es para eliminar una tupla

# Tipo set
planetas = {"Marte" , "Júpiter" , "Venus"}
print(len(planetas))  # Usamos la funcion len = length significa largo

# Revisar si un elemento existe dentro del set
print("Júpiter" in planetas)

# Agregar un elemento

planetas.add("Tierra") # add es una función
print(planetas)

# Eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove("Júpiter")
print(planetas)
planetas.discard("Tierra") # Esta función no nos presenta ningun error
print(planetas)

# Limpiar set
planetas.clear()
print(planetas)

# Eliminar set
del planetas
print(planetas)

# "Maradona" :10 Un diccionario esta compuesto por dos elementos
# UNA LLAVE Y UN VALOR
#dict(key,value)
diccionario = {
   "IDE" : "Integrated Develpment Enviroment" ,
   "POO" : "Programación Orientada a Objetos" ,
   "SABD" : "Sistema de Administración de Base de Datos"
}
# Verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

#Acceder a un diccionario con la llave(key)
print(diccionario["IDE"])

# Otra forma de recuperar un elemento
print(diccionario.get("POO"))
print(diccionario.get("SABD"))

# Modicicamos un elemento
diccionario ["IDE"] = "Entorno de Desarrollo Integrado"
print(diccionario)

# Como recorrer  los elementos
for termino in diccionario: # Recorremos mostrando solo las llaves
    print(termino)

# Necesitamos una función para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino) # Muestra solo las llaves

for valor in diccionario.values():
    print(valor)

# Comprobar la existencia de algun elemento
print("IDE" in diccionario)

# agregar un elemento
diccionario["PK"] = "Primary key"
print(diccionario)

# Eliminar un elemento
diccionario.pop("SABD")
print(diccionario)

#Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario # el diccionario se borro

# Concatemanos listas
lista1 = [1, 2, 3]
lista2 = [4, 5, 6]
lista3 = lista1+lista2 # Concatenamos
print(lista3)

lista3.extend([7, 8, 9]) # Función para agregar varios elementos a una lista
print(lista3)

print(lista3.index(5)) # Función para ubicar en que índice esta el valor ingresado
# print(lista3.index(0)) # esto daría un error por no ser el elemento parte de la lista

# Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count()) # Cuenta cuantos valores iguales hay dentro de la lista

# Para poner al reves una lista
lista3.reverse()
print(lista3)

# Para que una lista se multiploque repitiendo sus elementos
lista = [1, 2, 3] * 2
print(lista3)

# Métodos de ordenamiento
lista3. sort() # Ordena los elementos ascendentemente
print(lista3)
lista3.sort(reverse=True) # Ordena descendentemente
print(lista3)

#Repaso de tuplas
tupla = (4, "Hola", 6.78, [ 1, 2, 78],4, "Hola") # Puede tener diferentes tipos de datos dentro
print(tupla)

print(4 in tupla) # Acción booleana, su respuesta de de tipo booleana
# Lo que podemos usar dentro de tuplas son: index, count, len
# En tuplas se puede convertir de tupla a lista y de lista a tupla