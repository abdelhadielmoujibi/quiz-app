import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Main{
    public static void main (String[]args){
        Prof prof = new Prof();
        prof.setId(0000);
        prof.setPassword(12345678);
        Scanner scanner = new Scanner(System.in);
        String role="";
        while(!(role.equals("student" ) || role.equals("teacher" ))){     
            System.out.println("What is your role student or teacher");
            role = scanner.nextLine();
            
        }
        int id=-1;
        int password=-1;
        if(role.equals("teacher")){
        
        while(id!=prof.getId()){
            System.out.println("what is your id for login");
            id=scanner.nextInt();
        }
        while(password!=prof.getPassword()){
            System.out.println("what is your Password for login");
            password=scanner.nextInt();
        }
        System.out.println("what is the number of questions that you want to add");
        int numberOfQeustions = scanner.nextInt();
        scanner.nextLine();
        Cour cour =new Cour();
        List<String> questions=new ArrayList<>();
        
        for(int i=0 ; i<numberOfQeustions;i++){
            System.out.println("give the questions number "+ (i+1));
            questions.add(scanner.nextLine());

        }
        cour.setQuestions(questions);
        System.out.println("-----------------");

        

        
        }
        if(role.equals("student")){
            
        }


    }
}