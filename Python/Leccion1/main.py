# Clase 1
"""
print("Hello World")
"""

# Clase 2
"""
miVariable = 3
print(miVariable)
miVariable = "Hola a todos los estudiantes de la tecnicatura"
print(miVariable)
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# Las literales se escriben x528, la variable y= x272, la variable z = x592
print(id(y))
print(id(z))
"""
# Clase 3
"""
a: str = "Hola alumnos"
print(type(a))

#Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola Alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

#Manejo de cadenas
miGrupoFavorito = "Twenty One Pilots"
caracteristicas = "The Best Rock Band"
print("Mi grupo favorito es: " + miGrupoFavorito +caracteristicas)
#numero1 = "7"
#numero2 = "8"
#print(int(numero1) + int(numero2))

#Tipos Boolenaos(Bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario
# Funcion input
#resultado = input("Digite un número: ")  # Regresa un tipo de dato String
#print(resultado)

# Conversión de la entrada de datos
numero1 = int(input("Escribe el primero número"))
numero2 = int(input("Escribe el segundo número"))
resultado = numero1 + numero2
print("el resultado de la suma es: ", resultado)

#Ejercicio "Como estuvo tu día?"
miDia = int(input("Como estuvo tu día?"))
if miDia <=10:
    print(f"Tu día estuvo de:{miDia}")
else: print ("Ingrese un valor de 1 a 10")

# Ejercicio libro
titulo = input("Porporciona el titulo del libro: ")
autor =input("Proporciona el autor del libro: ")
print(título, "fue escrito por: ", autor)
"""
# Clase 4
"""
operandoA= 8
operandoB = 5
suma = operandoA + operandoB
#print("Resultado de la suma: ", suma)
print(f"El resultado de la suma es: {suma}")

Resta = operandoA - operandoB
print(f"el resultado de la resta es: {resta}")

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicación es: {multiplicacion}")

division = operandoA / operandoB
print(f"El resultado de la división es: {division}")
division = operandoA // operandoB
print(f"El resultado de la división (int) es: {division}")

modulo = operandoA % operandoB
print(f"El resultado de la división o residuo(modulo) es: {modulo}")

exponente = operandoA ** operandoB
print(f"El resultado del exponente es: {exponente}")

# Ejercicio "Rectangulo"
alto = int(input("Proporciona el alto del rectangulo"))
ancho = int(input("Proporciona el ancho del rectangulo"))
area = alto * ancho
print("el area es: ", area)
perimetro = (alto + ancho) * 2
print("el perímetro es: ", perimetro)

miVariable3 = 10
print(miVariable3)

# Operadores de reasignación
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

# miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)

# miVariable3 = miVariable * 2
miVariable3 *= 2
print(miVariable3)

# miVariable3 = miVariable / 2
miVariable3 /= 2
print(miVariable3)

# Operadores de Comparación
d = 4
b = 2
resultado = d == b  # Comprobamos si son iguales
print(resultado)

# Operador diferente
resultado = d != b
print(resultado)

# Operador Mayor que
resultado = d > b
print(resultado)

# Operador Menor o igual que
resultado = d <= b
print(resultado)

# Operador mayor o igual que
resultado = d >= b

# Ejercicio "Par o Impar"
num1 = int(input("Proporciona un número: "))
if num1 % 2 == 0: print(f"el número {num1} es par")
else: print(f"el número {num1} es impar")

# Ejercicio mayor de edad
num1 = int(input("Escribe tu edad: "))
if num1 >=18: print("Es mayor de edad")
else: print("Es menor de edad")
"""
# Clase 5
"""
# Operadores Lógicos
a = True
b = True
resultado = a and b
print(resultado)

# Operador or
resultado = a or b
print(resultado)

# Ejercicio "Valor dentro de un rango"
valor = int(input("Digite un número: "))
if valor <= 5 and valor >= 0: print(f"El valor {valor} esta dentro del rango")
else: print(f"El valor {valor} no esta dento del rango")

# Ejercicio con el operador or
vacaciones = False
diaDescanso = False
if vacaciones or diaDescanso:
    print("Puede asistir al juego")
else:
    print("Tiene trabajo que hacer")

# Ejercicio "rango de edad entre 20 y 30 años"
edad =int(input("¿Cuál es tu edad? "))
if edad>=21 and edad<=29 or edad==20 or edad==30 : print(f"{edad} esta dentro del rango")
else : print(f"{edad} no esta dentro del rango")

# Ejercicio "El mayor de dos numeros"
num1 = int(input("Ingrese un número: "))
num2 = int(input("Ingrese otro número: "))
if num1 > num2:
    print(f"{num1} es el mayor de los dos números")
else:
    print(f"{num2} es el mayor de los dos números")

# Ejercicio "Tienda de libros"
nombre = input("Digite el nombre del libro: ")
id = int(input("Digite el ID del libro: "))
precio = float(input("Digite el preico del libro: "))
envio = bool(input("Indique si el envio es gratuito (True/False): "))
print(f"Nombre: {nombre}")
print(f"id: {id}")
print(f"precio: {precio}")
if envio:
    print("Envio: Gratuito")
else:
    print("Envio: No posee Envio Gratuito")
"""