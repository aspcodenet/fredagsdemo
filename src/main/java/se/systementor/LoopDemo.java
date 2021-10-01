package se.systementor;

public class LoopDemo {
    public void run(){

        // int secretPinCode = 123332;
        // int failedTries = 0;

        // while(true)        {


        // }

        System.out.println("Skriv in ett startår ex 2002");
        int start = Integer.parseInt(System.console().readLine());
        System.out.println("Skriv in ett slutår ex 2008");
        int end = Integer.parseInt(System.console().readLine());
        // År 2002
        // År 2003

        for(int theYear = start;theYear <= end; theYear++ ){  
            System.out.println("År "+ theYear);                
        }


        // for(int i = 1972;i <= 2021;i += 4 ){  // i menas ett  YEAR
        //     System.out.println("OS År: " + i);                
        // }



        while (true){
            System.out.println("*KÖR ETT SPEL*");

            System.out.println("Vill du fortsätta?");
            String exit = System.console().readLine();
            if(exit.charAt(0) == 'N')
                break;
        }
           



        int year8 = 1972;
        while(true){
            System.out.println("OS År: " + year8);
            year8 += 4;
            if(year8 >= 2021)
                break;
            //year8 = year8 + 4;
        }


        int year3 = 1972;
        while (year3 <= 2021){
            System.out.println("OS År: " + year3);
            //cnt = cnt + 1;
            year3 += 4;
        }
        System.out.println(year3);

        for(int year31 = 1972;year31 <= 2021;year31 += 4 ){
            System.out.println("OS År: " + year31);                
        }


        year3 = 2021;
        while (year3 >= 1972){
            System.out.println("År: " + year3);
            //cnt = cnt + 1;
            year3--;
        }


        int year = 1972;
        while (year <= 2021){
            System.out.println("År: " + year);
            //cnt = cnt + 1;
            year++;
        }



        int cnt = 0;
        while (cnt < 4){
            System.out.println("Stefan är bäst");
            //cnt = cnt + 1;
            cnt++;
        }
    }
}
