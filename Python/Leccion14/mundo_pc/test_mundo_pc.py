from mundo_pc.computadora import Computadora
from mundo_pc.monitor import Monitor
from mundo_pc.orden import Orden
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado

teclado1 = Teclado("HP", "USB")
monitor1 = Monitor("HP", "15 Pulgadas")
raton1 = Raton("HP", "USB")
computadora1 = Computadora("HP", monitor1, teclado1, raton1)

teclado2 = Teclado("Acer", "Bluetooth")
monitor2 = Monitor("Acer", "27 Pulgadas")
raton2 = Raton("Acer", "Bluetooth")
computadora2 = Computadora("Acer", monitor2, teclado2, raton2)

teclado3 = Teclado("Redragon", "USB")
monitor3 = Monitor("LG", "23 Pulgadas")
raton3 = Raton("Logitech", "Bluetooth")
computadora3 = Computadora("Gigabyte", monitor3, teclado3, raton3)

teclado4 = Teclado("HyperX", "Bluetooth")
monitor4 = Monitor("Samsung", "27 Pulgadas")
raton4 = Raton("Razer", "Bluetooth")
computadora4 = Computadora("Asus", monitor4, teclado4, raton4)

teclado5 = Teclado("Razer", "Bluetooth")
monitor5 = Monitor("Redragon", "27 Pulgadas")
raton5 = Raton("HyperX", "Bluetooth")
computadora5 = Computadora("Asrock", monitor5, teclado5, raton5)


computadora6 = Computadora("Gigabyte", monitor1, teclado2, raton4)
computadora7 = Computadora("Asus", monitor2, teclado3, raton5)


computadoras1 = [computadora1, computadora2, computadora7, computadora4]
orden1 = Orden(computadoras1)
orden1.agregar_computadora(computadora3)
print(orden1)

computadoras2 = [computadora3, computadora5, computadora6]
orden2 = Orden(computadoras2)
orden2.agregar_computadora(computadora1)
print(orden2)
