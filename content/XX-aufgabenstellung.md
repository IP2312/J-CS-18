# Aufgabenstellung - Arbeit mit Dateien

## Aufgabe: Arbeiten mit Files

Erstelle ein Programm, das die CSV-Files `personenManagements.csv`, `personen.csv` und `addresses.csv` ausliest.
In dieser Aufgabe kannst du vermutlich zumindest zum Teil das Ergebnis der Aufgabe vom Kompetenzcheck 11 wiederverwenden.
Erstelle hierfür die Klassen Person und Address, welche die Eigenschaften aus den Dateien haben, wobei die Klasse Person nicht die AddressId, sondern die Adresse beinhalten soll. 
Beachte, dass in den Daten sowohl Strings als auch Zahlen vorhanden sind. Überlege dir 2 Wege, wie die Daten aus dem File heraus extrahiert werden. 
Denke hier an die Vorteile der einzelnen Klassen und wähle die aus deiner Sicht richtige Variante.

Dein Programm soll außerdem eine Person erstellen oder löschen können und das Ergebnis in die Datei speichern können. 
Wähle eine geeignete Writer-Klasse, um die Daten in die Datei hineinzuschreiben.

Um die Dateien auszulesen, sollen die Methoden folgendermaßen heißen:

```Java
// Java
public class PersonManagementReader{
    public int create(PersonManagement personManagement);    //liefert die Id des neu kreierten PersonManagements
    public PersonManagement get(int personManagementId);     //liefert das gewünschte PersonManagement oder eine Exception
    public int update(PersonManagement personManagement);    //liefert die Anzahl der aktualisierten Zeilen
    public PersonManagement delete(int personManagementId);  //liefert das gelöschte Objekt
}
public class PersonReader{
    public int create(Person person);    //liefert die Id der neu kreierten Person
    public Person get(int personId);     //liefert die gewünschte Person oder eine Exception
    public int update(Person person);    //liefert die Anzahl der aktualisierten Zeilen
    public Person delete(int personId);  //liefert das gelöschte Objekt
}
public class AddressReader{
    public int create(Address address);    //liefert die Id der neu kreierten Adresse
    public Address get(int addressId);     //liefert die gewünschte Adresse oder eine Exception
    public int update(Address address);    //liefert die Anzahl der aktualisierten Zeilen
    public Address delete(int addressId);  //liefert das gelöschte Objekt
}
```

## Abnahmekriterien

- Der:die Teilnehmer:in kann aufzählen, welche Klassen vorgestellt wurden, die geeignet sind, um Dateien auszulesen bzw. zu schreiben sind.
- Der:die Teilnehmer:in hat sinnvolle Klassen für das Auslesen bzw. Schreiben der Datei angewendet und kann gut begründen, warum diese sinnvoll sind.
- Das Programm erfüllt die oben angeführten Anforderungen.
- Das Programm erfüllt die Clean-Code-Richtlinien.
- Das Programm trennt die Klassen in User Interaction/Business Logic/Persistierung richtig.
- Die Variablen-/Methoden-/Klassennamen sind aussagekräftig.
- Das Programm ist in GITHub eingecheckt.