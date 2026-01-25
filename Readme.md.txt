Reto 1: "El Guardián de los Datos" (Validaciones en Setters)
Contexto: RRHH reportó un error grave: alguien registró un Vendedor con ventas negativas (-500) y el sistema le restó sueldo en lugar de sumarle. Además, hay empleados con sueldo 0. El estudiante debe proteger las clases para que esto sea imposible.


Lógica de protección:

Si intentan poner un sueldo negativo, el sistema debe asignar el Sueldo Mínimo (digamos, $300) y mostrar una alerta en consola. (Valor de sueldo aplicado por defecto)

Si el nombre viene vacío, asignar "Sin Nombre".