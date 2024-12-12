markdown

# Cambiar la URL del Repositorio Remoto en IntelliJ IDEA


## 1. Abrir el Proyecto

Abre IntelliJ IDEA y carga el proyecto en el que estás trabajando.


## 2. Abrir la Configuración del Proyecto

- Ve a **File** (Archivo) en la barra de menú superior.

- Selecciona **Settings** (Configuración) si estás en Windows/Linux o **Preferences** (Preferencias) si estás en macOS.


## 3. Navegar a Version Control

- En la ventana de configuración, busca la sección llamada **Version Control** en el panel izquierdo.

- Dentro de **Version Control**, selecciona **Git**.


## 4. Verificar la Configuración de Git

En la sección de Git, asegúrate de que la ruta al ejecutable de Git esté configurada correctamente. Esto no cambiará la URL, pero es bueno asegurarse de que Git esté configurado correctamente.


## 5. Cambiar la URL del Repositorio Remoto

En lugar de buscar "Remotes", puedes usar la terminal integrada de IntelliJ IDEA para cambiar la URL del repositorio remoto.

- Abre la terminal integrada en IntelliJ IDEA (puedes encontrarla en la parte inferior de la ventana, en la pestaña **Terminal**).

- Escribe el siguiente comando, reemplazando la URL con la correcta:

- Esto se debera hacer todo dentro de la consola del propio intelliji

```bash

git remote set-url origin https://github.com/tu_usuario/nombre_del_repositorio.git

git remote -v

git push origin master
