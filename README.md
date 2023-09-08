
# utmaning1_carolina

## Vad gör programmet?

Programmet omvandlar Celsius till Fahrenheit och även Celsius till Kelvin. Informationen skrivs ut när man kör programmet.

## Vilka datatyper används och hur kunde andra datatyper ha påverkat programmet?

Jag börjar med att deklarera och initiera variabeln som ska innehålla värdet för celsius (°C).
Det funkar också om jag hade använt byte eller short men jag bestämde mig för Integer bara för att det känns mer familiärt.

För värdena för Fahrenheit (°F) och Kelvin bestämde jag mig för att testa på att använda float. 
Double hade också fungerat för decimaltal men eftersom float "räcker" i en liten beräkning så körde jag på den.

Upptäckte också av en slump att det går att enkelt konvertera decimalvärdet på celsius till ett heltal (int).
I så fall hade Kelvin visats utan decimaltal avrundat nedåt som det brukar visas på glödlampor. :bulb:
Jag behöll det som kommentar i koden.

Slutligen konkatinerar jag värdena för Fahrenheit och Kelvin så att mina variabler presenteras på ett läsbart sätt för användaren.
