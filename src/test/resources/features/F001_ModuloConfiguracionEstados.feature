Feature: Realizar CRUD en el modulo de Configuracion Estados
  Como usuario final necesito realizar un CRUD en el modulo de Configuracion Estados

  @SmokeTest
  Scenario: Crear nuevo registro de tipo Sistema de Despacho
    Given   El usuario ingresa al modulo de Configuracion Estados
    When    Da click al boton Nuevo y completa los campos obligagores
    And     Da click al boton Guardar confirmando el registro
    Then    Se crea correctamente el nuevo registro