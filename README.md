Ziel dieser Übung ist es eine eigene Stringklasse mit den folgenden Funktionen zu implementieren.

* int length()
  * Gibt die Länge unseres Objekts zurück
* void add(String text)
  * Fügt text hinten an
* void remove(int length)
  * Kürzt die Länge unseres Elements um die mitgegebene Länge
* void trimFront()
  * Entfernt alle vorgestellten Leerzeichen
* void trimBack(){
  * Entfernt alle nachgestellten Leerzeichen
* (optional) void trimMiddle()
  * Entfernt alle Leerzeichen die nicht am Beginn oder Ende sind
* String toString()
  * Wandelt unser Objekt in einen normalen String um

Im Hintergrund soll ein `Character[]` verwendet werden anstatt eines Strings. 
Außer in der `toString()` Funktion darf kein normaler String verwendet werden. 
Statt einem `Character[]` kann wahlweise auf eine `List<Character>` verwendet werden.

Versuche Test-driven zu Entwickeln: 
1. Schreib zu erste die Signatur einer Methode
2. Überleg dir einen Testfall für deine Methode
3. Implementiere den Testfall, führe in aus (er sollte jetzt rot sein) 
4. Implmentiere die Logik bis alle Tests grün sind 
5. Zurück zu Schritt 1 bzw 2 
