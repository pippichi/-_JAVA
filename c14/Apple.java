public class Apple extends Fruit implements getData{
	public void eat(){
		System.out.println("Apple tastes good!");
		}
		
	public void color(color){
		this.color=color;
		}
	
	public void size(size){
		this.size=size;
		}		
	public String getColor(){
		return color;
		}
	public String getTaste(){
		return taste;
		}
	public int getSize(){
		return size;
		}
	
	}