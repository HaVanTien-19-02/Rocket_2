
public class MyOwnAutoShop {
	
public static void main(String[] args) {	
	Sedan vinfast  = new Sedan(130, 100000, "blue",   3       );			
	Ford  vinfast1 = new Ford (120, 100000 , "black", 2019,5000);	
	Ford  vinfast2 = new Ford (130, 100000, "white", 2020,4000);	
	Car   vinfast3 = new Car  (130, 100000, "yellow"          );	
	
	System.out.println("gia san pham la:" + vinfast.SalePrice());
	System.out.println("gia san pham la:" + vinfast1.SalePrice());
	System.out.println("gia san pham la:" + vinfast2.SalePrice());
	System.out.println("gia san pham la:" + vinfast3.getSalePrice());
}

}
