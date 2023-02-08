# Activitat de desenvolupament d'aplicació:

Aquesta activitat es realitzarà per grups, es sortejaran els grups a classe.

## Enunciat del procés:

Heu estat contractats per realitzar una aplicació, l'objectiu de l'activitat és fer tot el cicle de desenvolupament de la mateixa des de rebre les indicacions del client, fins desenvolupar-la, testejar-la i possar-la en producció.

Per aquest motiu simulareu un grup de treball tipus Scrum on l'Scrum Master us indicarà qué ha de fer el projecte i el desenvolupareu i testejareu.

**Tot el procés l'haureu de presentar, ja sigui de forma oral amb suport de diapositives o en forma de vídeo que es projectarà a classe.**

## Organització del treball:

### Reunió inicial:

1. Aquí fareu la reunió on parlareu de la feina a realitzar i la dividireu en tasques independents.

2. Puntuareu cada tasca amb un mètode per dividir de manera uniforme la feina entre els companys/es, podeu fer servir [algun d'aquests mètodes](https://www2.deloitte.com/es/es/pages/technology/articles/tecnicas-de-estimacion-en-scrum.html).

### Codificació:

3. Utilitzeu Kanban per conèixer en quin estat es troben les tasques a realitzar i a qui s'han assignat. Podeu fer servir [KanbanFlow](https://kanbanflow.com/).

4. Treballareu en el mateix programa, podeu treballar de forma independent i anar reunint el codi a un repositori però no es obligatori.

### Proves de caixa blanca:

5. Quan tingueu el codi calculareu la Complexitat Ciclomàtica de cada part del codi.

6. Després escriureu les proves de caixa blanca, una per cada camí d'execució. 

7. Creareu les proves amb el software JUnit i comprovareu que donen el resultat esperat.

8. Investigareu software diferent a JUnit per testejar software.  A la web d'IntelliJ [podeu trobar opcions](https://www.jetbrains.com/help/idea/tests-in-ide.html).

### Proves de caixa negra:

9. Amb el codi fet calculeu, si escau, les taules de particions equivalents i les de valors límits.

10. Creareu les proves de caixa negra corresponents.

### Proves d'acceptació:

11. Haureu de demostrar el funcionament del programa als membres d'un altre equip que faran de clients i comprovaran que el programa funciona correctament i fa el que es demana.

## Enunciat del programa:

Valor dels punts (1 a 8): 1,25 punts cada apartat.
Valor dels punts (9 i 10): 1 punt cada apartat.

Una ONG que s'encarrega de gestionar un banc d'aliments ens ha contactat per fer un programa que automatitzi algunes de les tasques del mateix.

El banc d'aliments funciona com un magatzem que rep donacions i després reparteix els mateixos a les associacions que realitzaran l'entrega final a la gent que ho necessiti.

- El programa deixa donar d'alta tipus d'aliments bàsics (com farina, arrós, sucre, galetes...), també es podrà modificar el nom dels aliments, eliminar el tipus d'aliment i mostrar els tipus d'aliments donats d'alta.

- El programa deixarà donar d'alta associacions que reparteixin el menjar als destinataris finals. Es guardarà el nom de l'associació, el telèfon i la distància al banc d'aliments.

- El banc d'aliments accepta donacions d'aliments, el programa deixa entrar una donació indicant els kilos de cada aliment que s'han donat.

- Les associacions poden demanar enviament d'aliments, amb un límit de 300kg. L'enviament es programa per al dia següent del que s'ha fet la comanda. No es pot fer més d'un repartiment al dia, així que si això passa es programa per al següent dia lliure. En qualsevol cas s'avisarà a l'usuari/a del dia en que es farà el repartiment dels aliments.

- Cada vegada que es faci un repartiment hi ha una despesa equivalent a 0,19€ per kilòmetre recorregut (0,22€ si el pes de la comanda és superior a 200kg) per la furgoneta que reparteix, la despesa acumulada i desglosada per data s'ha de poder consultar.

- Les associacions quan fan el repartiment ho indiquen al banc d'aliments mitjançant el programa, així que s'ha de guardar l'stock de productes de cada associació en cada moment.

- La interfície del programa serà per terminal de text, per consola. 
