# Conversor de Monedas

Este proyecto es una aplicación Java para convertir monedas utilizando la API de ExchangeRate-API. Permite consultar tasas de conversión actuales y realizar conversiones entre varias monedas comunes, además de permitir configuraciones personalizadas.

## Características

- Conversión rápida entre monedas predefinidas (USD, ARS, BRL, COP).
- Capacidad de convertir entre cualquier par de monedas soportado por la API.
- Interfaz de consola simple e interactiva.

## Requisitos

- **Java 11** o superior.
- Conexión a Internet para acceder a la API de ExchangeRate.

## Instalación

1. Clona el repositorio o descarga el código fuente.
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   ```
2. Asegúrate de tener configurado un entorno de desarrollo Java (como IntelliJ IDEA o NetBeans).
3. Incluye la biblioteca `Gson` en tu proyecto. Puedes descargarla desde [Maven Central](https://mvnrepository.com/artifact/com.google.code.gson/gson) o utilizar un gestor de dependencias como Maven o Gradle.
4. Ejecuta el archivo `Principal.java` para iniciar la aplicación.

## Uso

Al iniciar la aplicación, se mostrará un menú con las siguientes opciones:

1. Convertir USD a ARS.
2. Convertir ARS a USD.
3. Convertir USD a BRL.
4. Convertir BRL a USD.
5. Convertir USD a COP.
6. Convertir COP a USD.
7. Convertir entre otras monedas.
8. Salir del programa.

Selecciona la opción deseada e ingresa la cantidad en la moneda base. La aplicación mostrará la cantidad convertida según la tasa de conversión actual.

## Ejemplo de Uso

--------------------------------
Bienvenidos Al Conversor de Monedas

Ingresa la conversión que deseas realizar

1. Dolar a peso Argentino
2. Peso Argentino a Dolar
3. Dolar a Real Brasilero
4. Real Brasilero a Dolar
5. Dolar a peso Colombiano
6. Peso Colombiano a Dolar
7. Convertir otra moneda
8. Salir

Seleccione una opción: 1
La Tasa de conversión de hoy
1 USD = 350 ARS
Ingrese la cantidad de USD: 100
100 USD = 35000 ARS
```

## API Utilizada

La aplicación utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tasas de conversión en tiempo real. Se utiliza la siguiente URL para las consultas:

```
https://v6.exchangerate-api.com/v6/{API_KEY}/pair/{monedaBase}/{monedaTarget}
```

Reemplaza `{API_KEY}` con tu clave de API. La clave actual incluida en el código es de ejemplo y puede expirar.

## Estructura del Proyecto

- **`ConsultaMonedas`**: Clase para realizar consultas a la API y obtener datos de conversión.
- **`Monedas`**: Clase de modelo para representar la respuesta de la API.
- **`ConvertirMonedas`**: Clase con métodos para realizar conversiones y gestionar la interacción con el usuario.
- **`Principal`**: Clase principal que ejecuta el programa e interactúa con el usuario mediante un menú.

