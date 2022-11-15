/**
 *. Class to represent the characteristics of
 *. one defendant from a dataset
 *
 *  @author CSC 212 class
 *. @version Spring 2022
 */




public class Defendant implements ProPublica
{
  //makes feilds
  private boolean isWhite = false;
  private boolean isBlack = false;
  private boolean Reoffended = false;
  private boolean isLowRisk = false;
  
  private String sex;
  private String race;  
  private String c_charge_degree;
  private String c_charge_desc;
  private int desile_score;
  private String score_text;
  private int two_year_recid;
  private String r_charge_desc;
  private String r_charge;
  
  public boolean isWhite()
  {
    if (this.race.equals("Caucasian"))
       this.isWhite = true;
          
    return this.isWhite;
  }

  public boolean isBlack()
  {
    if (this.race.equals("African-American"))
        this.isBlack =  true;
    
    return this.isBlack;
    
  }

  public boolean hasReoffended()
  {
     if (this.two_year_recid == 1)
       this.Reoffended = true;
          
    return this.Reoffended;
    
    
  }

public boolean isLowRisk()
  {
    if (this.score_text.equals("Low"))
        this.isLowRisk =  true;
    
    return this.isLowRisk;
    
  }

  
  //constructor for defult defendant
  public Defendant()
  {
    //default values
   this("Male","African-American","F","No Charge",2,"Low",0,"None","None");
  }

 //constructor for defult nine variables
public Defendant (String sex, String race, String c_charge_degree, String       c_charge_desc, int desile_score, String score_text, int two_year_recid,
  String r_charge_desc, String r_charge)
  {
     this.sex = sex;
     this.race = race;
     this.c_charge_degree = c_charge_degree;
     this.c_charge_desc = c_charge_desc;
     this.desile_score = desile_score;
     this.score_text = score_text;
     this.two_year_recid = two_year_recid;
     this.r_charge_desc = r_charge_desc;
     this.r_charge = r_charge;
   
  }  
  
   //constructor for the defendant as string
  public Defendant (String client[])
  {
     this.sex = client[0];
     this.race = client[1];
     this.c_charge_degree = client[2];
     this.c_charge_desc = client[3];
     this.desile_score = Integer.parseInt(client[4]);
     this.score_text = client[5];
     this.two_year_recid = Integer.parseInt(client[6]);
     this.r_charge_desc = client[7];
     this.r_charge = client[8];
   
  }  
  
  public String getSex()
  {
    return this.sex;
  }
  public void setSex(String sex)
  {
    this.sex = sex;
  }


  public String getRace()
  {
    return this.race;
  }
  public void setrace(String race)
  {
    this.race = race;
  }


  public String getC_charge_degree()
  {
    return this.c_charge_degree;
  }
  public void setc_charge_degree(String c_charge_degree)
  {
    this.c_charge_degree = c_charge_degree;
  }


  public String getC_charge_desc()
  {
    return this.c_charge_desc;
  }
  public void  setc_charge_desc(String c_charge_desc)
  {
    this.c_charge_desc = c_charge_desc;
  }


  public int getDesile_score()
  {
    return this.desile_score;
  }
  public void setdesile_score(int desile_score)
  {
    this.desile_score = desile_score;
  }


  public String getScore_text()
  {
    return this.score_text;
  }
  public void setscore_text(String score_text)
  {
    this.score_text = score_text;
  }


  public int getTwo_year_recid()
  {
    return this.two_year_recid;
  }
  public  void  setTwo_year_recid (int two_year_recid)
  {
    this.two_year_recid = two_year_recid;
  }


  public String getR_charge_desc()
  {
    return this.r_charge_desc;
  }
  public void  setRcharge_desc(String r_charge_desc)
  {
    this.r_charge_desc = r_charge_desc;
  }

  
  public String  getR_charge()
  {
    return this.r_charge;
  }
  public void setR_charge(String r_charge)
  {
    this.r_charge = r_charge;
  }
  
// a toString method to retun all the fields for printing purposes
   public String toString() 
   {
     return "Sex : " + sex +
            " Race : " + race +
            " Charge degree : " + c_charge_degree +
            " Charge description : " + c_charge_desc + 
            " Desile Score : " + desile_score +
            " Score text : " + score_text +
            " Two year recid : " + two_year_recid +
            " R Charge Desc: " + r_charge_desc +
            " R Charges : " + r_charge;
   }

  

  
}
