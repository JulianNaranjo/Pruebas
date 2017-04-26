Meta:

Narrative:
Como usuario
Quiero saber la cantidad de partidos ganados
para obtener la suma de estos

Scenario: partidos ganados
Given estoy en la pagina con la tabla de la premier leagu
When sumo la cantidad de partidos ganados
Then valido la cantidad de partidos ganados
|cantwin|
|84     |