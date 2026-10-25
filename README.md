Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Billetera Virtual y Control de Transferencias (Encapsulamiento y Validaciones Financieras en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 💳 Simulación de Billetera Virtual y Transferencias (Encapsulamiento y Seguridad en Java)

Este proyecto es una aplicación en Java que modela la gestión de una billetera virtual, permitiendo realizar transferencias monetarias y actualizar límites operativos bajo estrictas reglas de seguridad y validación de identidad. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, el control de estado defensivo mediante constructores y la validación de transacciones financieras complejas en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`BilleteraVirtual`**: Modela la cuenta digital y protege la integridad del saldo, los límites diarios y la identidad del titular.
* **Atributos privados (`private`)**: `alias`, `saldo` y `limiteDiarioTransferencia`, impidiendo la alteración directa o malintencionada desde el exterior.
* **Constructor**: Inicializa la billetera asignando el alias, estableciendo un límite diario predeterminado ($1,000,000$) y validando que el saldo inicial no sea negativo.
* **Métodos accesores (*getters*)**: Permiten consultar de forma controlada el alias, el saldo actual y el límite vigente.
* **Métodos operativos de negocio**:
* `transferir(double monto)`: Valida que el monto sea positivo, que existan fondos suficientes y que la cantidad no supere el límite diario configurado antes de descontar el saldo.
* `actualizarLimite(double nuevoLimite, String aliasTitular)`: Verifica la autorización del titular comparando el alias proporcionado con el registrado antes de permitir modificar el tope de transferencia diario.




* **`Main`**: Punto de entrada del programa. Instancia una billetera virtual y simula diversos escenarios operativos: transferencias exitosas, rechazos por saldo insuficiente, actualizaciones de límites autorizadas y no autorizadas, y superación de topes diarios, mostrando el estado final por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Validación Exhaustiva de Transferencias:** El método `transferir` evalúa tres condiciones restrictivas secuenciales: que el monto sea mayor a cero, que no exceda el saldo disponible y que no rebase el límite diario permitido.
2. **Control de Autorización para Cambios Críticos:** El método `actualizarLimite` exige una credencial de validación (`aliasTitular`), rechazando cualquier intento de modificación si la identidad no coincide con el propietario de la billetera.
3. **Encapsulamiento Estricto:** Oculta la información financiera sensible, garantizando que el saldo y los límites solo puedan modificarse a través de transacciones controladas y seguras.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
--- Primera transferencia ---
Transferencia realizada correctamente.

--- Supera el saldo disponible ---
Transferencia rechazada: saldo insuficiente.

--- Supera el límite ---
Límite actualizado correctamente.
Transferencia rechazada: supera el límite.

--- Titular no autorizado ---
Cambio rechazado: titular no autorizado.

--- Transferencia exitosa ---
Transferencia realizada correctamente.

--- Estado final ---
Alias: usuario.mp
Saldo: $25000.0
Límite diario: $20000.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento de Estado:** Ocultamiento de los datos económicos y de seguridad, permitiendo interactuar con el objeto únicamente mediante métodos públicos seguros.
* **Validación de Invariantes Financieras:** Garantía estricta de que las operaciones respeten las leyes de negocio (evitando saldos negativos o transacciones por encima de los topes autorizados).
* **Diseño Modular:** Clara separación entre la lógica de control financiero (`BilleteraVirtual`) y el flujo de pruebas ejecutado en el cliente (`Main`).
