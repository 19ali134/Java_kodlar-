package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		
		String internet�ubeButonu ="�nternet �ubesi";
		double dolarBugun = 8.15;
		double dolarDun = 8.15;
		int vade = 36;
		boolean d�st�M�= false;		
				
		System.out.println(internet�ubeButonu);		
		System.out.println("Hello world");
		
		if(dolarBugun<dolarDun) {
			System.out.println("dolar d��t� resmi");
		}else if (dolarBugun == dolarDun){
			System.out.println("dolar ayn�");
		}else {
			System.out.println("dolar y�kseldi resmi");
		}
		
		
		String[] krediler = {"Haz�r kredi","mutlu emekli kredisi","konut kredisi","�iftci kredisi","Msb kredisi"};
		
		
		for(String kredi : krediler){
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
		
		
		

	}

}
