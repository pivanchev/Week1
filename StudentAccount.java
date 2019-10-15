

package week1;
import java.util.Date;
import java.util.Scanner;


public class StudentAccount {
    
    String firstName;
    String surname;//1 method
    char gender;
    String address;//1method
    String nationality;//1 method
    String tel;//1 method
    String studentID;
    float balance;//2 methods
    
    
       public void changeSurname(String oldname,String newname){
           
           if(!newname.equalsIgnoreCase(oldname)){
               oldname.replaceAll(oldname, newname);
               System.out.println(newname);
           }
            
        }
        
        public void changeAddress(String oldAddress,String newAddress){
           
           if(!newAddress.equalsIgnoreCase(oldAddress)){
               oldAddress.replaceAll(oldAddress, newAddress);
               System.out.println(newAddress);
           }
            
        }
        
        public void cnahgeNationality(String oldNationality,String newNationality){
         
           if(!newNationality.equalsIgnoreCase(oldNationality)){
               oldNationality.replaceAll(oldNationality, newNationality);
               System.out.println(newNationality);
           }
        }
          public void changeTelephoneNumber(String oldNumber,String newNumber){
               if(!newNumber.equalsIgnoreCase(oldNumber)){
               oldNumber.replaceAll(oldNumber, newNumber);
               System.out.println(newNumber);
                 
           }
            
        }
        
        public void depositMoney(){
            balance+=10;
            
        }
        
        public void payPrinting(){
            
            balance-=10;
            
        }
    
    

 
    public static void main(String[] args) {
        
        
        
        Scanner scan=new Scanner(System.in);
        StudentAccount acc=new StudentAccount();
        
        
        
        /*
        Date dob=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("mm-dd-yyy");
        System.out.println(dob);*/
        
        System.out.print("First name: ");
        String firstName=scan.nextLine();
        
        System.out.print("Surname: ");
        String surname=scan.nextLine();
        acc.changeSurname("", "");
        
        
       /* System.out.println("Gender: ");
        char gender=scan.next().charAt(0);*/
    
        System.out.print("Address: ");
        String address=scan.nextLine();
        acc.changeAddress("", "");
        
        
        System.out.print("Nationality: ");
        String nationality=scan.nextLine();
        acc.cnahgeNationality("", "");
        
        System.out.print("Telephone: ");
        String tel=scan.nextLine();
        acc.changeTelephoneNumber("", "");
        
        /*System.out.println("Date of birth: ");*/
        
        
        System.out.print("Student ID: ");
        String studentID=scan.nextLine();
        
        System.out.print("Balance: ");
        float balance=scan.nextFloat();
        
        
        
        
     
    }   



}
