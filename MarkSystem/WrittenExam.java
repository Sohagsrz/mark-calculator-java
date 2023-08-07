package MarkSystem;

public class WrittenExam implements IComponent{
	private float percentage,totalMark,obtaninedMark;

	public WrittenExam(){
		System.out.println("WrittenExam Constructor");
	}
	
	public float getPercentage(){
		return 0.0f;
	}

	public void setPercentage(float percentage){
		this.percentage= percentage;
	}

	public float getTotalMark(){
		return 0.0f;
	}
 
	public void setTotalMark(float totalMark){
		this.totalMark= totalMark;
	}
	public float getObtaninedMark(){
		return 0.0f;
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