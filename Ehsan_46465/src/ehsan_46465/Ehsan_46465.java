package ehsan_46465;

import java.util.Scanner;

class Student{
    Scanner scan = new Scanner(System.in);
    String[] names = new String[10];
    int total_students = 0 ;
    int[] ids = new int[10];
    int[] mathGrades = new int[10];
    int[] scienceGrades = new int[10];
    int[] englishGrades = new int[10];
    int[] historyGrades = new int[10];
    int[] artGrades = new int[10];
    int[] totalGrades = new int[10];
    
    int num = 10;
    
    public void inputStudentData(){
       
        for(int i=0; i<num; i++){
            System.out.print("Enter Student "+ (i+1) +" Data\n");
            System.out.print("Enter Name: ");
            names[i] = scan.nextLine();
            
            System.out.print("Enter ID: ");
            ids[i] = scan.nextInt();
            scan.nextLine();
            
            System.out.print("Enter Math Grades: ");
            mathGrades[i] = scan.nextInt();
            scan.nextLine();
            
            while(mathGrades[i]<0 || mathGrades[i]>100){
                System.out.print("Incorrect Enrty Enter Math Grades again: ");            
                mathGrades[i] = scan.nextInt(); 
                scan.nextLine();
            }
    
            System.out.print("Enter Science Grades: ");
            scienceGrades[i] = scan.nextInt();
            scan.nextLine();
            
             while(scienceGrades[i]<0 || scienceGrades[i]>100){
                System.out.print("Incorrect Enrty Enter Science Grades again: ");            
                scienceGrades[i] = scan.nextInt(); 
                scan.nextLine();
            }
             
            System.out.print("Enter English Grades: ");
            englishGrades[i] = scan.nextInt(); 
            scan.nextLine();
            
              while(englishGrades[i]<0 || englishGrades[i]>100){
                System.out.print("Incorrect Enrty Enter English Grades again: ");            
                englishGrades[i] = scan.nextInt();
                scan.nextLine();
              }
              
              System.out.print("Enter History Grades: ");
                historyGrades[i] = scan.nextInt();
                scan.nextLine();
            
             while(historyGrades[i]<0 || historyGrades[i]>100){
                System.out.print("Incorrect Enrty Enter History Grades again: ");            
                historyGrades[i] = scan.nextInt(); 
                scan.nextLine();
            }
             
            System.out.print("Enter Art Grades: ");
            artGrades[i] = scan.nextInt(); 
            scan.nextLine();
            
              while(artGrades[i]<0 || artGrades[i]>100){
                System.out.print("Incorrect Enrty Enter Art Grades again: ");            
                artGrades[i] = scan.nextInt();
                scan.nextLine();
              }
            
            totalGrades[i] += mathGrades[i] + scienceGrades[i]  + englishGrades[i] + historyGrades[i] + artGrades[i];
            total_students++;
            System.out.println("");
        }
       
 }
    
    
    
    public void calculateStudentAverages(){
        
        if(total_students == 0){
            System.out.println("No students Entered\n");   
        }else{
            
        for(int j=0; j<total_students; j++){
                System.out.println("Student "+ names[j]+" Average Grade: " + (float)totalGrades[j]/5 + "\n");
        }
    }
    }

    
    
    public void displaySubjectStatistics(){
       
        if(total_students == 0){
            System.out.println("No students Entered\n");   
        }else{
        int math_highest = mathGrades[0];
        int math_lowest = mathGrades[0];
        int math_total = 0;
        int science_highest = scienceGrades[0];
        int science_lowest = scienceGrades[0];
        int science_total = 0;
        int english_highest = englishGrades[0];
        int english_lowest = englishGrades[0];
        int english_total = 0;
        int history_highest = historyGrades[0];
        int history_lowest = historyGrades[0];
        int history_total = 0;
        int art_highest = artGrades[0];
        int art_lowest = artGrades[0];
        int art_total = 0;
        
        for (int i=0; i<total_students; i++){
        if(mathGrades[i] > math_highest){
            math_highest = mathGrades[i];
        }
        if(mathGrades[i] < math_lowest){
            math_lowest = mathGrades[i];
        }
        math_total += mathGrades[i];
        
        if(scienceGrades[i] > science_highest){
            science_highest = scienceGrades[i];
        }
        if(scienceGrades[i] < science_lowest){
            science_lowest = scienceGrades[i];
        }
        science_total += scienceGrades[i];
        
        if(englishGrades[i] > english_highest){
            english_highest = englishGrades[i];
        }
        if(englishGrades[i] < english_lowest){
            english_lowest = englishGrades[i];
        }
        english_total += englishGrades[i];
        
        if(historyGrades[i] > history_highest){
            history_highest = historyGrades[i];
        }
        if(historyGrades[i] < history_lowest){
            history_lowest = historyGrades[i];
        }
        history_total += historyGrades[i];
        
        if(artGrades[i] > art_highest){
            art_highest = artGrades[i];
        }
        if(artGrades[i] < art_lowest){
            art_lowest = artGrades[i];
        }
        art_total += artGrades[i];
        
        
    }
        
            System.out.println("Subject Maths");
            System.out.println("Average " + (float)math_total/num);
            System.out.println("Highest Grade: " + math_highest);
            System.out.println("Lowest Grade: " + math_lowest);
            System.out.println("");
            
            System.out.println("Subject Science");
            System.out.println("Average " + (float)science_total/num);
            System.out.println("Highest Grade: " + science_highest);
            System.out.println("Lowest Grade: " + science_lowest);
            System.out.println("");
            
            System.out.println("Subject English");
            System.out.println("Average " + (float)english_total/num);
            System.out.println("Highest Grade: " + english_highest);
            System.out.println("Lowest Grade: " + english_lowest);
            System.out.println("");
            
            System.out.println("Subject History");
            System.out.println("Average " + (float)history_total/num);
            System.out.println("Highest Grade: " + history_highest);
            System.out.println("Lowest Grade: " + history_lowest);
            System.out.println("");
            
            System.out.println("Subject Art");
            System.out.println("Average " + (float)art_total/num);
            System.out.println("Highest Grade: " + art_highest);
            System.out.println("Lowest Grade: " + art_lowest);
            System.out.println("");
        
      
    }
    }
    
    public void displayStudentGrades(){
        
        if(total_students == 0){
            System.out.println("No students Entered\n");   
        }else{
            System.out.println("Enter student ID: ");
            int id = scan.nextInt();
            boolean found = false;
            
            for(int i=0; i<num; i++){
                if(id == ids[i]){
                    found = true;
                    System.out.println("Student Found...");
                    System.out.println("Student Name: "+ names[i]);
                    System.out.println("Maths Grades: " + mathGrades[i]);
                    System.out.println("Science Grades: " + scienceGrades[i]);
                    System.out.println("English Grades: " + englishGrades[i]);
                    System.out.println("Science Grades: " + historyGrades[i]);
                    System.out.println("English Grades: " + artGrades[i]);
                    System.out.println("Student Average Grade: " + (float)totalGrades[i]/5 + "\n");
                }
                if(!found){
                    System.out.println("Student Not Found!");
                    break;
                }
            }        
        }
    }


    public void calculateOverallAverage(){
        
        if(total_students == 0){
            System.out.println("No students Entered\n");   
        }else{
        float overall_grades = 0;
        
        for(int i=0; i<num; i++){
            overall_grades += totalGrades[i];
        }
        System.out.println("Overall Class Average: "+ (float)overall_grades/num);
        
        }
    }

}


public class Ehsan_46465 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        while(true){
        System.out.println("--- Student Grade Analysis ---\n");
        System.out.print("1. Input Student Data\n");
        System.out.print("2. Display Averages for Each Student\n");
        System.out.print("3. Display Subject Statistics\n");
        System.out.print("4. Display Student Grades\n");
        System.out.print("5. Display Overall Class Average\n");
        System.out.print("6. Exit\n");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
            System.out.println("");
        switch(choice){
            
            case 1:
                student.inputStudentData();
                break;
                
                
            case 2:
                student.calculateStudentAverages();
                break;
            case 3:
                student.displaySubjectStatistics();
                break;
                
                
            case 4:
                student.displayStudentGrades();
                break;
                
            case 5:
                student.calculateOverallAverage();
                break;
                
                
            case 6:
                System.exit(0);
                break;
                
            default:
                System.out.println("You Entered Something else");
                break;
    
        }
    }  
    }   
}