package se.systementor;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void Hej() {
        String namn = System.console().readLine(); //Minne i RAM 100 tecken
        System.out.println("Hej " + namn);
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        LoopDemo demo = new LoopDemo();
        demo.Run();

        int tal1 = 912; 
        int tal2 = 120; 
        int tal3 = 450; 
        int largest = 0;
        if(tal1 > tal2 && tal1 > tal3)
            largest = tal1;
        else if(tal2 > tal1 && tal2 > tal3)
            largest = tal2;
        else
            largest = tal3;

        //tal3
        if(tal1 > tal2){
            if(tal1 > tal3){
                largest = tal1;
                System.out.println("Hej hej");
            }
            else{
                largest = tal3;
            }
        }













        int i = 123;
        //
        int j = 0; //PRIMITIVA DATATYPER har ingen constructor
        String namn; //KLASS/OBJEKT  Initieras i s.k constructorn = metod (namn = "")
        if(i == 123) {
            namn = "Kalle";    
        }
        else {
            namn = "Nisse";
        }
        Hej(); 
        System.out.println("Hello World!" + namn);
    }
}
