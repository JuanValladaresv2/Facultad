# Ejercicio etapas de la vida segun la edad
edad = int(input("Digite su edad: "))
mensaje = None
if 0 <= edad < 10: # Sintaxis simplificada
    mensaje = "La infancia es increible y bella"
elif 10 <= edad < 20:
    mensaje = "Tienes muchos cambios, mucho que estudiar"
elif 20 <= edad < 30:
    mensaje = "Amor y comienza el trabajo"
elif 30 <= edad < 40:
    mensaje = "Nos caemos a pedazos"
elif 40 <= edad < 60:
    mensaje = "No seas peronista por favor"
print(f"tu edad es: {edad}, {mensaje}")
