import java.util.*;

public class Krish {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<String>> participant=new ArrayList<>();
        TreeMap <String,String>s=new TreeMap<>();
        s.put("Dancing", "14-8-25 at 9:00 AM");
        s.put("Singing", "14-8-25 at 11:00 AM");
        s.put("Rangoli", "14-8-25 at 3:00 PM");
        s.put("Poster making", "16-8-25 at 9:00 AM");
        s.put("Pot Design", "16-8-25 at 10:00 AM");
        s.put("Result/Winners", "16-8-25 at 3:00 PM");
        ArrayList<ArrayList<String>> eventparticipant=new ArrayList<>();
        // participant.add(new ArrayList<>(Arrays.asList("pranav nag", "AI", "22491a6746")));
        System.out.println(participant);
        while(true){
        System.out.println("Welcome to Krishnahtami Event");
        System.out.println(" 1. Add Participants \n 2. View Participants \n 3. Register Participants for Event \n 4. view Event Scheudle \n 5. Registered Participants \n 6. Exit");
        System.out.print("choose one option to proceed :");
        int val=sc.nextInt();
        switch (val) {
            case 1:
                System.out.println("Welcome for Adding participants ");
                System.out.print("Enter the name ");
                sc.nextLine();
                String name=sc.nextLine();
                

                System.out.print("enter the branc ");
                String branch=sc.nextLine();
              
                System.out.print("enter the rollno ");
                
                String rollno=sc.nextLine();
                participant.add(new ArrayList<>(Arrays.asList(name,branch,rollno)));
                break;
            case 2:
            System.out.println(participant);
            break;
            case 3:
            System.out.println("once check the Events and select ");
            String arr[]={"Dancing","Singing","Rangoli","Poster Making ","Pot Making"};
            System.out.println("1. Dancing \n 2. singing \n 3. Rangoli \n 4.Poster Making \n 5.Pot Making   ");
            System.out.print("Enter the option :");
            int option=sc.nextInt();

            System.out.print("enter the roll number: ");
            sc.nextLine();
            String roll=sc.nextLine();
            
            eventparticipant.add(new ArrayList<>(Arrays.asList(roll,arr[option])));
            break;
            case 4:
            for (Map.Entry<String, String> entry : s.entrySet()) {
    System.out.println(entry.getKey() + " => " + entry.getValue());
}

            break;
            case 5:
            System.out.println("Registered participants: ");
            System.out.println(eventparticipant);
            break;
            case 6:
            System.out.println("Thankyou (:)");
            System.exit(0);
            break;
            default:
               System.out.println("Enter the valid option ");
        }

    }}
}
