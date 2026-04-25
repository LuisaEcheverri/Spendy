# Spendy - Gastos Hormiga

Spendy es una API desarrollada con **Spring Boot** para gestionar gastos hormiga y categorías personalizadas.  
Permite crear, listar, editar y eliminar categorías y registros de gastos.

El sistema analiza los gastos de los usuarios registrados, generando datos reales sobre los consumos cotidianos que afectan la economía individual.

---

## 📑 Tabla de Contenidos

- [Características](#características)
- [Requisitos](#requisitos)
- [Tecnologías](#tecnologías)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Contribución](#contribución)
- [Licencia](#licencia)

---

## 🚀 Características

- Registro rápido de gastos hormiga
- Categorización de gastos
- Gestión de métodos de pago
- Registro de valor y fecha del gasto
- Gestión de usuarios

---

## 📋 Requisitos

- Java >= 21
- Maven instalado
- Python 3.12.2


## 🛠 Tecnologías

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---


## 📦 Instalación

Clona el repositorio:

git clone https://github.com/PaulaCarrion28/Spendy.git

cd Spendy

mvn spring-boot:run

http://localhost:8080

## Estructura del proyecto

src/
 └── main/
     └── java/
         └── modelos/
             ├── Categoria.java
             ├── Comercio.java
             ├── Gasto.java
             ├── MetodoPago.java
             └── Usuario.java


## Contribuir

Las contribuciones son bienvenidas. Por favor:

1. Haz fork del repositorio
2. Crea una rama (`git checkout -b feature/nueva-funcionalidad`)
3. Haz commit (`git commit -m 'Describe la funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request
