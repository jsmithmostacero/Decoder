# Decoder
Implementación de un decoder

¿Como funciona el Integrado 74LS48?
: - El integrado 74LS48 posee 4 entradas binarias y salidas a codigo 7 segmentos [BCD].
  - Esto lo logra gracias a una tabla de verdad para 7 circuitos logicos.

#

|D C B A |QA QB QC QD QE QF QG|
|--------|--------------------|
|Numero en Binario `Base 2`|Codigo a `7 segmentos`, que en el display se logra observar un numero en `Base 10`|

#

Resumen
: Mediante los `4 LOGICSTATE` enviamos señales logicas al decodificador `74LS48`, el cual nos devuelve una salida de 7 segmentos; estos mismos se conectan con el 7SEG-COM-CAT-GRN, que dependiendo del estado lógico; para un valor 1 el segmento se activara. Estos segmentos estan `ordenados alfabeticamente en sentido horario`.

Input
: Contiene las entradas `D C B A` considerando los pesos binarios.

|Variable|Peso|
|--------|----|
|   A    |  1 |
|   B    |  2 |
|   C    |  4 |
|   D    |  8 |


Ouput
: Contiene las salidas `QA QB QC QD QE QF QG`

|Input| Ouput |
|-----|-------|
|0000 |1111110|
