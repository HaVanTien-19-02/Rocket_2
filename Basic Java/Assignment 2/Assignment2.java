import java.util.Random;
public class Assignment2 {
// Câu 1	
public static void main(String[] args) {
	String[]Ho = {"Ha", "Le", "Bui", "Tran", "Pham", "Nguyen", "Mai"};
	String[]Dem = {"Van", "Cong", "Thi", "Thu", "Dang", "Duc", "Quoc"};
	String[]Ten = {"Tien", "Tam", "Thu", "Hoai", "Huy", "Chien", "Hieu"};
	
	Random rd = new Random();
	
	String[] Hovaten = new String[10];					
	for(int i=0; i<Hovaten.length; i++){
		int numberHo = rd.nextInt(Ho.length);
		int numberDem = rd.nextInt(Dem.length);
		int numberTen = rd.nextInt(Ten.length);
		Hovaten[i] = Ho[numberHo]+" "+Dem[numberDem]+" "+Ten[numberTen];
	}
// Câu 2  
	String[]Msv = {"01 ","02","03","04","05","06","07","08","09","10"}; 
	for (int i=0;i<10;i++){
	Msv[i]="SV11111"+Msv[i];	
	}
// Câu 3	
	String[]Ns = {"01/02/1991","02/03/1991","03/04/1991","04/05/1991","05/06/1991",
		          "07/08/1991","08/09/1991","09/10/1991","10/11/1991","31/12/1991"}; 
    for (int i=0;i<10;i++){	
    }
// Câu 4
    String[] FullInfor = new String[10];
    for(int i=0; i<10; i++){
    FullInfor[i] = Hovaten[i]+"            "+Msv[i]+"             "+Ns[i];
    System.out.println(FullInfor[i]);
    }
}
}
