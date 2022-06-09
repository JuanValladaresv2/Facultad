# Clase 7
mes = None
mes = int(input("Digite el valor para el mes: "))
if 1 <= mes <= 3:
    print(f"El mes {mes} esta dentro del rango de verano")
elif 4 <= mes <= 6:
    print(f"El mes {mes} esta dentro del rango de otoño")
elif 7 <= mes <= 9:
    print(f"El mes {mes} esta dentro de rango de invierno")
else:
    print(f"El mes {mes} esta dentro del rango primavera")