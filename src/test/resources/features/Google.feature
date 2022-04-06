#language: es
Característica: Test Google Search
  @TestGoogleSearch

  Esquema del escenario: Como usuario quiero poder buscar en google
    Dado Cuando abro la pagina de google
    Cuando ingreso la <palabra>
    Entonces puedo ver el resultado de la busqueda
    Ejemplos:
      | palabra |
      | Placa de video 1660ti |
      | Placa de video 1080 MSI |
      | Placa de video 2060ti |


