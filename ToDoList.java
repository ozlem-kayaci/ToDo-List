import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

	public static void main(String[] args) {
		// Yapılacaklar listesi; görev ekler, listeler ve siler.
        ArrayList<String> gorevler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice=1;
        
        do {
			System.out.println("\n--Yapılacaklar Listesi--\n");
			System.out.println("1) Görev Ekle");
			System.out.println("2) Görevleri Listele");
			System.out.println("3) Görev Sil");
			System.out.println("4) Çıkış");
			System.out.print("Seçiminiz: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1: 
				System.out.println("Eklenecek Görev: ");
				String gorev = scanner.nextLine();
				gorevler.add(gorev);
				System.out.println("Görev eklendi.");
				break;
			
			case 2:
				System.out.println("\nGörevleri Listele");
				if(gorevler.isEmpty()) {
					System.out.println("Hiç görev yok.");
				}
				else {
					for(int i=0; i<gorevler.size(); i++) {
						System.out.println(i+1 + ". görev: " + gorevler.get(i));						
					}
				}
				break;
			
			case 3:
				if(gorevler.isEmpty()) {
					System.out.println("Silinecek görev yok.");
				}
				else {
					for(int i=0; i<gorevler.size(); i++) {
						System.out.println(i+1 + ". görev: " + gorevler.get(i));
					}
					System.out.print("Silinecek görevin numarasını seçiniz: ");
					int gorevNo = scanner.nextInt();
					if(gorevNo > 0 && gorevNo <= gorevler.size()) {
						gorevler.remove(gorevNo-1);
						System.out.println("Görev silindi.");
					}
					else {
						System.out.println("Geçersiz görev numarası!");
					}
				}
				break;
				
			case 4:
                System.out.println("Çıkış yapılıyor...");
                break;
                
            default:
                System.out.println("Geçersiz seçim.");
                break;
			}
		} while (choice!=4);
        scanner.close();
	}
}