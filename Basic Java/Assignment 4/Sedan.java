
public class Sedan extends Car{
	Sedan(int speed, double regularPrice, String color,int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}


	int length;
		  	
	
	public double SalePrice(){
     if(length >= 20){
    	 return (double) (super.regularPrice - super.regularPrice*0.05);
     }
     else{
    	 return (double) (super.regularPrice - super.regularPrice*0.1);
     }
     }

}
