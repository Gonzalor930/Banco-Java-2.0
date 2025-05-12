# Banco Simulado en Java

Este es un proyecto simple de simulación bancaria, desarrollado como parte de mi formación para Backend Developer en Java.

## 🚀 Tecnologías utilizadas

- Java 17
- VSCode
- Git y GitHub

## 🏦 Funcionalidades principales

- Creación de cuentas bancarias (`CuentaBancaria`, `CuentaCorriente`, `CuentaAhorro`).
- Registro de múltiples clientes en una lista (`ArrayList`).
- Operaciones de:
  - Depósito de dinero.
  - Retiro de dinero (con validaciones para saldo negativo en cuentas corrientes).
  - Aplicación de interés en cuentas de ahorro.
- Consulta de saldo individual.
- Identificación del tipo de cuenta usando polimorfismo (`instanceof`).

## 📂 Estructura del Proyecto

/BancoSimulado │ ├── src │ ├── Main.java │ ├── CuentaBancaria.java │ ├── CuentaCorriente.java │ └── CuentaAhorro.java │ └── README.md

## 📋 Notas

- Cada cuenta tiene atributos como `id`, `nombre`, `balance` y `email`.
- La Cuenta Corriente permite tener hasta -50.000 de saldo.
- La Cuenta Ahorro puede aplicar intereses al balance.

## ✨ Próximos pasos

- Mejorar el sistema agregando menús interactivos (Scanner).
- Simular transferencias entre cuentas.
- Persistir los datos en archivos o base de datos.

---

Desarrollado por Gonzalo Romano.
