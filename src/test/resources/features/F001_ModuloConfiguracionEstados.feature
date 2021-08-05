Feature: Realizar CRUD en el modulo de Configuracion Estados
  Como usuario final necesito realizar un CRUD en el modulo de Configuracion Estados

#  @SmokeTest
  Scenario: Crear nuevo registro de tipo Sistema de Despacho
    Given   El usuario ingresa al modulo de Configuracion Estados
    When    Da click al boton Nuevo y completa los campos obligatorios
    And     Da click al boton Guardar confirmando el registro
    Then    Se crea correctamente el nuevo registro

#  @SmokeTest
  Scenario: Editar registro de tipo Sistema de Despacho
    Given   El usuario accede al modulo de Configuracion Estados
    When    Da click al boton de Editar y cambia los campos
    And     Da click al boton Guardar confirmando la edicion
    Then    Se edita correctamente el nuevo registro

  @SmokeTest
  Scenario: Eliminar registro de tipo Sistema de Despacho
    Given   El usuario ingresa al monitor de Configuracion Estados
    When    Realiza la busqueda de un registro
    And     Da click al boton Eliminar confirmando la eliminacion
    Then    Se elimina correctamente el nuevo registro