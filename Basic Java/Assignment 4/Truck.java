
public class Truck extends Car{
	Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}


	int weight;
		
	
	public double SalePrice(){
     if(weight > 2000){
    	 return (double)(super.regularPrice - super.regularPrice*0.1);
     }
     else{
    	 return (double)(super.regularPrice- super.regularPrice*0.2);
     }
    }
}
