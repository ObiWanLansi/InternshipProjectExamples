# InternshipProjectExamples

Hier sind lauter kleine Projekte für Praktikanten in dem und aus dem Bereich Softwareentwicklung. Die Projekte sollten je nach Können des Praktikanten und dem Umfang der Implementierung innerhalb (hoffentlich) einer Praktikumswoche umgesetzt werden können.

---

## [Kalendar](./Calendar)

Es soll eine kleine Kalendarausgabe implementiert werden. Dies kann eine reine Konsolenbasierte Anwendung sein, ist aber auch mit einer kleinen GUI möglich.

https://de.wikipedia.org/wiki/Cal_(Unix)

---

## [Cäsar Verschlüsselung](./CaesarCipher)

Es soll eine kleine Cäsar Verschlüsselung implementiert werden. Dies kann eine reine Konsolenbasierte Anwendung sein, ist aber auch mit einer kleinen GUI möglich.

Als mögliche Erweiterung kann man die Verschlüsselung nicht nur für die 26 (Groß-) Buchstaben umsetzten, sondern für die komplette [ASCII Tabelle](https://de.wikipedia.org/wiki/American_Standard_Code_for_Information_Interchange#ASCII-Tabelle).

https://de.wikipedia.org/wiki/Caesar-Verschl%C3%BCsselung

---

## [FileType](./FileType)

Es soll der mögliche Dateityp einer Datei anhand der ersten N-Bytes und nicht anhand der
Dateierweiterung bestimmt werden.

https://de.wikipedia.org/wiki/File

---

## [Geldrückgeber](./Geldrueckgeber)

Es soll ein kleiner Geldrückgeber realisert werden der als ein Input einen Betrag erhält und als Ausgabe
die Auflistung aller benötigten Scheine, Münze und deren Anzahl ausgeben soll.

---

## [Tic Tac Toe](./TicTacToe)

Klassisches Brettspiel welches dann doch eher Oberfächenanteile benötigt.

https://de.wikipedia.org/wiki/Tic-Tac-Toe

---

## [Vier Gewinnt](./ConnectFour)

Klassisches Kinderspiel welches dann doch eher Oberfächenanteile benötigt.

https://de.wikipedia.org/wiki/Vier_gewinnt

---

## [Rucksackproblem](./Rucksackproblem)

Das Rucksackproblem ist ein Optimierungsproblem der Kombinatorik.

https://de.wikipedia.org/wiki/Rucksackproblem

---

**Anmerkungen :**

- Bei alle Spielen sollen jeweils nur zwei Benutzer gegeneinander Spielen, es wird kein Computer oder KI als Gegner benötigt.
- Als Erweiterung bei den Spielen kann natürlich eine Bestenliste eingebaut werden, die Daten dazu
können in einer Datei (csv,json,xml,sqlite) gespeichert werden.
- Es sollte zu allen Projekten eine kleine README.md erzeugt werden, mit Hinweisen zur Bedienung, bekannten Issues, mit welcher Programmiersprache / IDE das Projekt bearbeitet / erstellt wurde.
- Ein kleines UML Diagramm ist nicht verboten.
- Alle Beispiele sind **"Basic"** und zeigen nur **einen** möglichen Weg zur Umsetzung und Realisierung.
- Schöner und besser geht bestimmt immer, aber es muss auch einfach bleiben damit es auch Praktikanten verstehen können.
- Der Beispielcode ist nur auf das nötigste dokumentiert, der Praktikant sollte es natürlich besser machen.

---

**Übersicht Sprachen / Projekte:**

|Sprache       |Cäsar Verschlüsselung|Kalendar|FileType|Vier gewinnt|Geldrückgeber|Tic Tac Toe|Rucksackproblem|
|--------------|:-------------------:|:------:|:------:|:----------:|:-----------:|:---------:|:-------------:|
|Python        |&#10005;             |&#10005;|&#9925; |&#10005;    |&#10004;     |&#10005;   |&#9737;        |
|Ruby          |&#10004;             |&#10005;|&#10005;|&#10005;    |&#10005;     |&#10005;   |&#9737;        |
|.net Core     |&#10005;             |&#10004;|&#10005;|&#10005;    |&#10005;     |&#10005;   |&#9737;        |
|.net WPF      |&#10005;             |&#10004;|&#10005;|&#10005;    |&#10005;     |&#10004;   |&#9737;        |
|Java Console  |&#10004;             |&#10005;|&#10005;|&#10005;    |&#10004;     |&#10005;   |&#9737;        |
|Java SWING    |&#10005;             |&#10005;|&#10005;|&#9925;     |&#10005;     |&#10004;   |&#9737;        |
|C++ Console   |&#10005;             |&#10005;|&#8986; |&#10005;    |&#10005;     |&#10005;   |&#9737;        |
|ANSI C Console|&#9737;              |&#9737; |&#9737; |&#9737;     |&#9737;      |&#9737;    |&#9737;        |
|Web (HTML5/JS)|&#9737;              |&#9737; |&#9737; |&#9737;     |&#9737;      |&#9737;    |&#9737;        |
|R             |&#9737;              |&#9737; |&#9737; |&#9737;     |&#9737;      |&#9737;    |&#9737;        |


**Legende:**

|Zeichen |Beschreibung          |
|:------:|----------------------|
|&#10004;|Ist fertig umgesetzt  |
|&#8986; |Umsetzung hat begonnen|
|&#9925; |Wird (noch) umgesetzt |
|&#10005;|Wird nicht umgesetzt  |
|&#9737; |Drüber nachdenken     |

---

## Backlog

- Geldrückgeber in Octave oder R
- Kalendar in C++/QT
