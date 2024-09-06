# PT-ERS-01.Especificación de Requisitos (Zona Blue)

## Zona Blue
1.0

**HISTORIAL DE REVISIÓN**

| Versión | Fecha Elaboración | Responsable Elaboración | Fecha Aprobación | Responsable Aprobación |
| --- | --- | --- | --- | --- |
| 1.0 | 25/07/2024 | Shelcy Danniela Romerin |  |  |
| 1.1 | 1/08/2024 | Juan Esteban Grajales Mesa |  |  |
| 1.2 | 28/08/2024 | Juan Esteban Grajales Mesa |  |  |

**CAMBIOS RESPECTO A LA VERSIÓN ANTERIOR**

| **VERSIÓN** | **MODIFICACIÓN RESPECTO VERSIÓN ANTERIOR** |
| --- | --- |
| 1.0 | Creación del Documento. |
| 1.1 | Revisión y corrección de el documento |
| 1.2 | corrección de documento |

## Tabla de Contenido.

## 1. Introducción

La temática que estamos abordando en el proyecto es la mejora de la gestión del espacio en la ciudad, centrándose específicamente en optimizar el uso de los parqueaderos desocupados o con poco uso. La plataforma que estamos desarrollando tiene como objetivo facilitar a los dueños de parqueaderos la promoción de sus espacios y a los clientes la búsqueda de parqueaderos disponibles en la zona deseada. Es una iniciativa muy relevante y con un gran potencial para mejorar la movilidad urbana.

### 1.1 Responsables e Involucrados

| **Nombre** | **Tipo (Responsable/ Involucrado)** | **Rol** | Cargo |
| --- | --- | --- | --- |
| German Angarita | Involucrado | Product Owner | Instructor |
| Danniela Romerin | Responsable | Development Team | Aprendiz |
| Katalina Ortiz | Responsable | Development Team | Aprendiz |
| Juan Esteban Grajales | Responsable | Scrum Master | Aprendiz |

### 1.2 Referencias (Bibliografía o web Grafía)

En el proceso de análisis del sistema para el proyecto de gestión de espacios y parqueaderos, se consultaron diversas referencias bibliográficas y web gráficas para fundamentar las decisiones tomadas. Algunas de estas referencias fueron obtenidas gracias al proceso de levantamiento de información con el cliente, lo que garantiza su relevancia y pertinencia para el proyecto.

| Nombre | Descripción | Link Referencia |
| --- | --- | --- |
| Ley 1581 de 2012 | Son las leyes que debemos cumplir con los datos del usuario | [https://www.funcionpublica.gov.co/eva/gestornormativo/norma.php?i=49981](https://www.funcionpublica.gov.co/eva/gestornormativo/norma.php?i=49981) |
| Ley 1480 de 2011 | Son las leyes que protegen los datos personales | [https://www.funcionpublica.gov.co/eva/gestornormativo/norma.php?i=44306](https://www.funcionpublica.gov.co/eva/gestornormativo/norma.php?i=44306) |
| Normas que debe cumplir un parqueadero | Estas son las normas básicas que deben cumplir los parqueaderos | [https://coins-colombia.com/2022/06/18/9-requisitos-para-el-funcionamiento-de-parqueaderos-colombia/](https://coins-colombia.com/2022/06/18/9-requisitos-para-el-funcionamiento-de-parqueaderos-colombia/) |

### 1.3 Requisitos para los parqueaderos:

1. **Licencia de funcionamiento:** Es indispensable contar con los permisos correspondientes otorgados por las autoridades locales.
2. **Seguridad:**
    - Iluminación adecuada en todo el estacionamiento.
    - Sistemas de vigilancia (cámaras, guardias de seguridad).
    - Señalización clara y visible.
    - Extintores y equipos contra incendios.
3. **Accesibilidad:**
    - Espacios reservados para personas con discapacidad.
    - Rampas y señalización adecuada para facilitar el acceso.
4. Expedir recibo de depósito del vehículo al momento del ingreso, en el que se consigne el número de placa del vehículo y la hora de ingreso.
5. Ofrecer al conductor del vehículo la opción de relacionar bienes adicionales al que deja en depósito.
6. Cumplir con las tarifas establecidas por la autoridad distrital o municipal.
7. Contar con seguridad permanente, y de acuerdo con la clasificación del estacionamiento o parqueadero, con acomodadores uniformados con licencia de conducción y con credenciales que faciliten su identificación por parte de los usuarios.
8. Señalizar debidamente la entrada y la salida de vehículos y demarcar el espacio que ocupa cada vehículo y los corredores de giro y movilidad.

### 1.4 Leyes en la que incurre el aplicativo web

<aside>
💡 Ley 1480 de 2011 (Estatuto del Consumidor):

</aside>

- **Se expidió el Estatuto del Consumidor, con el objeto de proteger, promover y garantizar la efectividad y el libre ejercicio de los derechos de los consumidores**.

<aside>
💡 Ley 1581 de 2012 (Protección de Datos):

</aside>

- Reconoce y protege el derecho **que** tienen todas las personas a conocer, actualizar y rectificar las informaciones **que** se hayan recogido sobre ellas en bases de datos o archivos **que** sean susceptibles de tratamiento por entidades de naturaleza pública o privada.

## 2. Características del producto

- La sistema permitirá la gestión de espacios libres de los parqueaderos registrados
- El sistema tendrá una forma fácil y intuitiva de usar
- El sistema será desarrollado con un lenguaje de programación java principalmente
- El sistema contara con una base de datos de tipo de base de datos relacionadas PostgreSQL
- Esta ayudara a a aliviar el problema de desperdicio de los espacios disponibles
- El sistema será fácil de de portar para los usuario ,ya que este contara con una aplicativo móvil
- Facilita la movilidad de las personas con vehículos privados , el ayudar en el estacionamientos

## 3. Funciones del producto

### 3.1 Inicio  :

Este módulo permitirá a los usuarios iniciar sesión en la plataforma y realizar búsquedas de parqueaderos disponibles en Armenia-Quindío incluso si no se esta registrado, pero para un mayor apoyo del aplicativo web se necesita registrarse

### 3.2 Búsqueda :

 El aplicativo web permitirá la búsqueda de parqueadero disponible según la ubicación del mismo usuario registrado ,pero los usuarios no registrados aun podrán buscar parqueaderos disponibles ellos mismos

### 3.2 Gestión de Parqueaderos:

 Aquí se podrá llevar a cabo el registro, consulta, actualización y eliminación de información relacionada con los parqueaderos, permitiendo a los propietarios publicitar sus espacios de estacionamiento de manera efectiva.

### 3.3 Reservas :

 Este módulo facilitará a los usuarios registrados la posibilidad de reservar espacios de estacionamiento en tiempo real, garantizando una experiencia fluida y segura.

### 3.4 Geolocalización:

Integración de funciones de geolocalización para que los usuarios puedan encontrar fácilmente los parqueaderos cercanos a su ubicación actual, optimizando la búsqueda y selección de espacios disponibles.

### 3.5 Reportes y Estadísticas:

 Permite la generación de reportes detallados sobre la utilización de los parqueaderos, así como estadísticas relevantes para los propietarios y administradores, facilitando la toma de decisiones informadas.

### 3.6 Notificaciones:

Implementar un sistema de notificaciones para enviar recordatorios de reservas, promociones especiales de parqueaderos cercanos, actualizaciones sobre disponibilidad, entre otros.

### 3.7 Bots:

 El sistema contara con bots que se encargaran de ayudar al usuario registrado a saber de los parqueaderos cercanos y otras pequeñas tares.

Y a los administradores a gestionar el sistema automatizado tareas simples.

### 3.8 Registro de parqueaderos:

Los propietarios de parqueaderos tendrán lo posibilidad de registrar su parqueadero en el aplicativo para poder tener mayor visibilidad ala vista del publico , siempre que cumpla con las normas establecidas.

### 3.9 Gestión de pagos:

Los usuarios registrados podrán paga por medio de la aplicación móvil ,las reservas deben ser pagadas en línea , después de que se cumpla la transacción los usuarios registrados recibirán una factura virtual por correo electrónico como comprobante.

## 4 Características del usuario

Estos perfiles de usuario representan a las personas involucradas en el proceso de gestión de inventarios y préstamo de ambientes en el centro, cada uno con funciones específicas que contribuyen al correcto funcionamiento del sistema.

## ***4.1  Administrador:***

- Responsable de la administración general del sistema.
- Capacidad para gestionar todos los módulos del sistema.
- Acceso total a todas las funcionalidades tanto para modificarlas como para el mantenimiento.
- Puede gestionar cualquier tipo de usuario en la plataforma, pudiendo vetar a los usuarios que se consideren no apropiados.
- Este será asistido por bots que lo ayudaran a la gestión de errores y comprobación de violaciones

## *4.2  Propietario de Parqueadero:*

- Dueño o encargado del parqueadero.
- Realiza la gestión de la información del parqueadero.
- Acceso parcial al sistema para realizar tareas específicas relacionadas con su establecimiento ,tales como decir cuántos puestos desea rentar a los usuarios registrados .
- Puede registrarse en la plataforma principal en el apartado de los parqueaderos.
- debe proporcionar los documento mencionados anterior mente.

## *4.3  Usuario Registrado:*

- Usuario que utiliza la aplicación móvil para consultar disponibilidad de espacios y otras informaciones relevantes.
- Acceso a la función de reserva.
- La aplicación mostrara automáticamente los parqueaderos con espacios disponibles, por medio de la ubicación del dispositivo móvil o similares.

### 4.4 Usuario no registrado

- Este solo tendrá acceso a la información de los parqueaderos disponibles y nada más.

## **5. Especificación de requisitos**

### 5.1 Requisitos funcionales

Estas funcionalidades son fundamentales para asegurar un adecuado manejo de inventarios y préstamo de ambientes, optimizando así la experiencia tanto para los clientes como para los administradores del sistema.

Los requisitos funcionales corresponden a la funcionalidad del sistema, básicamente lo que el sistema debe hacer, teniendo esto en cuenta a continuación se presenta la lista de requisitos funcionales tanto del sistema web como del sistema móvil.

| **FUNCIONALIDAD DE LA PLATAFORMA** | **TIPO (Esencial, Ideal, Opcional)** |
| --- | --- |
| RF01 -Registro de Usuarios | Esencial |
| RF02 -Registro de parqueaderos | Esencial |
| RF03 -Reserva de Espacios | Esencial |
| RF04 -Administración de Espacios | Esencial |
| RF05 -Reportes y Estadísticas  | ideal |
| RF06 -Notificaciones y Alertas | ideal |
| RF07 - Registro y Perfil de Administradores. | Esencial |
| RF08 -Búsqueda Avanzada  | ideal |
| RF9 -Sistema de Reservas | Esencial  |
| RF10 - mapas | Esencial |
| RF11 -Reseñas y valoraciones | ideal |
| RF12 -Notificaciones en tiempo real | Ideal |
| RF13 -Gestión de perfiles de usuarios | Esencial |
| RF14 -Herramienta de comparación de precios | ideal |
| RF15 -Gestión de disponibilidad en tiempo real | Esencial |
| RF16-Integración con redes sociales | Esencial |
| RF17 -Soporte multilingüe  | Opcional |
| RF18 -Sistema de seguimiento de vehículos | Opcional |
| RF19 -Galería de imágenes detallada para cada parqueadero | Ideal |
| RF20-Inteligencia artificial para recomendaciones personalizadas | Ideal |
| RF21 administración de cuentas | esencial |

**5.1 Clasificación de requisitos funcionales**

**FUNCIONALIDADES DE LA PLATAFORMA  :**

A continuación se encontrará la especificación de requisitos funcionales donde se realizará una descripción corta de cada uno de ellos según la aplicación a construir.

| **ID  del requerimiento** | **RF1** |
| --- | --- |
| **Nombre del requerimiento** | **Registro de Usuarios** |
| **Descripción** | Permite a los usuarios crear una cuenta en la plataforma proporcionando información básica como nombre, correo electrónico, y contraseña. Es necesario para que los usuarios puedan acceder a las funciones de la plataforma.                                                                                                                                                                                                    |
| **Prioridad** | Alta |

| **ID  del requerimiento** | **RF2** |
| --- | --- |
| **Nombre del requerimiento** | Registro de parqueaderos |
| **Descripción** | Facilita a los propietarios de parqueaderos registrar sus espacios en la plataforma, incluyendo detalles como ubicación, capacidad, tarifas y horarios de disponibilidad. |
| **Prioridad** | *Alta*  |

| **ID  del requerimiento** | **RF3** |
| --- | --- |
| **Nombre del requerimiento** | Reserva de Espacios |
| **Descripción** | Permite a los usuarios reservar espacios de parqueo en los parqueaderos registrados a través de la plataforma, gestionando la disponibilidad y confirmación de las reservas.                                                                   |
| **Prioridad** | Alta |

| **ID  del requerimiento** | **RF4** |
| --- | --- |
| **Nombre del requerimiento** | **Administración de Espacios** |
| **Descripción** | Se encarga de gestionar y controlar la asignación, disponibilidad y estado de los espacios donde los usuarios pueden estacionar sus vehículos.                                                                                                     **RF4.1 -Asignar Espacios a Usuarios:** Esta función se encarga de asignar espacios de estacionamiento a los usuarios que han realizado una reserva o que desean utilizar el servicio.                                                                                                   **RF4.2 -Consultar Disponibilidad de Espacios:** Consiste en mantener actualizado el estado de cada espacio de estacionamiento en el sistema, indicando si está ocupado, reservado o disponible.                                                                                                                                                  |
| **Prioridad** | *Media*  |

| **ID  del requerimiento** | **RF5** |
| --- | --- |
| **Nombre del requerimiento** | **Reportes y Estadísticas**  |
| **Descripción** |   El sistema debe proporcionar reportes y estadísticas detallados sobre el uso y desempeño del parqueadero, incluyendo:

- Número de usuarios registrados y activos
- Número de reservas y pagos realizados
- Ocupación promedio y máxima del parqueadero
- Tiempo promedio de estacionamiento
- Ingresos y egresos diarios, semanales y mensuales
- Tipos de vehículos más comunes
- Horarios de mayor demanda
- Estadísticas de cancelaciones y no-shows
- Evaluaciones y comentarios de los usuarios

Los reportes y estadísticas deben ser visualizados de manera clara y concisa, utilizando gráficos, tablas y diagramas, y deben ser exportables en formatos como PDF, Excel o CSV                                                                              |
| **Prioridad** | *Media*  |

| **ID  del requerimiento** | **RF6** |
| --- | --- |
| **Nombre del requerimiento** | Notificaciones y Alertas |
| **Descripción** |  Envía notificaciones y alertas a los usuarios sobre cambios en sus reservas, disponibilidad de espacios, promociones y otros eventos relevantes.                                                                       |
| **Prioridad** | *Media* |

| **ID  del requerimiento** | **RF7** |
| --- | --- |
| **Nombre del requerimiento** |  Registro y Perfil de Administradores. |
| **Descripción** | Permite crear y gestionar perfiles para administradores de la plataforma, con permisos específicos para supervisar y controlar las operaciones y configuraciones del sistema. |
| **Prioridad** | *Alta*  |

RF08 -Búsqueda Avanzada 

| **ID  del requerimiento** | **RF08** |
| --- | --- |
| **Nombre del requerimiento** |  Búsqueda avanzada |
| **Descripción** | Ofrece opciones avanzadas para que los usuarios encuentren espacios de parqueo según criterios específicos como ubicación, tipo de espacio, precio, y características adicionales. |
| **Prioridad** | *Alta*  |

| **ID  del requerimiento** | **RF09** |
| --- | --- |
| **Nombre del requerimiento** | Sistema de Reservas |
| **Descripción** | El sistema  permitirá a los usuarios agendar los puestos de los parqueaderos cuando sean necesarios dependiendo de en donde planea que darse |
| **Prioridad** | Alta  |

| **ID  del requerimiento** | **RF10** |
| --- | --- |
| **Nombre del requerimiento** | Mapas |
| **Descripción** | El sistema debe proporcionar una visualización gráfica de los parqueaderos, utilizando mapas interactivos que muestren la ubicación de los espacios de parqueo, las entradas y salidas, y otros puntos de interés relevantes. |
| **Prioridad** | media |

| **ID  del requerimiento** | **RF11** |
| --- | --- |
| **Nombre del requerimiento** | Reseñas y valoraciones |
| **Descripción** | Permite a los usuarios dejar comentarios y calificaciones sobre los parqueaderos y servicios, ayudando a otros usuarios a tomar decisiones informadas. |
| **Prioridad** | *Alta*  |
|  |  |

| **ID  del requerimiento** | **RF012** |
| --- | --- |
| **Nombre del requerimiento** | Notificaciones en tiempo real |
| **Descripción** | Proporciona actualizaciones instantáneas sobre el estado de las reservas, cambios en la disponibilidad, y otras acciones relevantes para mejorar la experiencia del usuario. |
| **Prioridad** | *Alta*  |

| **ID  del requerimiento** | **RF13** |
| --- | --- |
| **Nombre del requerimiento** | Gestión de perfiles de usuarios |
| **Descripción** | El sistema debe permitir al usuario modificar o cambiar la información del mismo ,su perfil |
| **Prioridad** | Baja |

| **ID  del requerimiento** | **RF14** |
| --- | --- |
| **Nombre del requerimiento** | Herramienta de comparación de precios |
| **Descripción** | el sistema comparar los distintos precios por hora de los distintos parqueaderos para poder dar la opción mas barata y conveniente |
| **Prioridad** | media |

| **ID  del requerimiento** | **RF15** |
| --- | --- |
| **Nombre del requerimiento** |  Gestión de disponibilidad en tiempo real |
| **Descripción** | Actualiza la disponibilidad de espacios de parqueo en tiempo real para evitar reservas dobles y asegurar la precisión de la información. |
| **Prioridad** | *Alta*  |

| **ID  del requerimiento** | **RF16** |
| --- | --- |
| **Nombre del requerimiento** | Integración con redes sociales |
| **Descripción** | 
Permite a los usuarios registrarse, iniciar sesión y compartir información a través de redes sociales, así como promover el servicio en sus plataformas sociales. |
| **Prioridad** | Media |

| **ID  del requerimiento** | **RF17** |
| --- | --- |
| **Nombre del requerimiento** |  Soporte multilingüe |
| **Descripción** | Ofrece la plataforma en varios idiomas para atender a una audiencia diversa y facilitar el acceso a usuarios de diferentes regiones lingüísticas. |
| **Prioridad** | *Alta*  |

| **ID  del requerimiento** | **RF18** |
| --- | --- |
| **Nombre del requerimiento** | Sistema de seguimiento de vehículos |
| **Descripción** | Permite rastrear la ubicación y el estado de los vehículos estacionados en los parqueaderos, proporcionando información adicional sobre la seguridad y el uso de los espacios. |
| **Prioridad** | *Alta*  |

| **ID  del requerimiento** | **RF19** |
| --- | --- |
| **Nombre del requerimiento** | Galería de imágenes detallada para cada parqueadero |
| **Descripción** | Incluye una galería de fotos para cada parqueadero, mostrando imágenes detalladas de los espacios y sus características, ayudando a los usuarios a tomar decisiones basadas en la apariencia visual. |
| **Prioridad** | *Alta*  |

| **ID  del requerimiento** | **RF20** |
| --- | --- |
| **Nombre del requerimiento** | Inteligencia artificial para recomendaciones personalizadas |
| **Descripción** | Utiliza algoritmos de IA para ofrecer recomendaciones personalizadas de parqueaderos basadas en el historial de reservas y preferencias del usuario. |
| **Prioridad** | *Alta*  |

| **ID  del requerimiento** | RF21 |
| --- | --- |
| **Nombre del requerimiento** | Administración de cuentas |
| **Descripción** | Permite gestionar las cuentas de los usuarios, incluyendo la administración de sus suscripciones, pagos, y detalles de cuenta para asegurar el buen funcionamiento del servicio. |
| **Prioridad** | *Alta*  |

### 5.2 Requisitos no funcionales

| Categoría | **Usabilidad** |
| --- | --- |
| Requerimientos | | RNF01 | Rendimiento : El sistema debe ser capaz de manejar al menos 1000 usuarios simultáneos sin afectar su rendimiento. 
| RNF02 | Confiabilidad : El sistema debe tener una disponibilidad del 99.9% durante el horario de atención al público. 
| RNF03 | Seguridad : El sistema debe cumplir con los estándares de seguridad para proteger la información de los usuarios y del parqueadero. 
| RNF04 | Usabilidad : El tiempo de aprendizaje del sistema por un usuario deberá ser menor a 4 horas. 
| RNF05 | Mantenimiento : El sistema debe ser capaz de ser actualizado y mantenido sin afectar su disponibilidad. 
| RNF06 | Portabilidad : El sistema debe ser compatible con los principales navegadores web y dispositivos móviles. 
| RNF07 | Estándares : El sistema debe cumplir con los estándares de desarrollo web y de seguridad establecidos por la empresa. 
| RNF08 | Fiabilidad : El sistema debe ser capaz de recuperarse de fallos y errores sin afectar su disponibilidad. 
| RNF09 | Escalabilidad : El sistema debe ser capaz de crecer y adaptarse a las necesidades del parqueadero sin afectar su rendimiento. 
| RNF10 | Accesibilidad : El sistema debe ser accesible para usuarios con discapacidades y cumplir con los estándares de accesibilidad web.  |

| Categoría | **Confiabilidad** |
| --- | --- |
| Requerimientos | | RNF11 | Disponibilidad : El sistema debe tener una disponibilidad del 99.9% durante el horario de atención al público. 
| RNF12 | Recuperación de errores : El sistema debe ser capaz de recuperarse de errores y fallos sin afectar su disponibilidad.
| RNF13 | Tiempo de respuesta :El sistema debe tener un tiempo de respuesta menor a 2 segundos para las solicitudes de los usuarios. 
| RNF14 | Tasa de errores : El sistema debe tener una tasa de errores menor al 1% durante el horario de atención al público. 
| RNF15 | Backup y restauración : El sistema debe contar con un mecanismo de backup y restauración de datos para garantizar la integridad de la información. 
| RNF16 | Monitoreo y seguimiento : El sistema debe contar con mecanismos de monitoreo y seguimiento para detectar y resolver problemas de confiabilidad. 
| RNF17 | Pruebas y validación : El sistema debe ser sometido a pruebas y validación regularmente para garantizar su confiabilidad. 
| RNF18 | Documentación y registro :El sistema debe contar con documentación y registro de todos los problemas y soluciones de confiabilidad.  |

| Categoría | **Seguridad** |
| --- | --- |
| Requerimientos | | RNF19 | Autenticación : El sistema debe contar con un mecanismo de autenticación seguro para garantizar que solo los usuarios autorizados accedan al sistema. 
| RNF20 | Autorización : El sistema debe contar con un mecanismo de autorización para controlar el acceso a los recursos y funcionalidades del sistema.
| RNF21 | Encriptación : El sistema debe encriptar los datos sensibles para garantizar su confidencialidad y integridad. 
| RNF22  | Protección contra ataques : El sistema debe contar con mecanismos de protección contra ataques y vulnerabilidades, como firewalls y sistemas de detección de intrusos. 
| RNF23  | Gestión de contraseñas : El sistema debe contar con un mecanismo de gestión de contraseñas seguro para garantizar que las contraseñas sean seguras y no se puedan recuperar fácilmente. 
| RNF24  | Registro y auditoría : El sistema debe contar con un mecanismo de registro y auditoría para detectar y registrar cualquier actividad sospechosa o no autorizada. 
| RNF25  | Cumplimiento con normas : El sistema debe cumplir con las normas y regulaciones de seguridad relevantes, como la GDPR y la PCI-DSS. 
| RNF26  | Seguridad de la red : El sistema debe contar con mecanismos de seguridad de la red para proteger la comunicación entre el cliente y el servidor. 
| RNF27 | Seguridad del servidor : El sistema debe contar con mecanismos de seguridad del servidor para proteger el servidor y los datos almacenados en él.  |

| Categoría | **Eficiencia y Rendimiento** |
| --- | --- |
| Requerimientos | | RNF28 | Tiempo de respuesta : El sistema debe tener un tiempo de respuesta menor a 2 segundos para las solicitudes de los usuarios. 
| RNF29  | Uso de recursos : El sistema debe ser eficiente en el uso de recursos del servidor y la red. 
| RNF30 | Escalabilidad : El sistema debe ser capaz de crecer y adaptarse a las necesidades del parqueadero sin afectar su rendimiento. 
| RNF31 | Rendimiento bajo carga : El sistema debe ser capaz de manejar un gran número de usuarios simultáneos sin afectar su rendimiento.
| RNF32 | Optimización de consultas : El sistema debe optimizar las consultas a la base de datos para reducir el tiempo de respuesta. 
| RNF33 | Uso de caché :El sistema debe utilizar caché para reducir el tiempo de respuesta y mejorar el rendimiento. 
| RNF34 | Minimización de llamadas a la base de datos : El sistema debe minimizar el número de llamadas a la base de datos para reducir el tiempo de respuesta. 
| RNF35 | Uso de tecnologías de rendimiento :El sistema debe utilizar tecnologías de rendimiento como la compresión de datos y la optimización de imágenes.  |

| Categoría | **Portabilidad** |
| --- | --- |
| Requerimientos | | RNF36 | Compatibilidad con navegadores : El sistema debe ser compatible con los principales navegadores web (Google Chrome, Mozilla Firefox, Safari, Microsoft Edge). 
| RNF37 | Compatibilidad con dispositivos móviles : El sistema debe ser compatible con los principales dispositivos móviles (smartphones y tablets) y sistemas operativos (Android, iOS). 
| RNF38 | Independencia de plataforma : El sistema debe ser independiente de la plataforma y el sistema operativo del servidor. 
| RNF39 | Uso de estándares web : El sistema debe utilizar estándares web para garantizar la compatibilidad y la portabilidad. 
| RNF40 | Modularidad : El sistema debe ser modular para facilitar la actualización y el mantenimiento de las diferentes partes del sistema. 
| RNF6 | Reutilización de código : El sistema debe permitir la reutilización de código para reducir el tiempo de desarrollo y mejorar la eficiencia. 
| RNF41 | Documentación y comentarios : El sistema debe tener documentación y comentarios claros para facilitar la comprensión y el mantenimiento del código. 
| RNF42 | Pruebas de portabilidad  El sistema debe ser sometido a pruebas de portabilidad para garantizar su compatibilidad y funcionamiento en diferentes entornos.  |

| Categoría | **Mantenibilidad** |
| --- | --- |
| Requerimientos | | RNF43 | Facilidad de actualización : El sistema debe ser fácil de actualizar y mantener para garantizar su funcionalidad y seguridad. 
| RNF44 | Documentación y comentarios : El sistema debe tener documentación y comentarios claros para facilitar la comprensión y el mantenimiento del código. 
| RNF45 | Modularidad :El sistema debe ser modular para facilitar la actualización y el mantenimiento de las diferentes partes del sistema. 
| RNF46 | Reutilización de código : El sistema debe permitir la reutilización de código para reducir el tiempo de desarrollo y mejorar la eficiencia. 
| RNF47 | Herramientas de desarrollo : El sistema debe ser compatible con herramientas de desarrollo estándar para facilitar el mantenimiento y la actualización. 
| RNF48 | Pruebas y validación: El sistema debe ser sometido a pruebas y validación regularmente para garantizar su funcionalidad y seguridad. 
| RNF49 | Soporte técnico : El sistema debe tener soporte técnico disponible para resolver problemas y dudas de los usuarios. 
| RNF50 | Mantenimiento preventivo :El sistema debe tener un plan de mantenimiento preventivo para evitar problemas y garantizar su funcionalidad. 
| RNF51 | Registro de cambios : El sistema debe tener un registro de cambios para mantener un historial de actualizaciones y mejoras.  |

| Categoría | **Soportabilidad y operatividad** |
| --- | --- |
| Requerimientos | | RNF52 | Integración con otros sistemas : El sistema debe ser capaz de integrarse con otros sistemas y aplicaciones utilizadas por el parqueadero. 
| RNF53 | Compatibilidad con diferentes entornos : El sistema debe ser capaz de funcionar en diferentes entornos y configuraciones. 
| RNF54 | Facilidad de operación : El sistema debe ser fácil de operar y utilizar para los usuarios. 
| RNF55 | Monitoreo y seguimiento : El sistema debe tener mecanismos de monitoreo y seguimiento para detectar y resolver problemas. 
| RNF56 | Alertas y notificaciones : El sistema debe tener un sistema de alertas y notificaciones para informar a los usuarios de problemas o eventos importantes. 
| RNF57 | Reportes y análisis : El sistema debe tener la capacidad de generar reportes y análisis para ayudar a los usuarios a tomar decisiones informadas. 
| RNF58 | Seguridad operativa : El sistema debe tener mecanismos de seguridad operativa para proteger la integridad y confidencialidad de los datos. 
| RNF59 | Cumplimiento con regulaciones : El sistema debe cumplir con las regulaciones y normas relevantes para el parqueadero.  |

**

## 6**. Restricciones del software**

Restricciones de hardware

- Limitaciones en la capacidad de procesamiento y memoria del servidor.
- Limitaciones en la velocidad y capacidad de la red.
- Limitaciones en la compatibilidad con dispositivos móviles y navegadores web.

Restricciones de software

- Limitaciones en la selección de lenguajes de programación y framework para el desarrollo de la IA.
- Limitaciones en la integración con otras tecnologías y sistemas utilizados en el parqueadero.
- Limitaciones en la escalabilidad y flexibilidad del sistema para adaptarse a las necesidades del parqueadero.

Restricciones de datos

- Limitaciones en la calidad y cantidad de datos disponibles para entrenar y probar la IA.
- Limitaciones en la privacidad y seguridad de los datos de los usuarios y del parqueadero.
- Limitaciones en la integración con fuentes de datos externas y APIs.

Restricciones de tiempo y presupuesto

- Limitaciones en el tiempo y recursos disponibles para el desarrollo y implementación de la IA.
- Limitaciones en el presupuesto para la adquisición de hardware y software especializado.
- Limitaciones en la capacidad para contratar y capacitar a personal especializado en IA.

Restricciones de seguridad y privacidad

- Limitaciones en la protección de la información de los usuarios y del parqueadero.
- Limitaciones en la prevención de ataques y vulnerabilidades en el sistema.
- Limitaciones en la cumplimentación de regulaciones y normas de seguridad y privacidad.

Restricciones de usabilidad y accesibilidad

- Limitaciones en la facilidad de uso y accesibilidad del sistema para los usuarios.
- Limitaciones en la compatibilidad con dispositivos y navegadores web.
- Limitaciones en la capacidad para proporcionar una experiencia de usuario intuitiva y eficiente.

## 7**. Anexos**

Anexo 1: Documentación de Requisitos

- Requisitos funcionales y no funcionales del sistema
- Diagramas de flujo y casos de uso
- Especificaciones técnicas y de diseño

Anexo 2: Pruebas y Resultados

- Informes de pruebas de usabilidad y accesibilidad
- Resultados de pruebas de rendimiento y escalabilidad
- Informes de pruebas de seguridad y vulnerabilidades

Anexo 3: Entrevistas y Encuestas

- Transcripciones de entrevistas con usuarios y expertos
- Resultados de encuestas de satisfacción y opinión
- Análisis de datos y conclusiones

Anexo 4: Documentación Técnica

- Código fuente y documentación técnica del sistema
- Especificaciones de hardware y software
- Información de configuración y mantenimiento

Anexo 5: Plan de Implementación

- Cronograma de implementación y despliegue
- Plan de capacitación y soporte para usuarios
- Estrategia de marketing y promoción

Anexo 6: Presupuesto y Costos

- Detalle de costos y presupuesto para el desarrollo y implementación
- Estimaciones de costos de mantenimiento y soporte
- Análisis de retorno de inversión (ROI)

Anexo 7: Referencias y Bibliografía

- Fuentes de información y referencias utilizadas en el proceso
- Bibliografía y recursos adicionales para futuras consultas

##