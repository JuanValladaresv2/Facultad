# Ejercicio 3: agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos
# Nombre: Aragon
# Clase: Guerrero
# Raza: Dunadan del norte

#Nombre: Gandalf
#Clase: Mago
#Raza: Istar

#Nombre: Legolas
#Clase: Arquero
#Raza: Elfo Sindar
lista = []
señorDeLosAnillos = {
    1: {'Nombre': 'Aragon', 'Clase': 'Guerrero', 'Raza': 'Dunadan del Norte'},
    2: {'Nombre': 'Gandalf', 'Clase': 'Guerrero', 'Raza': 'Istar'},
    3: {'Nombre': 'Legolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'},
    4: {'Nombre': 'Elrond', 'Clase': 'Señor de Rivendel', 'Raza': 'Peredhil'},
    5: {'Nombre': 'Isildur', 'Clase': 'Guerrero', 'Raza':'Dúnedain'},
    6: {'Nombre': 'Saruman', 'Clase': 'Mago', 'Raza': 'Istar'}
}

lista = señorDeLosAnillos.values()

print(lista)