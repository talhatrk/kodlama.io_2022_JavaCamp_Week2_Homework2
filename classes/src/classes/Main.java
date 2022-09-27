package classes;

public class Main {

	public static void main(String[] args) {
		// class'lar referans tiptir.
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Guncelle();
		
		
		//value
		int sayi1 = 10;
		int sayi2 = 10;
		sayi2 = sayi1;
		sayi1 = 10;
		System.out.println(sayi2);
		
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {1,2,3};
		sayilar2 = sayilar1;
		sayilar1[0]= 10;
		System.out.println(sayilar2[0]);

	}

}

