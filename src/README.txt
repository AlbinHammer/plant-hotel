Projekt: Växthotellet Greenest
VARJE STUDENT LÄMNAR IN SIN EGEN REPO-LÄNK
På växthotellet Greenest kan ägare checka in sina krukväxter för omvårdnad medan de är på semester.
Växterna solar under UV-lampor och får exakt den mängd näringsvätska som just deras art behöver.
Problemet är att formlerna är krångliga.
Hotellets ägare har svårt att minnas hur mycket vätska varje
växt ska ha och ber er om ett program som håller reda på det.

Det här ska programmet kunna göra
Fråga användaren vilken växt som ska få vätska
Räkna ut hur mycket vätska just den växten behöver
Visa mängden och vilken sorts vätska som ska serveras
Hantera felaktig inmatning utan att krascha

Växterna på hotellet

-Kaktusen Igge, 20 cm hög
-Palmen Laura, 5 meter hög
-Köttätande växten Meatloaf, 0,7 meter hög
-Palmen Olof, 1 meter hög

Så räknas vätskebehovet ut
1. Palmer
Vätska: kranvatten
Formel: 0,5 liter per dag gånger längden i meter
Exempel: en palm som är 3 meter hög behöver 0,5 × 3 = 1,5 liter per dag

2. Köttätande växter
Vätska: proteindryck
Formel: en basnivå på 0,1 liter per dag plus 0,2 liter gånger längden i meter
Exempel: en köttätande växt som är 50 cm hög behöver 0,1 + (0,2 × 0,5) = 0,2 liter per dag

3. Kaktusar
Vätska: mineralvatten
Formel: 2 cl per dag
Storleken spelar ingen roll för en kaktus

Så ska programmet fungera för användaren
En meddelanderuta visas med texten ”Vilken växt ska få vätska?” och en tom rad bredvid
Ägaren skriver in växtens namn på den tomma raden
Programmet visar en ny ruta som talar om:
hur mycket vätska växten ska ha
vilken sorts vätska det är (kranvatten, mineralvatten eller proteindryck)
Krav för Godkänt (G)
För att få betyget Godkänt (G) ska uppgiften uppfylla samtliga krav nedan.

1. Funktionalitet
Programmet ska fungera enligt beskrivningen ovan
Samtliga fyra växter ska gå att mata in och ge korrekt resultat
Rätt vätsketyp ska visas för rätt växt

2. Objektorientering
Lösningen ska innehålla minst ett arv, implementerat på ett relevant sätt för datat
Lösningen ska innehålla minst ett interface, implementerat på ett relevant sätt för datat
Lösningen ska använda någon form av polymorfism
Skriv en kommentar i koden på de ställen där arv, interface och polymorfism förekommer,
så att det tydligt går att se att du behärskar dem

3. Felhantering
Programmet får inte krascha när användaren matar in något oväntat
Testa till exempel:
ett växtnamn som inte finns på hotellet
tom inmatning
siffror eller tecken i stället för ett namn

4. Kodkvalitet
Koden ska vara enkelt läsbar och prydligt skriven
Namn på klasser, metoder och variabler ska beskriva vad de gör

Krav för Väl Godkänt (VG)
För att få betyget Väl Godkänt (VG) ska du först uppfylla alla krav för G och dessutom alla krav nedan.

1. Enums
Du ska visa att du behärskar enums (uppräkningstyper)
Enums ska användas där det är relevant för uppgiften, till exempel för vätsketyp

2. Inkapsling
Du ska visa att du behärskar inkapsling
Skriv en kommentar i koden där du har använt inkapsling,
så att det tydligt går att se att du har förstått vad det är

3. Inga hårdkodade värden
Inga hårdkodade strängar eller siffror får förekomma i koden
Alla strängar och siffror ska lagras i variabler eller konstanter
Tekniska krav

Dessa krav gäller hela uppgiften, oavsett om du siktar på G eller VG.

1. Best practices
Koden ska genomgående följa de best practices vi har gått igenom på lektionerna
Håll klasserna små och låt varje klass ha ett tydligt ansvar

2. Egen kod
Ingen AI-genererad kod får förekomma
Du ska kunna motivera varje kodrad som finns i ditt program

3. Uppgiften görs individuellt
Denna uppgift görs enskilt
Du får diskutera lösningar med andra, men koden ska vara din egen
Redovisning
Redovisningen sker muntligt och får ta max 5-7 minuter
Du ska visa både att programmet fungerar och att du kan din kod
Gå igenom din demonstration hemma innan, så att du håller tiden

Kontrollera innan redovisningen att:
-programmet verkligen fungerar
-samtliga växter går att mata in och ger korrekt resultat
-felaktiga värden ger ett vettigt svar i stället för en krasch
-Tänk igenom vad du ska säga och hur du visar upp koden

Inlämning
-Koden ska ligga i ett publikt repo på GitHub
-Lämna in länken till ditt repo i inlämningskatalogen på Portalen
Detta gäller både för G och för VG

Tips på byggordning

Steg 1 – Skapa projektet
Skapa ett nytt Java-projekt i IntelliJ
Kontrollera att projektet startar utan fel
Skriv ut något enkelt i main för att se att allt fungerar

Steg 2 – Planera klasserna
Fundera på vad alla växter har gemensamt och vad som skiljer dem åt
Bestäm vad som hör hemma i en gemensam basklass eller ett interface
Rita gärna upp en enkel skiss innan du börjar koda

Steg 3 – Bygg växtklasserna
Skapa en gemensam bas för växterna
Skapa klasser för palm, köttätande växt och kaktus
Ge varje växt namn och längd

Steg 4 – Lägg in uträkningen
Låt varje växttyp räkna ut sitt eget vätskebehov
Här är det polymorfismen kommer in: samma metodanrop ska ge olika resultat beroende på växttyp
Testa uträkningarna med exemplen i uppgiften innan du går vidare

Steg 5 – Lägg in växterna på hotellet
Skapa de fyra växterna som finns på hotellet
Lägg dem i en lämplig samling så att du kan söka bland dem

Steg 6 – Bygg gränssnittet
Lägg till meddelanderutan som frågar vilken växt som ska få vätska
Sök upp växten utifrån namnet användaren skriver in
Visa svaret i en ny ruta med mängd och vätsketyp

Steg 7 – Lägg till felhantering
Hantera namn som inte finns bland växterna
Hantera tom inmatning
Kontrollera att programmet står emot allt du kan hitta på att mata in

Steg 8 – Städa koden
Lägg till kommentarerna som visar arv, interface och polymorfism
Gå igenom namngivningen en sista gång
Kontrollera att koden är läsbar för någon annan än dig själv

Steg 9 – Lägg till VG-delarna
Om du siktar på VG ska du också:
införa enums där det är relevant
gå igenom inkapslingen och kommentera var du använt den
flytta ut alla hårdkodade strängar och siffror till variabler eller konstanter
