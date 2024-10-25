# 🔐 **Sistema de Login con Roles y Permisos en Java**

## Descripción 📋

Este proyecto es una **aplicación de autenticación** y **gestión de roles y permisos** desarrollada en **Java 17**. Utiliza un **modelo de capas** para mantener una estructura modular y organizada. A través de interfaces gráficas de usuario (IGU) basadas en **JFrame**, permite a los administradores gestionar de forma completa a los usuarios y sus roles. Las operaciones CRUD están respaldadas por **JPA** para la persistencia de datos con **MySQL**.

## Funcionalidades 🚀

- **CRUD completo para el usuario administrador**:
  - **Crear** usuarios con distintos roles.
  - **Leer** la información de usuarios registrados.
  - **Actualizar** datos de usuarios y sus roles.
  - **Eliminar** usuarios de la base de datos.
- **Autenticación de usuarios** con verificación de credenciales.
- **Roles y permisos** para controlar el acceso a distintas funcionalidades.
- **Interfaz gráfica intuitiva** mediante **JFrame** para una experiencia de usuario mejorada.

## Tecnologías 🛠️

- **Java 17**: Lenguaje de programación orientado a objetos.
- **JPA (Java Persistence API)**: Para la persistencia de datos.
- **MySQL**: Base de datos relacional.
- **JFrame**: Para la construcción de interfaces gráficas de usuario (IGU).

## Arquitectura 🏗️

La aplicación sigue una arquitectura en **3 capas**, facilitando la mantenibilidad y la escalabilidad del código:

- **IGU (Interfaz Gráfica de Usuario)**: 
  - Maneja la interacción del usuario y delega la lógica de la aplicación a la capa de lógica.
  - Construida con **JFrame** para proporcionar ventanas y diálogos de interacción.

- **Lógica**: 
  - Contiene la lógica de la aplicación y gestiona la comunicación entre la capa IGU y la capa de persistencia.
  - Se encarga de la validación de datos y procesos internos.

- **Persistencia**: 
  - Realiza operaciones **CRUD** utilizando **JPA** para interactuar con la base de datos **MySQL**.
  - Garantiza la integridad y persistencia de los datos.

## Instalación y Ejecución 💻

Sigue estos pasos para levantar el proyecto en tu entorno local:

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/JosefinaOller/Login.git
   cd Login
   ```

2. **Configurar la base de datos MySQL**: 
   - Crea una base de datos en MySQL con el nombre `login`.
   - Actualiza las credenciales en el archivo `persistence.xml`:
     ```xml
     <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/login" />
     <property name="javax.persistence.jdbc.user" value="tu_usuario" />
     <property name="javax.persistence.jdbc.password" value="tu_contraseña" />
     ```

3. **Construir y ejecutar la aplicación**:
   - Usa tu entorno de desarrollo favorito (por ejemplo, IntelliJ IDEA o Eclipse) para compilar y ejecutar el proyecto.
   - Asegúrate de tener configurado el JDK 17.

4. **Acceder a la aplicación**:
   - La interfaz gráfica se abrirá para gestionar usuarios y roles de manera interactiva a través de ventanas creadas con **JFrame**.

## Uso 🧑‍💻

- **Panel de administración**: Permite al administrador gestionar usuarios, asignar roles y modificar permisos.
- **Ventanas de autenticación**: Los usuarios pueden iniciar sesión con sus credenciales.
- **Interfaces CRUD**: Proveen una forma visual e intuitiva de interactuar con los datos de usuarios y roles mediante formularios en **JFrame**.
