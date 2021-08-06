Feature: Realizar CRUD en el modulo de Configuracion SubEstados
  Como usuario final necesito realizar un CRUD en el modulo de Configuracion SubEstados

  @SmokeTest
  Scenario: Crear nuevo registro de tipo Sistema de Despacho en el monitor de SubEstados
    Given   El usuario ingresa al modulo de Configuracion SubEstados
    When    Da click al boton Nuevo y completar el formulario
    And     Da click al boton Guardar y confirmar el registro
    Then    Se crea correctamente el nuevo registro de subestado

#  @SmokeTest
  Scenario: Editar registro de tipo Sistema de Despacho en el monitor de SubEstados
    Given   El usuario accede al modulo de Configuracion SubEstados
    When    Da click al boton de Editar y editar los campos
    And     Da click al boton Guardar y confirmar la edicion
    Then    Se edita correctamente el nuevo registro de subestado

#  @SmokeTest
  Scenario: Eliminar registro de tipo Sistema de Despacho
    Given   El usuario ingresa al monitor de Configuracion SubEstados
    When    Realiza la busqueda de un registro de subestado
    And     Da click al boton Eliminar y confirmar la eliminacion
    Then    Se elimina correctamente el nuevo registro de subestado