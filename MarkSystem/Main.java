import java.util.Scanner;
import MarkSystem.Quiz;
import MarkSystem.Assignment;
import MarkSystem.LabPerformance;
import MarkSystem.WrittenExam;

public class Main {
	public static void main(String[] args) {
		float tMarks,obMarks,qPercent, total;
		total=0;
		Scanner inp = new Scanner(System.in);

		//quiz marks

		System.out.print("Quiz Total Marks: ");
		 tMarks = inp.nextFloat();
		System.out.print("Quiz Obtanined Marks: ");
		 obMarks = inp.nextFloat();
		System.out.print("Quiz Total Percent: ");
		 qPercent = inp.nextFloat();
		
		Quiz qz = new Quiz();
		qz.setPercentage(qPercent); // koto % jabe
		qz.setTotalMark(tMarks); // kotor exam
		qz.setObtaninedMark(obMarks); // koto paiche
		// qz.showDetails();

		 total += ((obMarks/ tMarks) * 100) * (qPercent/100);


		//Assignment
		System.out.print("Assignment Total Marks: ");
		 tMarks = inp.nextFloat();
		System.out.print("Assignment Obtanined Marks: ");
		 obMarks = inp.nextFloat();
		System.out.print("Assignment Total Percent: ");
		 qPercent = inp.nextFloat();
		Assignment assignMent = new Assignment();
		assignMent.setPercentage(qPercent); // koto % jabe
		assignMent.setTotalMark(tMarks); // kotor exam
		assignMent.setObtaninedMark(obMarks); // koto paiche
		// assignMent.showDetails();
		 total += ((obMarks/ tMarks) * 100) * (qPercent/100);



		//Lab Performance 
		System.out.print("Lab Performance Total Marks: ");
		 tMarks = inp.nextFloat();
		System.out.print("Lab Performance Obtanined Marks: ");
		 obMarks = inp.nextFloat();
		System.out.print("Lab Performance Total Percent: ");
		 qPercent = inp.nextFloat();
		LabPerformance labPerform = new LabPerformance();
		labPerform.setPercentage(qPercent); // koto % jabe
		labPerform.setTotalMark(tMarks); // kotor exam
		labPerform.setObtaninedMark(obMarks); // koto paiche
		// labPerform.showDetails();
		 total += ((obMarks/ tMarks) * 100) * (qPercent/100);


		//Written Exam 
		System.out.print("Written Exam Total Marks: ");
		 tMarks = inp.nextFloat();
		System.out.print("Written Exam Obtanined Marks: ");
		 obMarks = inp.nextFloat();
		System.out.print("Written Exam Total Percent: ");
		 qPercent = inp.nextFloat();
		WrittenExam written = new WrittenExam();
		written.setPercentage(qPercent); // koto % jabe
		written.setTotalMark(tMarks); // kotor exam
		written.setObtaninedMark(obMarks); // koto paiche
		// written.showDetails();

		 total += ((obMarks/ tMarks) * 100) * (qPercent/100);



		System.out.print("Total Marks: ");System.out.printf("%.2f", total);
		String grade ="";
		if(total < 50){
			grade = "F";
		}else if(total <= 60){
			grade = "D";
		}else if(total <= 65){
			grade = "D+";
		}else if(total <= 70){
			grade = "C";
		}else if(total <= 75){
			grade = "C+";
		}else if(total <= 80){
			grade = "B";
		}else if(total <= 85){
			grade = "B+";
		}else if(total <= 90){
			grade = "A";
		}else if(total <= 100){
			grade = "A+";
		}
		System.out.println("Grade : "+ grade);



	}
}