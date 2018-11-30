import java.util.Date;
public class House implements Cloneable,Comparable{
	private int id;
	private double area;
	private java.util.Date whenBuilt;
	
	public House(){}
	public House(int id,double area){
		this.id=id;
		this.area=area;
		whenBuilt=new Date();
		}
		
	public int getId(){
		return id;
		}
	public double getArea(){
		return area;
		}
	public Date getWhenBuilt(){
		return whenBuilt;
	}
	public Object clone() throws CloneNotSupportedException{
		//House house=new House(this.getId(),this.getArea());
		return super.clone();
		}
	public int compareTo(Object o){
		if(getArea()>((House)o).getArea()){
			return 1;
			}
		else if(getArea()<((House)o).getArea()){
			return -1;
			}
		else{
			return 0;
			}
		}
	}