# Banco-Java-2.0

Este es un proyecto simple de consola que simula el funcionamiento básico de un banco. Fue desarrollado en Java como parte de un plan de estudio para backend developer. El proyecto está orientado a objetos y aplica conceptos fundamentales como herencia, clases abstractas, encapsulamiento, colecciones, validaciones y modularización del código.

## 📌 Funcionalidades implementadas

### 🏦 Clases y estructura principal

- `CuentaAbstracta`: clase abstracta que define el contrato común entre cuentas (atributos y métodos).
- `CuentaBancaria`: cuenta común que permite depósitos y retiros simples.
- `CuentaCorriente`: permite sobregiro hasta -50,000. Sobre-escribe el método de retiro.
- `CuentaAhorro`: permite aplicar intereses y sobre-escribe el método de retiro con lógica personalizada.
- `Banco`: administra un diccionario (`HashMap`) de cuentas. Permite:
  - Agregar cuentas
  - Eliminar cuentas
  - Buscar cuentas por ID
  - Mostrar todas las cuentas registradas

### 📚 Interfaces y modularización

- Se modularizó la lógica para cargar cuentas en una clase llamada `LectorDeCuentas`, separando esa responsabilidad del `main`.
- Se organizó el flujo del sistema en un menú principal dentro de la clase `MenuBanco` para evitar sobrecargar el `main`.

### 🧠 Estructuras de datos

- Se usó un `HashMap<Integer, CuentaAbstracta>` para administrar las cuentas en el sistema. Esto permite buscar, agregar o eliminar cuentas por su ID de forma rápida y eficiente.

### 📋 Menú interactivo de consola

Al iniciar el programa, se presenta un menú interactivo donde se puede:

- Crear nuevas cuentas de tipo:
  - Cuenta Común
  - Cuenta Corriente
  - Cuenta de Ahorro
- Consultar datos de una cuenta
- Depositar dinero
- Retirar dinero
- Ver todas las cuentas del banco
- Salir del programa

Durante la carga de cada nueva cuenta, el sistema:
- Solicita los datos uno por uno (ID, nombre, balance, mail)
- Muestra el dato ingresado y pregunta si es correcto
- Permite volver a ingresarlo si hubo un error
- Finaliza la carga al ingresar ID = 0 (ese valor no se procesa)

### ✅ Validaciones y excepciones

- Se utilizan validaciones de entrada y `IllegalArgumentException` para controlar errores lógicos, como balances negativos inválidos o retiros fuera de límite.
- El menú es robusto ante entradas incorrectas (por ejemplo, letras en lugar de números).

## 🛠️ Tecnologías utilizadas

- Java (JDK 17+ recomendado)
- IDE: Visual Studio Code / IntelliJ / NetBeans
- Git para control de versiones

📁 Estructura del proyecto
src/
│
├── Banco.java
├── CuentaAbstracta.java
├── CuentaBancaria.java
├── CuentaCorriente.java
├── CuentaAhorro.java
├── LectorDeCuentas.java
├── MenuBanco.java
└── Main.java


