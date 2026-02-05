
package company.olevelgradingsystem;

import java.util.Scanner;

public class OlevelGradingSystem5students {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int count1 = 0; 
        int count2 = 0;
        int count3 =0;
        int count4 = 0; 
        int count5 =0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 =0;

int studentNumber =1;

while (studentNumber <= 5){
    System.out.println("Enter score for student" + studentNumber + "(0-100)");
    int score = input.nextInt();
    
    String grade  = "";
    String remark = "";
    
    if (score >= 80 && score <= 100) {
        grade = "1"; remark = "D1"; count1++;
        
    }else if (score >= 75){
        grade = "2"; remark = "D2"; count2++;
        
    }else if (score >= 66){
        grade = "3"; remark = "C3"; count3++;
        
    }else if (score >= 60){
        grade = "4"; remark ="C4"; count4++;
        
    }else if (score >= 50){
        grade = "5"; remark = "C5"; count5++;
        
    }else if (score >= 45){
        grade = "6"; remark = "C6"; count6++;
        
    }else if (score >= 35){
        grade = "7"; remark = "P7"; count7++;
        
    }else if (score >= 30){
        grade = "8"; remark = "P8"; count8++;
        
        
    }else if (score >= 0){
        grade = "9"; remark = "F9"; count9++;
        
    }else {
        System.out.println("Invalid score entered! Try again");
        continue;
    }
    System.out.println("\n--- Student" + studentNumber + "Result ---");
    System.out.println("Score :" + score);
    System.out.println("Grade :" + grade);
    System.out.println("Remark :" + remark + "\\n");
    
    studentNumber++; 
    
}

System.out.println("\n--- Summary of Grades ---");
System.out.println("Grade 1 (D1):" + count1 + "student(s)");
System.out.println("Grade 2 (D2):" + count1 + "student(s)");
System.out.println("Grade 3 (C3):" + count1 + "student(s)");
System.out.println("Grade 4 (C4):" + count1 + "student(s)");
System.out.println("Grade 5 (C5):" + count1 + "student(s)");
System.out.println("Grade 6 (C6):" + count1 + "student(s)");
System.out.println("Grade 7 (P7):" + count1 + "student(s)");
System.out.println("Grade 8 (P8):" + count1 + "student(s)");
System.out.println("Grade 9 (F):" + count1 + "student(s)");

input.close();
    }
    
}
