# 🔄 Ejercicios de Principio de Inversión de Dependencias (DIP) - SOLID

Este directorio contiene ejemplos prácticos que ilustran el **Principio de Inversión de Dependencias**, el último principio del conjunto SOLID. Este principio promueve un diseño en el que **las clases de alto nivel no dependen de clases concretas, sino de abstracciones (interfaces o clases abstractas)**.

> “Las clases de alto nivel no deben depender de las clases de bajo nivel. Ambas deben depender de abstracciones.”

> “Las abstracciones no deben depender de los detalles. Los detalles deben depender de las abstracciones.”

---

## 🧪 Ejercicios incluidos

### 🌦️ `Estación Meteorológica` – Inversión de dependencias con sensores meteorológicos
- Se parte de un diseño rígido donde la clase `EstacionMeteorologica` dependía directamente de un `Termometro`.
- Se refactoriza para que la estación dependa de una interfaz `IMeteoAparato`, que representa cualquier sensor meteorológico.
- Cada sensor (`Termometro`, `Pluviometro`, `Barometro`) implementa esta interfaz y puede ser inyectado a la estación sin necesidad de modificarla.
- Se aplica el principio DIP al permitir que las **abstracciones sean el punto de dependencia**, no las implementaciones concretas.

📁 Carpeta: `estacion_meteorologica/`

---

### 💾 `Sistema de Almacenamiento` – Separación de lógica de guardado mediante abstracciones
- Se modela un sistema que guarda archivos en distintas ubicaciones: disco local, nube y servidor FTP.
- Inicialmente, `GestorDocumentos` dependía directamente de `AlmacenamientoLocal`, lo que impedía cambiar la lógica sin modificar código.
- Se refactoriza creando una interfaz `Almacenamiento`, implementada por `AlmacenamientoLocal`, `AlmacenamientoCloud` y `AlmacenamientoFTP`.
- `GestorDocumentos` ahora depende de la interfaz y permite inyectar cualquier estrategia de almacenamiento, respetando DIP.

📁 Carpeta: `sistema_almacenamiento/`

---

### 📧 `Sistema de Notificaciones` – Abstracción e inyección de servicios
- Se parte de un diseño donde la clase `Notificador` dependía directamente de un servicio de email (`EmailService`), lo que hacía que cualquier cambio en el canal de envío implicara modificar el código.
- Se refactoriza para que `Notificador` dependa de una **interfaz común** `ServicioNotificacion`.
- Las implementaciones concretas (`EmailService`, `SMSService`, `PushService`) se inyectan desde fuera, respetando completamente el principio DIP.
- El resultado es un sistema desacoplado, extensible y fácil de mantener o testear.

📁 Carpeta: `sistema_notificaciones/`

---

### 🛒 `Sistema de Pagos` – Lógica desacoplada del método de pago
- Se modela un sistema de pagos donde `CarritoDeCompras` inicialmente dependía directamente de `PagoTarjeta`, impidiendo el uso flexible de otros métodos como PayPal o Transferencia.
- Se refactoriza creando una interfaz `MetodoPago`, y cada tipo de pago (`PagoTarjeta`, `PagoPayPal`, `PagoTransferencia`) implementa dicha interfaz.
- El método de pago se inyecta en el carrito, logrando un sistema flexible, extensible y alineado con DIP.

📁 Carpeta: `sistema_pagos/`

---

## 🧠 Claves del principio:

- Las **clases de alto nivel (lógica de negocio)** no deben depender directamente de clases de bajo nivel (detalles técnicos).
- El código debe depender de **interfaces** o **abstracciones** que permiten la inversión de control.
- Las **dependencias deben inyectarse** (por constructor, método, o setter), no instanciarse directamente.
- Facilita la creación de **sistemas modulares, extensibles y testables**.

---

✅ **Autor**: Cristian Laurentiu Sindila
🗓 **Fecha**: Abril 2025