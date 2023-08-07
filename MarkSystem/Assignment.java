package MarkSystem;

public class Assignment implements IComponent{
	private float percentage,totalMark,obtaninedMark;

	public Assignment(){
		System.out.println("Assignment Constructor");
	}
	
	public float getPercentage(){
		return this.percentage;
	}

	public void setPercentage(float percentage){
		this.percentage= percentage;
	}


	public float getTotalMark(){
		return this.totalMark;
	}
 
	public void setTotalMark(float totalMark){
		this.totalMark= totalMark;
	}
	public float getObtaninedMark(){
		return this.obtaninedMark;
	}
	public void setObtaninedMark(float obtaninedMark){
		this.obtaninedMark= obtaninedMark;
	}
	public void showDetails(){
		System.out.println("Percentage: "+ percentage+"%");
		System.out.println("Total Marks: "+ totalMark);
		System.out.println("Obtanined Marks: "+ obtaninedMark);
	}
}