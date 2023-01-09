
public class Konfigurationstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* a) */
		byte cent;
		cent = 70;
		cent = 80;
		
		/* b) */
		float maximum;
		maximum = 95.50F;
		
		/* Ü2 */
		boolean wert = true;
		short zahl1 = -1000;
		float zahl2 = 1.255F;
		char zeichen = '#';
		byte zahl3 = 8;
		long zahl4 = 2147483648L;
		
		/* Ü3 */
		String satz = "Ich bin Johann.";
		final short CHECK_NR = 8765;
		
		/* Ü4
		 * Man spart Speicherplatz
		 * es wird festgelegt, welche operationen man mit welchen datentypen machen kann
		 * man vermeidet Dopplungen oder reduziert verwechslungen/falscheingaben/etc.
		 */
		
		/* A1.5 a) */
		
		
		double ergebnis1 = 0.0;
		
		ergebnis1 = 4.0 + (8.0 * 9.0) - 1.0;
				
		System.out.println(ergebnis1);
		
		/* b) */
		
		int zaehler;
		zaehler = 1;
		zaehler++;
		
		System.out.println(zaehler);
		
		/* c) */
		
		int z22 = 22;
		int z6 = 6;
		
		System.out.println(z22 / z6);
		
		/* Ü2 
		
		UND &&
		a		b		Ergebnis
		false	false	false
		false	true	false
		true	false	false
		true	true	true
		
		ODER ||
		a		b		Ergebnis
		false	false	false
		false	true	true
		true	false	true
		true 	true	true
		
		*/
		
		/* Ü3 */
		
		byte schalter = 10;
		boolean ergebnis3 = schalter > 7;
		boolean ergebnis4 = schalter < 12;
		
		System.out.println(schalter + " > 7 " + ergebnis3 + "\n" + schalter + " < 12 " + ergebnis4);
		/*
		boolean ergebnis5 = 7 < schalter < 12;
		
		System.out.print("7<schalter<12 = " + ergebnis5);
		*/
		
		boolean s1 = schalter == 10;
		boolean s2 = schalter != 10;
		boolean s3 = schalter == 12;
		boolean s4 = schalter != 12;
		
	
		
		/* Ü4 */
		
		System.out.println("Meine Oma " + "fährt im " + "Hühnerstall Motorrad.");
		
		
		
	}

}
