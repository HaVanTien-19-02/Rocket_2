
import java.time.LocalDate;
import java.util.Random;

public class Assignment3 {	    
	    LocalDate date;
	  	
		public static void main(String[] args) {
			Random random = new Random();
			String[] LastName = { "Nguyen", "Tran", "Le", "Trinh", "Vu", "Pham", "Ha" };
			String[] MiddleName = { "Ngoc", "Van", "Thi", "Thu", "Thao", "Phuong", "Duy"  };
			String[] FirstName = { "Duc", "Dung", "Manh", "Hanh", "Toan", "Quyet", "Hung" };

			String[] FullName = new String[10];
			
			for (int i = 0; i < FullName.length ; i++) {
                
				int randomHo = random.nextInt(LastName.length);
				int randomDem = random.nextInt(MiddleName.length);
				int randomTen = random.nextInt(FirstName.length);
				

				FullName[i] = LastName[randomHo] + " " + MiddleName[randomDem] + " " + FirstName[randomTen];
				
				System.out.println(FullName[i]);

			}

			String[] Id = new String[10];
			for(int i = 0; i < Id.length ; i++) {
				int randomId1 = random.nextInt(10);
				int randomId2 = random.nextInt(10);
				int randomId3 = random.nextInt(10);
				int randomId4 = random.nextInt(10);
				int randomId5 = random.nextInt(10);
				int randomId6 = random.nextInt(10);
				int randomId7 = random.nextInt(10);
				
				Id[i] = "SV" + randomId1 + randomId2 + randomId3 + randomId4 + randomId5 + randomId6 + randomId7;
				
				System.out.println(Id[i]);
			}
			
			LocalDate[] dateMonth = new LocalDate[10];
			for(int i = 0; i < dateMonth.length; i++ ) {
				
				int minDay = (int) LocalDate.of(1991, 02, 01).toEpochDay();
				int maxDay = (int) LocalDate.of(1991, 12, 30).toEpochDay();
				long randomDay = minDay + random.nextInt(maxDay - minDay);
				LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
				dateMonth[i] = randomDate;
				System.out.println(dateMonth[i]);
			}
					
			String[] PTYeuCau = new String[10];
			
			int diemGioi,	diemKha,	diemTrungBinh,	diemYeu,	diemKem;
			
			diemGioi = diemKem = diemKha = diemTrungBinh = diemYeu = 0;
			
			for(int i = 0; i < PTYeuCau.length; ) {
				int random1 = random.nextInt(5);
				if(random1 == 0 && diemGioi < 1) {
					int randomDiem = 8 + random.nextInt(3);
					PTYeuCau[i] = Integer.toString(randomDiem);
					System.out.println(PTYeuCau[i]);
					i++;
					diemGioi++;
				}
				
				else if (random1 == 1 && diemKha < 3) {
					int randomDiem1 = 5 + random.nextInt(3);
					PTYeuCau[i] = Integer.toString(randomDiem1);
					System.out.println(PTYeuCau[i]);
					i++;
					diemKha++;
				}
				
				else if(random1 == 2 && diemTrungBinh < 3) {
					int randomDiem2 = 3 + random.nextInt(2);
					PTYeuCau[i] = Integer.toString(randomDiem2);
					System.out.println(PTYeuCau[i]);
					i++;
					diemTrungBinh++;
					
				}
				
				else if(random1 == 3 && diemYeu < 2) {
					int randomDiem3 = 1+ random.nextInt(2);
					PTYeuCau[i] = Integer.toString(randomDiem3);
					System.out.println(PTYeuCau[i]);
					i++;
					diemYeu++;
				}
				
				else if(random1 == 4 && diemKem < 1) {
					PTYeuCau[i] = Integer.toString(0);
					System.out.println(PTYeuCau[i]);
					i++;
					diemKem++;
				}
			}
			
			String[] TKPhanMem = new String[10];
			
			int diemGioi_1,	diemKha_1,	diemTrungBinh_1,	diemYeu_1,	diemKem_1;
			
			diemGioi_1 = diemKem_1 = diemKha_1 = diemTrungBinh_1 = diemYeu_1 = 0;
			
			for(int i = 0; i < TKPhanMem.length; ) {
				int random1 = random.nextInt(5);
				if(random1 == 0 && diemGioi_1 < 1) {
					int randomDiem = 8 + random.nextInt(3);
					TKPhanMem[i] = Integer.toString(randomDiem);
					System.out.println(TKPhanMem[i]);
					i++;
					diemGioi_1++;
				}
				
				else if (random1 == 1 && diemKha_1 < 3) {
					int randomDiem1 = 5 + random.nextInt(3);
					TKPhanMem[i] = Integer.toString(randomDiem1);
					System.out.println(TKPhanMem[i]);
					i++;
					diemKha_1++;
				}
				
				else if(random1 == 2 && diemTrungBinh_1 < 3) {
					int randomDiem2 = 3 + random.nextInt(2);
					TKPhanMem[i] = Integer.toString(randomDiem2);
					System.out.println(TKPhanMem[i]);
					i++;
					diemTrungBinh_1++;
					
				}
				
				else if(random1 == 3 && diemYeu_1 < 2) {
					int randomDiem3 = 1+ random.nextInt(2);
					TKPhanMem[i] = Integer.toString(randomDiem3);
					System.out.println(TKPhanMem[i]);
					i++;
					diemYeu++;
				}
				
				else if(random1 == 4 && diemKem_1 < 1) {
					TKPhanMem[i] = Integer.toString(0);
					System.out.println(TKPhanMem[i]);
					i++;
					diemKem_1++;
				}
			}
			
			
			String[] CUT = new String[10];
			
			int diemGioi_3,	diemKha_3,	diemTrungBinh_3,	diemYeu_3,	diemKem_3;
			
			diemGioi_3 = diemKem_3 = diemKha_3 = diemTrungBinh_3 =  diemYeu_3 =  0;
			
			for(int i = 0; i < PTYeuCau.length; ) {
				int random1 = random.nextInt(5);
				if(random1 == 0 && diemGioi_3 < 1) {
					int randomDiem = 8 + random.nextInt(3);
					CUT[i] = Integer.toString(randomDiem);
					System.out.println(CUT[i]);
					i++;
					diemGioi_3++;
				}
				
				else if (random1 == 1 && diemKha_3 < 3) {
					int randomDiem1 = 5 + random.nextInt(3);
					CUT[i] = Integer.toString(randomDiem1);
					System.out.println(CUT[i]);
					i++;
					diemKha_3++;
				}
				
				else if(random1 == 2 && diemTrungBinh_3 < 3) {
					int randomDiem2 = 3 + random.nextInt(2);
					CUT[i] = Integer.toString(randomDiem2);
					System.out.println(CUT[i]);
					i++;
					diemTrungBinh_3++;
					
				}
				
				else if(random1 == 3 && diemYeu_3 < 2) {
					int randomDiem3 = 1+ random.nextInt(2);
					CUT[i] = Integer.toString(randomDiem3);
					System.out.println(CUT[i]);
					i++;
					diemYeu_3++;
				}
				
				else if(random1 == 4 && diemKem_3 < 1) {
					CUT[i] = Integer.toString(0);
					System.out.println(CUT[i]);
					i++;
					diemKem_3++;
				}
			}
			
			
			String[] LTJava = new String[10];
			
			int diemGioi_2,	diemKha_2,	diemTrungBinh_2,	diemYeu_2,	diemKem_2;
			
			diemGioi_2 = diemKem_2 = diemKha_2 = diemTrungBinh_2 = diemYeu_2 = 0;
			 
			for(int i = 0; i < LTJava.length; ) {
				int random1 = random.nextInt(5);
				if(random1 == 0 && diemGioi_2 < 1) {
					int randomDiem = 8 + random.nextInt(3);
					LTJava[i] = Integer.toString(randomDiem);
					System.out.println(LTJava[i]);
					i++;
					diemGioi_2++;
				}
				
				else if (random1 == 1 && diemKha_2 < 3) {
					int randomDiem1 = 5 + random.nextInt(3);
					LTJava[i] = Integer.toString(randomDiem1);
					System.out.println(LTJava[i]);
					i++;
					diemKha_2++;
				}
				
				else if(random1 == 2 && diemTrungBinh_2 < 3) {
					int randomDiem2 = 3 + random.nextInt(2);
					LTJava[i] = Integer.toString(randomDiem2);
					System.out.println(LTJava[i]);
					i++;
					diemTrungBinh_2++;
					
				}
				
				else if(random1 == 3 && diemYeu_2 < 2) {
					int randomDiem3 = 1+ random.nextInt(2);
					LTJava[i] = Integer.toString(randomDiem3);
					System.out.println(LTJava[i]);
					i++;
					diemYeu_2++;
				}
				
				else if(random1 == 4 && diemKem_2 < 1) {
					LTJava[i] = Integer.toString(0);
					System.out.println(LTJava[i]);
					i++;
					diemKem_2++;
				}
			}
			
            String[] FMT = new String[10];
			
			int diemGioi_4,	diemKha_4,	diemTrungBinh_4,	diemYeu_4,	diemKem_4;
			
			diemGioi_4 = diemKem_4 = diemKha_4 = diemTrungBinh_4 = diemYeu_4 = 0;
			 
			for(int i = 0; i < FMT.length; ) {
				int random1 = random.nextInt(5);
				if(random1 == 0 && diemGioi_4 < 1) {
					int randomDiem = 8 + random.nextInt(3);
					FMT[i] = Integer.toString(randomDiem);
					System.out.println(FMT[i]);
					i++;
					diemGioi_4++;
				}
				
				else if (random1 == 1 && diemKha_4 < 3) {
					int randomDiem1 = 5 + random.nextInt(3);
					FMT[i] = Integer.toString(randomDiem1);
					System.out.println(FMT[i]);
					i++;
					diemKha_4++;
				}
				
				else if(random1 == 2 && diemTrungBinh_4 < 3) {
					int randomDiem2 = 3 + random.nextInt(2);
					FMT[i] = Integer.toString(randomDiem2);
					System.out.println(FMT[i]);
					i++;
					diemTrungBinh_4++;
					
				}
				
				else if(random1 == 3 && diemYeu_4 < 2) {
					int randomDiem3 = 1+ random.nextInt(2);
					FMT[i] = Integer.toString(randomDiem3);
					System.out.println(FMT[i]);
					i++;
					diemYeu_4++;
				}
				
				else if(random1 == 4 && diemKem_4 < 1) {
					FMT[i] = Integer.toString(0);
					System.out.println(FMT[i]);
					i++;
					diemKem_4++;
				}
			}
			System.out.println("full name				"  +"				ID	" + "	Date	" + "Điểm PTYeuCau"   + " Điểm TKPhanMem " + " LTJava " + " CUT " + " FMT " + "Điểm trung bình");
			System.out.println("______________________________________________________________________________________________________________________________________________________");
			
			for(int i =0; i <10; i++) {
				float a = Float.parseFloat(PTYeuCau[i]);
				float b = Float.parseFloat(TKPhanMem[i]);
				float c = Float.parseFloat(LTJava[i]);
				float d = Float.parseFloat(CUT[i]);
				float e = Float.parseFloat(FMT[i]);
				System.out.println(FullName[i]+ "					" + Id[i] + "	" + dateMonth[i] + "		" +  a + "		"+ b +"		" + c +"		"+ d + " "+ e +"	"+ (a+b+c+d)/4);
			}
			
			
			
		}
	
}



