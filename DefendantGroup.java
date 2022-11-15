import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException; 
import java.util.ArrayList;

public class DefendantGroup  {

  private ArrayList<Defendant> client = new ArrayList<>(); // create an array list to hold my values from csv file
  
  public DefendantGroup (String fileName){
     String line = "";  
     String splitBy = ",";  
     
        
      try   
        {  
          //reading csv file  
          BufferedReader reader = new BufferedReader(new FileReader(fileName));  
          line = reader.readLine(); // reading header line first
           
            while ((line = reader.readLine()) != null)   //returns a Boolean value  
             {  
                String[] read = line.split(splitBy);    // use comma as separator 
                Defendant d4 = new Defendant(read); // pass each row to Defendant class
                this.client.add(d4); // add into my array list

               
             }
          reader.close();
        }

        
            catch (IOException e) 
            {
              System.out.println("An error occurred.");
              e.printStackTrace();
            }
    
  }

  public void addDefendant (Defendant d){
    this.client.add(d);
    
  }
  
  public void removeDefendant (int i){
    this.client.remove(i);
    
  }

  public int getNumberInGroup (){
    return this.client.size();
    
  }

  public Defendant getDefendant (int i){
    return this.client.get(i);
    
  }
  
}
  
