package question2;

public class Programme {

	public static void main(String[] args) {
		Box <String> val = new Box <String>();
		System.out.print("On v�rifie contenu bo�te pour un exemple avec des Strings :");
		System.out.println(val.get());
		System.out.println("On cr�e un objet de type String dans notre bo�te");
		val.put("Van Halen");
		System.out.println("Valeur de l'objet : " + val.get());
		System.out.println("On �crase l'objet existant par un autre de type String");
		val.put("James Hetfield");
		System.out.println("Valeur de l'objet : " + val.get());
		System.out.println("On cr�e un objet de type String identique au premier dans notre bo�te");
		val.put("Van Halen");
		System.out.println("Valeur de l'objet : " + val.get());
		Box <Integer> val2 = new Box <Integer>();
		System.out.print("On v�rifie contenu bo�te pour un exemple avec des Entiers : ");
		System.out.println(val2.get());
		System.out.println("On cr�e un objet de type Entier dans notre bo�te");
		val2.put(335);
		System.out.println("Valeur de l'objet : " + val2.get());
	}
	
}
