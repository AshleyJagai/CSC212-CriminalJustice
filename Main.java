import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException; 
import java.util.ArrayList;

/* YOU WILL NEED TO MODIFY THIS FILE */
public class Main {
  
  public static void main(String[] args) {

    
    ArrayList<Defendant> listOdDeffendant = csvReader (); //read csv file and save it to array list
    testConstructor(); // Testing default Constructors
    testStringArrConstructor();// Testing String Constructor
    testGetterSetter (listOdDeffendant); //Testing getter and setter
    testBools(); // Testing bools
    proPublica();
  
  }
  
  public static void testConstructor() {
   // testfilereader();

      Defendant d3 = new Defendant(); // testing default  Constructor
      System.out.println(d3.getRace());
      System.out.println(d3.isBlack());
    /* construct an object */
     Defendant d = new Defendant("Male","Caucasian","F","No Charge",2,"Low",0,"None","None"); 
     System.out.println(d.getRace());
     System.out.println(d.isWhite());

     
    /* test the getter method for the sex field: assertEquals will return no output if the strings are equal
    otherwise, it will throw an Exception
    

    e.g. Assert.assertEquals(sex, d.getSex());
    */
    
  }

  public static void testBools() {
    String[] row1 = new String[] {"Male", "Caucasian", "F", "Aggravated Assault w/Firearm", "1", "Low", "0", "None", "None"};
    Defendant d2 = new Defendant(row1); 
    System.out.println("Is defendant black? " + d2.isBlack());
    System.out.println("Was defendant labeled as being rearrested within 2 years? " + d2.hasReoffended());
    System.out.println("Is defendant White? " + d2.isWhite());
    System.out.println("Does defendant have risk assessment that was classified as Low? " + d2.isLowRisk());
    /* Test the isWhite(), isBlack(), hasReoffended(), isLowRisk(), and isHighRisk() methods */
  }

  public static void testStringArrConstructor() {
    
    String[] row1 = new String[] {"Male", "Other", "F", "Aggravated Assault w/Firearm", "1", "Low", "0", "", ""};
    Defendant d2 = new Defendant(row1); 
    System.out.println(d2.getRace());
    
    /* more code to write for testing */
    
  }

  public static ArrayList<Defendant> csvReader (){
     String line = "";  
     String splitBy = ",";  
     ArrayList<Defendant> client = new ArrayList<>(); // create an array list to hold my values from csv file
        
      try   
        {  
          //reading csv file  
          BufferedReader reader = new BufferedReader(new FileReader("compas-scores v2.csv"));  
          line = reader.readLine(); // reading header line first
           
            while ((line = reader.readLine()) != null)   //returns a Boolean value  
             {  
                String[] read = line.split(splitBy);    // use comma as separator 
                Defendant d4 = new Defendant(read); // pass each row to Defendant class
                client.add(d4); // add into my array list

               
             }
          reader.close();
        }

        
            catch (IOException e) 
            {
              System.out.println("An error occurred.");
              e.printStackTrace();
            }

    return client;

  }


   //opens file and reads it
  public static void testfilereader()
    {
      String line = "";  
      String splitBy = ",";  
      ArrayList<Defendant> client = new ArrayList<>(); // create an array list to hold my values from csv file
        
      try   
        {  
          //reading csv file  
          BufferedReader reader = new BufferedReader(new FileReader("compas-scores v2.csv"));  
          line = reader.readLine(); // reading header line first
           
            while ((line = reader.readLine()) != null)   //returns a Boolean value  
             {  
                String[] read = line.split(splitBy);    // use comma as separator 
                Defendant d4 = new Defendant(read); // pass each row to Defendant class
                client.add(d4); // add into my array list

               // System.out.println(d4.getRace());
             }
          reader.close();
        }

        
            catch (IOException e) 
            {
              System.out.println("An error occurred.");
              e.printStackTrace();
            }
// Below see my array list that currently have all of my data from csv
     for (int i = 0; i < client.size(); i++) 
      {
        System.out.print("Client # " + (i+1) + ": is a "); // add one to make it readable
        System.out.println(client.get(i).getSex() + "\n ") ;
         System.out.print("\n");
      }

  }

  public static void testGetterSetter (ArrayList<Defendant> client){
 
      //tests Sex 
      // test the set method
      System.out.print("Client # " + (7214) + ": is a ");
      System.out.println(client.get(7213).getSex() + " ") ;
      System.out.print("\n");

      client.get(7213).setSex("Male");

      // print new sex change  
      System.out.print("Client # " + (7214) + ": is now a ");
      System.out.println(client.get(7213).getSex() + " ") ;
      System.out.print("\n");


      //tests Race
      // test the set method
      System.out.print("Client # " + (7214) + ": is a ");
      System.out.println(client.get(7213).getRace() + " ") ;
      System.out.print("\n");

      client.get(7213).setrace("Caucasian");

      // print new race change  
      System.out.print("Client # " + (7214) + ": is now a ");
      System.out.println(client.get(7213).getRace() + " ") ;
      System.out.print("\n");


      //tests Charge degree
      // test the set method
      System.out.print("Client # " + (7214) + ": has a charge degree of ");
      System.out.println(client.get(7213).getC_charge_degree() + " ") ;
      System.out.print("\n");

      client.get(7213).setc_charge_degree("C");

      // print new charge degree change  
      System.out.print("Client # " + (7214) + ": now has a charge degree of ");
      System.out.println(client.get(7213).getC_charge_degree() + " ");
      System.out.print("\n");


      //tests Charge description
      // test the set method
      System.out.print("Client # " + (7214) + ": is charged for ");
      System.out.println(client.get(7213).getC_charge_desc() + " ") ;
      System.out.print("\n");

      client.get(7213).setc_charge_desc("Possession of Cannabis");

      // print new charge description change  
      System.out.print("Client # " + (7214) + ": is now charged for ");
      System.out.println(client.get(7213).getC_charge_desc() + " ") ;
      System.out.print("\n");


      //tests Desile Score
      // test the set method
      System.out.print("Client # " + (7214) + ": has a desile score of ");
      System.out.println(client.get(7213).getDesile_score() + " ") ;
      System.out.print("\n");

      client.get(7213).setdesile_score(5);

      // print new desile_score change  
      System.out.print("Client # " + (7214) + ": now has a desile score of ");
      System.out.println(client.get(7213).getDesile_score() + " ") ;
      System.out.print("\n");


      //tests  Score text 
      // test the set method
      System.out.print("Client # " + (7214) + ": has a score of ");
      System.out.println(client.get(7213).getScore_text() + " ") ;
      System.out.print("\n");

      client.get(7213).setscore_text("medium");

      // print new score text change  
      System.out.print("Client # " + (7214) + ": now has a score of ");
      System.out.println(client.get(7213).getScore_text() + " ") ;
      System.out.print("\n");


      //tests  Two_year_recid 
      // test the set method
      System.out.print("Client # " + (7214) + ": has a two year recid of ");
      System.out.println(client.get(7213).getTwo_year_recid() + " ") ;
      System.out.print("\n");

      client.get(7213).setTwo_year_recid(3);

      // print new Two_year_recid change  
      System.out.print("Client # " + (7214) + ": now has a two year recid of ");
      System.out.println(client.get(7213).getTwo_year_recid() + " ") ;
      System.out.print("\n");


      //tests R_charge_desc 
      // test the set method
      System.out.print("Client # " + (7214) + ": has a r charge description of ");
      System.out.println(client.get(7213).getR_charge_desc() + " ") ;
      System.out.print("\n");

      client.get(7213).setRcharge_desc("Operating With Valid License");

      // print new R_charge_desc change  
      System.out.print("Client # " + (7214) + ": now has a r charge description of ");
      System.out.println(client.get(7213).getR_charge_desc() + " ") ;
      System.out.print("\n"); 


      //tests R_charge 
      // test the set method
      System.out.print("Client # " + (7214) + ": has ");
      System.out.println(client.get(7213).getR_charge() + " charges ") ;
      System.out.print("\n");

      client.get(7213).setR_charge("(M3)");

      // print new R_charge change  
      System.out.print("Client # " + (7214) + ": now has ");
      System.out.println(client.get(7213).getR_charge() + " charges ") ;
      System.out.print("\n");

      // Test my toString method
      System.out.println(client.get(7213).toString());
      System.out.print("\n");
  }

  public static void proPublica(){
    DefendantGroup dg = new DefendantGroup("compas-scores v2.csv");
    // variables to count particular categories
    // note that medium and high risk are counted here as high
    int wly = 0; // White, low risk, has reoffended
    int wln = 0; // White, low risk, has not reoffended
    int bly = 0; // Black, low risk, has reoffended
    int bln = 0; // Black, low risk, has not reoffended
    int why = 0; // White, high risk, has reoffended
    int whn = 0; // White, high risk, has not reoffended
    int bhy = 0; // Black, high risk, has reoffended
    int bhn = 0; // Black, high risk, has not reoffended

    System.out.println("\n\n\n");

    // loop to count sums
    for (int i = 0; i < dg.getNumberInGroup(); i++) {
      Defendant d = dg.getDefendant(i);
      
      
      if (d.isWhite()&&d.isLowRisk()&&d.hasReoffended()) {
        wly++;
      } else if (d.isWhite()&&d.isLowRisk()&&!d.hasReoffended()) {
        wln++;
      } else if (d.isBlack()&&d.isLowRisk()&&d.hasReoffended()) {
        bly++;
      } else if (d.isBlack()&&d.isLowRisk()&&!d.hasReoffended()) {
        bln++;
      } else if (d.isWhite()&&!d.isLowRisk()&&d.hasReoffended()) {
        why++;
      } else if (d.isWhite()&&!d.isLowRisk()&&!d.hasReoffended()) {
        whn++;
      } else if (d.isBlack()&&!d.isLowRisk()&&d.hasReoffended()) {
        bhy++;
      } else if (d.isBlack()&&!d.isLowRisk()&&!d.hasReoffended()) {
        bhn++;
      }
    }

    // print the results
    System.out.println("White, high risk, didn't reoffend: "+ String.format("%.2f", whn*100.0/(whn+wln))+" %");
    System.out.println("Black, high risk, didn't reoffend: "+ String.format("%.2f",bhn*100.0/(bhn+bln))+" %");
    System.out.println("White, low risk, did reoffend: "+ String.format("%.2f",wly*100.0/(wly+why))+" %");
    System.out.println("Black, low risk, did reoffend: "+ String.format("%.2f",bly*100.0/(bly+bhy))+" %");
  }


 
}
