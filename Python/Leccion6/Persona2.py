class Persona2:
    def __init__(self, nombre, apellido, edad):  # Esta encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalle(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")

    @property  # decorador
    def nombre(self):  # Método Getter
        print("Estamos utilizando el metodo get")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Método Setter
        print("Estamos utilizando el metodo set")
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")


if __name__ == "__main__":
    persona1 = Persona2("Juan", "Valladares", 19)
    print(persona1.nombre)  # Llamamos al método getter
    persona1.nombre = "Ignacio"  # Llamamos al método setter
    print(persona1.nombre)  # Otra vez con el método getter
    print(persona1.mostrar_detalle())  # Llamamos al método mostrar detalles
    # Atributo read-only sería la edad porque no tiene el método set
    print(persona1.edad)
    # Tarea crear tres objetos más, utlizando los métodos getter and setter
    # para modificar, y mostrar los cambios

    persona2 = Persona2("Flor", "Romero", 23)
    persona2.nombre = "Florencia"
    persona2.apellido = "Romery"
    persona2.edad = 22
    print(persona2.mostrar_detalle())

    persona3 = Persona2("Caro", "Felisa", 21)
    persona3.nombre = "Carolina"
    persona3.apellido = "Felix"
    persona3.edad = 31
    print(persona3.mostrar_detalle())

    persona4 = Persona2("Naty", "Lucer", 35)
    persona4.nombre = "Natalia"
    persona4.apellido = "Lucero"
    persona4.edad = 33
    print(persona4.mostrar_detalle())

    print(__name__)  # Es una herramienta que sirve para mostrar donde se está ejecuntado el código
