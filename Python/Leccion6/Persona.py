class Persona:  # Creamos una clase

    def __init__(self, nombre, apellido, edad, *args, **kwargs):  # Se lo llama metodo init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):  # self es igual a this
        print(
            f"La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad}, la dirección es: {self.args}, los datos importantes son: {self.kwargs}")


persona1 = Persona("Juan", "Valladares", 19)  # Necesitamos enviar argumentos
# print(persona1.nombre)
# print(persona1.apellido)
# print(persona1.edad)
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}")
persona2 = Persona("Tiago", "Rodriguez", 19)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}")

persona1.nombre = "Julieta"
persona1.apellido = "Borda"
persona1.edad = 5
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}")

# Los atributos son: caracteristicas
# Los metodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()  # La referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1) # Debemos pasar una referencia o dará error
persona1.telefono = "2255414868"
print("Este es el telefono de: {persona1.telefono}")  # Hemos creado un atributo de un objeto

# print(persona2.telefono) El objeto persona2 no tiene este atributo, da error
persona3 = Persona("Rogelio", "Romero", 22, "Teléfono", "22334455", "Calle Falsa 123", 231, "Manzana", 61, "Casa", 23,
                   Altura=1.83, Peso=70, CFavorito="Naranja", Auto="Ford Ka", modelo=2019)
persona3.mostrar_detalle()
