package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Engin";
		String ogrenci2="Sena";
		String ogrenci3="Elif";
		String ogrenci4="Ayşegül";
		
		
		
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Sena";
		ogrenciler[2]="Elif";


		
		
		for(int i=0;i<ogrenciler.length;i++){
			System.out.println(ogrenciler[i]);
			
			
		}
		
		for(String ogrenci:ogrenciler) {
			
			System.out.println(ogrenci);
		}
		



	}

}
