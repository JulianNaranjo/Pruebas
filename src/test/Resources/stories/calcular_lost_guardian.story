Meta:

Narrative:
Como usario de the guardian
quiero saber la suma de partidos perdidos de los 5 primeros equipo de la tabla
puedo saber los promedios de perdida

Scenario: Suma de partidos perdidos te los 5 primeros equipos de la premier league
Given estoy en la pagina con la tabla de la premier league
When sumo los partidos perdidos de cada equipo
Then la suma debe resultar igual al dato en la tabla
|lost|
|20  |