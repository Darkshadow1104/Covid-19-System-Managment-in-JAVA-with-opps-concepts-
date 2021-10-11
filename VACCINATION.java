/*
 ***************************************************************************************************************************************
                             Covid-19-System-Managment-in-JAVA-with-opps-concepts  
                           ********************************************************   
                                         By. Nitesh Nresh Narwade
                         ***********************************************************  
                        Email ID: nitesh20329@iiitd.ac.in , darkshadow11041994@gmail.com 
                      **********************************************************************   
                  
 ****************************************************************************************************************************************
 */
import java.util.Scanner;
import java.util.Random;
/*
 ***********************************************************************************************
 * Here we have make one class name as portal1 and this class we
   declare all the variables will be use for the program in private 
   declaration and make the getter and setter for each variable to
   these variables in the main and other class
  
  ***********************************************************************************************
  */
class Portal1{
	/*
	 Here you can see all the private variables we have use.
	 */
	private String well;
	private String option;
	private int New_User;
	private int Existing_Patient;
	private int Exit;
	private String Username;
	private int AdharNumber;
	private int Covishield;
	private int Covaxin;
	private int Pfizer;
	private int Sputnik;
	private String vaccineopted;
	private int Wave;
	private int Vaccine_BOOST;
	private int Vaccine_DURABILITY;
	private int Virus_LIFE;
	private String Virus_Variant;
	private int INJECT;
	private int EFFECT;
	private int EXIT;
	private int ALPHA;
	private int BETA;
	private int GAMA;
	private int SIGMA;
	/*
	 Here you can see we have make the getter and setter for
	 every variables we have use.
	 */
	public void setwell(String well) {
		this.well = well;
	}
	public String getwell() {
		return well;
	}
	public void setoption(String option) {
		this.option = option;
	}
	public String getoption() {
		return option;
	}
	public void setNewUser(int New_User) {
		this.New_User = New_User;
	}
	public int getNewUser() {
		return New_User;
	}
	public void setExistingPatient(int Existing_Patient) {
	     this.Existing_Patient = Existing_Patient; 	
	}
	public int getExistingPatient() {
		return Existing_Patient;
		
	}
	public void setExit(int Exist) {
		this.Exit= Exit; 
	}
	public int getExit() {
		return Exit;
	}
	public void setUsername(String Username) {
		this.Username = Username; 
	}
	public String getUsername() {
		return Username; 
	}
	public void setAdharNumber(int AdharNumber) {
		this.AdharNumber = AdharNumber;
	}
	public int getAdharNumber() {
		return AdharNumber;
	}
	public void setCovishield(int Covishield){
		this.Covishield = Covishield;
	}
	public int getCovishield() {
		return Covishield;
	}
	public void setCovaxin(int Covaxin){
		this.Covaxin = Covaxin;
	}
	public int getCovaxin() {
		return Covaxin;
	}
	public void setPfizer(int Pfizer){
		this.Pfizer = Pfizer;
	}
	public int getPfizer() {
		return Pfizer;
	}
	public void setSputnik(int Sputnik){
		this.Sputnik = Sputnik;
	}
	public int getSputnik() {
		return Sputnik;
	}
	public void setvaccineopted(String vaccineopted) {
		this.vaccineopted = vaccineopted;
	}
	public String getvaccineopted() {
		return vaccineopted;
	}
	public void setWave(int Wave) {
		this.Wave = Wave;
	}
	public int getWave() {
		return Wave;
	}
	public void setVaccine_BOOST(int Vaccine_BOOST) {
		this.Vaccine_BOOST = Vaccine_BOOST;
	}
	public int getVaccine_BOOST() {
		return Vaccine_BOOST;
	}
	public void setVaccine_DURABILITY(int Vaccine_DURABILITY) {
		this.Vaccine_DURABILITY = Vaccine_DURABILITY;
	}
	public int getVaccine_DURABILITY(){
		return Vaccine_DURABILITY;
	}
	public void setVirus_LIFE(int Virus_LIFE){
		this.Virus_LIFE = Virus_LIFE;
	}
	public int getVirus_LIFE(){
		return Virus_LIFE;
	}
	public void setVirus_Variant(String Virus_Variant) {
		this.Virus_Variant = Virus_Variant;
	}
	public String getVirus_Variant(){
		return Virus_Variant;
	}
	public void setINJECT(int INJECT) {
		this.INJECT = INJECT;
	}
	public int getINJECT() {
		return INJECT;
	}
	public void setEFFECT(int EFFECT) {
		this.EFFECT = EFFECT;
	}
	public int getEFFECT() {
		return EFFECT;
	}
	public void setEXIT(int EXIT) {
		this.EXIT = EXIT;
	}
	public int getEXIT() {
		return EXIT;
	}
	public void setALPHA(int ALPHA) {
		this.ALPHA = ALPHA;
	}
	public int getALPHA() {
		return ALPHA;
	}
	public void setBETA(int BETA) {
		this.BETA = BETA;
	}
	public int getBETA() {
		return BETA;
	}
	public void setGAMA(int GAMA) {
		this.GAMA = GAMA;
	}
	public int getGAMA() {
		return GAMA;
	}
	public void setSIGMA(int SIGMA) {
		this.SIGMA = SIGMA;
	}
	public int getSIGMA() {
		return SIGMA;
	}
}
 /*
  ******************************************************************************************************************************************************************************************************************** 
  Here we have made the second class having name Portal2.
  In this class we have made all the function which are
  required for program.
  The function explanations are:
  **********************************************************************************************************************************************************************************************************************
  Enter_Username()     : This function just get string input from the user.And return the same string.
  
  Option_selection()   : This function is getting the int input from the user and return the same.
  
  Enter_Adhar_Number() : This function just build to enter the 16 digits long adhr number.
  
  Choose_your_vaccine(): This function will print that Choose your vaccine matter.
  
  Patient_Registered(String username,long aadharnumber, String vaccineopted) : Here in this function its taking the username, aadhar number, and which vaccine opted and returning the some print statment which require.                         
  
  Well_come_to_the_portal() : This function just exicuting the very first portal welcome. 
  
  Please_select_an_action(int Inject, int Effect, int Exist): This function just printing the Inject, effect and Exit option on the screen.
  
  Enter_Registered_Username(String array_of_user, int wave_no, String Virus_Variant, int Vaccine_BOOST, int Vaccine_DURABILITY, int Virus_LIFE): This also the void type and printing some required statments. 
  
  Patient_not_found(): this function is for if user name is wrong then this will use.
  
  Current_Result(int Vaccine_DURABILITY, int Virus_LIFE, int reducelife):Current resul will show the vaccines durability, virus life and the durability. 
  
  Updated_Result(int Vaccine_DURABILITY, int Virus_LIFE, int randomnumber): This function will use for the updation of the virus action.
  
  Random_number(int min, int max): this will generate the random number and return the random number.
  
  DurabilityZero(): This function start when the Durability will become zero. 
  
  VIRUSLIFE() : This function comes in the action when all the wave completed
  
  one_wave_completed_virus(): This function is use when one wave is completed.
  ***********************************************************************************************************************************************************************************************************************  
  */
class Portal2 extends Portal1{
	//Scanner User = new Scanner(System.in);
   public String Enter_Username() {
	   Scanner User_1 = new Scanner(System.in);
	   String Username = User_1.nextLine();
	   return Username;
   }
   public int Option_selection() {
	   Scanner User_a = new Scanner(System.in);
	   int newUser = User_a.nextInt();
	   return newUser;
   }
   public long Enter_Adhar_Number() {
	   Scanner User_2 = new Scanner(System.in);
	   long Adharnumber = User_2.nextLong();
	   return Adharnumber;
   }
   public void Choose_your_vaccine() {
	   System.out.println("                ");
	   System.out.println("Choose your vaccine:");
	   System.out.println("   "+1+"."+ " Covishield");
	   System.out.println("   "+2+"."+ " Covaxin");
	   System.out.println("   "+3+"."+ " Pfizer");
	   System.out.println("   "+4+"."+ " Sputnik");
	   System.out.println("                ");
   }
   public void Patient_Registered(String username,long aadharnumber, String vaccineopted) {
	   System.out.println("                ");
	   System.out.println("Patient has been registered.");
	   System.out.println("Username-"+ username);
	   System.out.println("Aadhar Number-" + aadharnumber);
	   System.out.println("Vaccine Opted-"+ vaccineopted);
	   System.out.println("                ");
   }
  public void Well_come_to_the_portal() {
	  System.out.println("                ");
	  System.out.println("Well come to the portal:");
	  System.out.println("Please select your option:");
	  System.out.println("   "+ 1 + ". "+"New User");
	  System.out.println("   "+ 2 + ". "+"Existing Patient");
	  System.out.println("   "+ 3 + ". "+"Exit");
	  System.out.println("                ");
  }
  public void Please_select_an_action(int Inject, int Effect, int Exist) {
	  System.out.println("                ");
	  System.out.println("Please select an action :");
	  System.out.println("   " + Inject + ".  " + "INJECT");
	  System.out.println("   " + Effect + ".  " + "EFFECT");
	  System.out.println("   " + Exist + ".  " + "Exit");
	  System.out.println("                ");
  }
  public void Welcome(String array_of_user) {
	  System.out.println("                ");
	  System.out.println("Verifying...");
	  System.out.println("Patient found !");
	  System.out.println("Welcome " + array_of_user+",");
	  System.out.println("                ");
  }
  public void Enter_Registered_Username(String array_of_user, int wave_no, String Virus_Variant, int Vaccine_BOOST, int Vaccine_DURABILITY, int Virus_LIFE) {
	      //System.out.println("Verifying...");
		  //System.out.println("Patient found !");
		  //System.out.println("Welcome " + array_of_user+",");
	      System.out.println("                ");
		  System.out.println("You're being tested for the " + wave_no+"st wave for the "+ Virus_Variant +" variant of the virus:");
		  System.out.println("Vaccines BOOST : "+ Vaccine_BOOST + "| Vaccines DURABILITY : " + Vaccine_DURABILITY+"| Viruss LIFE : " + Virus_LIFE + "| Virus Variant : " + Virus_Variant);
		  System.out.println("                ");
		  //Please_select_an_action(Inject, Effect, Exist);
  }
  public void Patient_not_found() {
	  System.out.println("                ");
	  System.out.println("Verifying...");
	  System.out.println("Patient not found !!! if you haven't registered yet then please register first.");
	  System.out.println("                ");
  }
  public void Current_Result(int Vaccine_DURABILITY, int Virus_LIFE, int reducelife) {
	  System.out.println("                ");
	  System.out.println("Your vaccine is boosted and it reduces the life of the virus by " + reducelife);
	  System.out.println("Vaccines DURABILITY : " + Vaccine_DURABILITY + "|" + "Viruss LIFE :" + Virus_LIFE);
	  System.out.println("                ");
  }
  public void Updated_Result(int Vaccine_DURABILITY, int Virus_LIFE, int randomnumber) {
	  System.out.println("                ");
	  System.out.println("VIRUSs ACTION !");
	  System.out.println("Virus reduces the vaccines DURABILITY by " + randomnumber);
	  System.out.println("Vaccines DURABILITY : " + Vaccine_DURABILITY + " |" + "Viruss LIFE : " + Virus_LIFE);
	  System.out.println("                "); 
  }
  public int Random_number(int min, int max) {
	  Random rand = new Random();
	  int random_number = rand.nextInt((max - min) + 1) + min;
	  return random_number;
  }
  public void DurabilityZero(int durabilityzero, int viruslife, String virusvariant) {
	  //System.out.println("Vaccines DURABILITY : " + durabilityzero + " |" + " Viruss LIFE : " + viruslife);
	  System.out.println("                ");
	  System.out.println("Oops! Your vaccine fails to affect the " + virusvariant + ".");
	  System.out.println("However, The vaccine helps you fight against several attacks of the virus and proves to");
	  System.out.println("be useful. This shows how important the vaccine is in the fight against COVID-19.");
	  System.out.println("Thanks for your participation. Now Lets get Vaccinated !!!");
	  System.out.println("                ");
  } 
  public void VIRUSLIFE() {
	  System.out.println("                ");
	  System.out.println("Virus Defeated !");
	  System.out.println("Vaccine proves to be effective during the fourth wave!!!");
	  System.out.println("Congratulations, your vaccine has overpowered all the variants of the virus and hence");
	  System.out.println("has proved to be effective in all the waves. Great Job!");
	  System.out.println("Thanks for your participation. Now lets get Vaccinated !!!");
	  System.out.println("                "); 
  }
  public void Exit_at_wave_no(int wave_no) {
	  System.out.println("                ");
	  System.out.println("Exited at wave " + wave_no + "!");
	  System.out.println("Thanks for your participation. Let's get Vaccinated !!!");
	  System.out.println("                ");
  }
  public void one_wave_completed_virus(int wavenumber) {
	  /*Virus Defeated !
	  Vaccine proves to be effective during the first wave!!!
	  Moving on to the next wave.*/
	  if(wavenumber<4) {
		  System.out.println("                ");
		  System.out.println("Virus Defeated");
		  System.out.println("Vaccine proves to be effective during the " +  wavenumber + " wave!!!");
		  System.out.println("Moving on to the next wave.");  
		  System.out.println("                ");
	  }
	  else
	  { 
		  System.out.println("                ");
		  System.out.println("Virus Defeated !");
		  System.out.println("Vaccine proves to be effective during the " +  wavenumber + " wave!!!");
		  System.out.println("Congratulations, your vaccine has overpowered all the variants of the virus and hence");
		  System.out.println("has proved to be effective in all the waves. Great Job!");
		  System.out.println("Thanks for your participation. Now let's get Vaccinated !!!");
		  System.out.println("                ");
	  }
	  
  }
}
/*
 *********************************************************************************************************************************************** 
 This class is use for the logic function and this calss is th extended
 version of the above both class.
 *********************************************************************************************************************************************** 
 functiong_of_logic_of_ALL (): In this function I have pass so many values and those are explane as below:
 1) viruslife = denotes the Initially the life of the virus in any variant.
 
 2) INJECT  = demotes the Inject option we are selecting.
 
 3) EFFECT = denotes the Effect option we are selecting.
 
 4) Exit = Denotes the Exit option.
 
 5) reducevirus = Just denoting the the life of virus reduse by some reduceviruse value.
 
 6) vaccinedurability  = This denotes the initial valuse of the durability of the vaccuine.
 
 7) min = This notes the minimum value of the random value.
 
 8) max = This denotes the maximum value of the random value.
 
 9) Virus_Variant = Denotes the type of virus it is (alpha, beta, gama, sigma).
 
 10) reduceeffect = This is the value by which the effect of the next action of virus must reduce.  
 
 11) BOOST = This boost the virus at every iteration.
 
 12) wavenumber = This show the wave number.  
 
 ***********************************************************************************************************************************************
 */
class Portal3 extends Portal2{
	public int functiong_of_logic_of_ALL(int viruslife, int INJECT, int EFFECT, int EXIT, int reducevirus, int vaccinedurability, int min, int max, String Virus_Variant, int reduceeffect, int BOOST, int wavenumber) {
		//vaccinedurability = vaccinedurability + BOOST;
		while(viruslife > 0) {
			
			Please_select_an_action(INJECT, EFFECT, EXIT);
			int Select = Option_selection();
			if(Select == INJECT) {
				vaccinedurability = vaccinedurability + BOOST;
				viruslife = viruslife - reducevirus;
				Current_Result(vaccinedurability, viruslife, reducevirus);
				int Randomnumber = Random_number(min, max);
				vaccinedurability = vaccinedurability - Randomnumber;
				if(vaccinedurability>0 && viruslife>0) {
					Updated_Result(vaccinedurability, viruslife, Randomnumber);
				}
				else if(vaccinedurability<=0 && viruslife>0) {
					Updated_Result(0, viruslife, Randomnumber);
					DurabilityZero(0, viruslife, Virus_Variant);
					viruslife = 1000;
				    break;
					
			}
			else if((vaccinedurability>0 && viruslife<=0) || (vaccinedurability<=0 && viruslife<=0)){
				one_wave_completed_virus(wavenumber);
				//Return function banana hai setBeta(2) and getbeta ko return kardo.
				//setWave(0);
				break;
			}
				
		}
			else if(Select == EFFECT) {
				  //for EFFECT		
					//Current_Result(vaccinedurability, viruslife);
				    
					System.out.println("Viruss action reduced by "  + reduceeffect);
					System.out.println("Vaccines DURABILITY : " + vaccinedurability + "|" + "Viruss LIFE :" + viruslife);
					int Randomnumber = Random_number(min, max);
					int newRandomnumber = Randomnumber - reduceeffect;
					if(newRandomnumber<0) {
						newRandomnumber = 0;
					}
					vaccinedurability = vaccinedurability - newRandomnumber;
					if(vaccinedurability>0 && viruslife>0) {
						Updated_Result(vaccinedurability, viruslife, newRandomnumber);
					}
					else if(vaccinedurability<=0 && viruslife>0) {
						Updated_Result(0, viruslife, newRandomnumber);
						DurabilityZero(0, viruslife, Virus_Variant);
						viruslife = 1000;
						break;
					}
					else if((vaccinedurability>0 && viruslife<=0) || (vaccinedurability<=0 && viruslife<=0)) {
						one_wave_completed_virus(wavenumber);
						//setWave(0);
						break;
//Return function banana hai setBeta(2) and getbeta ko return kardo.						
					}
				  
				  
		}
		else if(Select == EXIT) {
		  //for Exit
			Exit_at_wave_no(wavenumber);
			viruslife = 10000000;
			break;
	  }
	}
	return viruslife;	
}
}
/*
 Now this is my main class.
 ********************************************************************************************************************************************************************************************************************************************************************
 * Here 1st we made the object having name "me".
 * After that we just consider the array having size 100 to stored the inut user name. (In my case i will use Nitesh) 
 * we just apply one while loop which will run for 4 times.
 * me.setNewUser(1) = here we just set the NewUser name at 1
 * me.setExistingPatient(2) = Here we set the Existing patient at number 2
 * me.setExit(3);  = and here we set the Existing patient at number 3
 * me.Well_come_to_the_portal() = This just print " wel ome to the portal".
 * int option = me.Option_selection() = this will ask the user to enter the number form the option.
 * After that We have use the If else contion for the NewUser, ExistingPatient, and Exit.
 * If the User input is 1 then he will comes to the NewUser and print the User name and the aadhar number.
 * After that stored the User name in an empty array at index 0 that we have initially declared.
 * After that we call the function me.Choose_your_vaccine(); whixh will give us options of the vaccinces.
 * After that we just set all the covishield , covaxin, sputnik and pfier at some value like 1,2,3,4. 
 * vaccines = me.Option_selection(); this just give the int type user input to the vaccines variable. 
 * And after that we just call our me.get functions for all the vaccines in the condition statement to confirm that which vaccines we have selected. Like in case of covishiled me.getCovishield. 
 * If the option 2 is selected means Existing Patient then the counter goes to the another else if condition.
 * Now we call this statment "String Registered_Username = me.Enter_Username();" this nothing but ask the user to put their name to confirm and stored in registered_Username. 
 * me.Welcome(Registered_Username); this just welcome the user and varrifying them
 * Now we just run one while loop where we set all the vaccines, waves, and variants. 
 * After that if the wave is 1st then varient will be the ALPha and like wise we get all the values in if else loop by using the set value.
 * int viruslife = me.getVirus_LIFE();  = Here we are getting the virus_life value from the wave number which gets sattisfied.
 * int vaccinedurability = me.getVaccine_DURABILITY(); = Here we are getting the Vaccine durability value from the wave number which gets sattisfied.
 * int min = 0; = This is the minimum value which is nothin but the use to generate the random number from 0 to 25% of the vaccine durability
 * Now again we have use the some conditional statment where we satisfying the while condition having initial value j = 1.
 * If j value match with me.getCovishield (1st wave case and having varient alpha) then counter goes into the if else condition and max value will set for vaccindurability / 4 that is 25% of the vaccine durability and this max value is use to generate the random number. 
 * Now inside this "Enter_Registered_Username" is use which to print this data " You're being tested for the 1st wave for the Alpha variant of the virus:
 * Vaccines BOOST : 10| Vaccines DURABILITY : 100| Viruss LIFE : 100| Virus Variant : Alpha"
 * me.functiong_of_logic_of_ALL(): This function do all the logical things that needs in program. AS this same code I was requiring at 4 different places I have just make the function in portal3 class and call here in VACCINATION class. This function already explained in the portal3 class in comments.   
 * This function is returning some value and that value we stored in value variable. 
 * If value <=0 then j increamnt by the 1 and second wave started it means that in the 1st wave we defeated the virus.
 * If value >=10000000 it means that We just Exit from the process that is we use 3rd option.
 * If value between these 0 or 10000000 then we just break the while loop. That means the durability is become 0 and viruslife is still greater than 0. hence we terminate from the process  
 **************************************************************************************************************************************************************************************************************************************************************************************************************************
 */
public class VACCINATION {

	public static void main(String[] args) {
	  Portal3 me = new Portal3();
	  int new_vaccines = 0;
	  String[] array_of_user = new String[100];
	  int i = 1;
	  while(i<5) {  
	  //me.setWave(i);
	  me.setNewUser(1);
	  me.setExistingPatient(2);
	  me.setExit(3);
	  me.Well_come_to_the_portal();
	  int option = me.Option_selection();
	  if(option == me.getNewUser()) {
		  System.out.println("Enter Username:");
		  String username = me.Enter_Username();
		  //array_of_user[0] = username;
		  array_of_user[0] = username;
		  System.out.println("Enter Aadhar Number:");
		  long aadharnumber = me.Enter_Adhar_Number();
		  long newaadharnumber = 0;
		  newaadharnumber = aadharnumber;
		  int count = 0;
		  while(aadharnumber>0) {
			  aadharnumber = aadharnumber/10;
			  count = count + 1;
		  }
		  if(count==16) {
			  
		  me.Choose_your_vaccine();
		  int vaccines = me.Option_selection();
		  //me.setWave(vaccines);
		  new_vaccines = vaccines;  
		  me.setCovishield(1);
		  me.setCovaxin(2);
		  me.setPfizer(3);
		  me.setSputnik(4);
		  if(vaccines == me.getCovishield()) {
			  me.setvaccineopted("Covishield");
			  me.Patient_Registered(username,newaadharnumber, me.getvaccineopted());
		  }
		  else if(vaccines == me.getCovaxin()) {
			  me.setvaccineopted("Covaxin");
			  me.Patient_Registered(username, newaadharnumber, me.getvaccineopted());
		  }
		  else if(vaccines == me.getPfizer()) {
			  me.setvaccineopted("Pfizer");
			  me.Patient_Registered(username, newaadharnumber, me.getvaccineopted());
		  }
		  else if(vaccines == me.getSputnik()) {
			  me.setvaccineopted("Sputnik");
			  me.Patient_Registered(username, newaadharnumber, me.getvaccineopted());
		  }
	  }
		  else {
			  System.out.println("You have Entered wrong Aadhar number, Please enterd the correct one.");
			  i = i + 1;
			  //break;
		  }
	  }
	  else if(option == me.getExistingPatient()) {
		  System.out.println("Enter Registerd Username: ");
		  String Registered_Username = me.Enter_Username();
		  me.Welcome(Registered_Username);
		  int value = 0;
		  int j = 1;
		  while(j<6) {
		  me.setWave(j);	  
		  me.setCovishield(1);
		  me.setCovaxin(2);
		  me.setPfizer(3);
		  me.setSputnik(4);
		  me.setINJECT(1);
		  me.setEFFECT(2);
		  me.setEXIT(3);
		  //me.setWave();
		  //int WAVE = me.getWave();
		  //int value = 0;
		  if(me.getWave() == 1) {
			  me.setVirus_Variant("Alpha");
			  me.setVaccine_DURABILITY(100);
			  me.setVaccine_BOOST(10);
			  me.setVirus_LIFE(100);
		  }
		  else if(me.getWave() == 2) {
			  me.setVirus_Variant("BETA");
			  me.setVaccine_DURABILITY(150);
			  me.setVaccine_BOOST(20);
			  me.setVirus_LIFE(100);
		  }
		  else if(me.getWave() == 3) {
			  me.setVirus_Variant("GAMA");
			  me.setVaccine_DURABILITY(200);
			  me.setVaccine_BOOST(60);
			  me.setVirus_LIFE(200);
		  }
		  else if(me.getWave() == 4){
			  me.setVirus_Variant("SIGMA");
			  me.setVaccine_DURABILITY(250);
			  me.setVaccine_BOOST(240);
			  me.setVirus_LIFE(250);
		  }
		  else if(me.getWave() == 5) {
			  break;
		  }
		  int viruslife = me.getVirus_LIFE();
		  int vaccinedurability = me.getVaccine_DURABILITY();
		  int min = 0;
		  if(j == me.getCovishield()) {
			  int max = vaccinedurability/4;  
			  if(Registered_Username.equals(array_of_user[0]) == true) {
				  me.Enter_Registered_Username(array_of_user[0], me.getWave(),me.getVirus_Variant(), me.getVaccine_BOOST(), me.getVaccine_DURABILITY(), me.getVirus_LIFE());
				  value = me.functiong_of_logic_of_ALL(viruslife, me.getINJECT(), me.getEFFECT(), me.getEXIT(), 10, vaccinedurability, min, max, me.getVirus_Variant(), 10, me.getVaccine_BOOST(), me.getWave());  
				  if(value <= 0) {
					  j = j + 1;
				  }
				  else if(value>=10000000) {
					  j = 5;
				  }
				  else {
					  break;
				  }
				  //i = i + 1;
				}
			  else {
				  me.Patient_not_found();
			  }
	 }
		  else if(j == me.getCovaxin()) {
			  // for Covaxin
			  int max = vaccinedurability/4;
			  //String Registered_Username_1 = me.Enter_Username();
			  if(Registered_Username.equals(array_of_user[0]) == true) {
				  me.Enter_Registered_Username(array_of_user[0], me.getWave(),me.getVirus_Variant(), me.getVaccine_BOOST(), me.getVaccine_DURABILITY(), me.getVirus_LIFE());
				 value =  me.functiong_of_logic_of_ALL(viruslife, me.getINJECT(), me.getEFFECT(), me.getEXIT(), 5, vaccinedurability, min, max, me.getVirus_Variant(), 5, me.getVaccine_BOOST(), me.getWave()); 
				 if(value <= 0) {
					  j = j + 1;
				  }
				 else if(value>=10000000) {
					  j = 5;
				  }
				 else {
					  break;
				  }
				 //i = i + 1;
		  }
			  else {
				  me.Patient_not_found();
			  }
		  }
		  else if(j == me.getPfizer()) {
			  //for pfzier
			  int max = vaccinedurability/3;
			  //String Registered_Username_2 = me.Enter_Username();
			  if(Registered_Username.equals(array_of_user[0]) == true) {
				  me.Enter_Registered_Username(array_of_user[0], me.getWave(),me.getVirus_Variant(), me.getVaccine_BOOST(), me.getVaccine_DURABILITY(), me.getVirus_LIFE());
				  value = me.functiong_of_logic_of_ALL(viruslife, me.getINJECT(), me.getEFFECT(), me.getEXIT(), 6, vaccinedurability, min, max, me.getVirus_Variant(), 4, me.getVaccine_BOOST(), me.getWave());
				  if(value <= 0) {
					  j = j + 1;
				  }
				  else if(value>=10000000) {
					  j = 5;
				  }
				  else {
					  break;
				  }
				  //i  = i + 1;
		  }
			  else {
				  me.Patient_not_found();
			  }
		  }	  
		  else if(j == me.getSputnik()){
			  //for Sputnik
			  int max = vaccinedurability/2;
			  //String Registered_Username_3 = me.Enter_Username();
			  if(Registered_Username.equals(array_of_user[0]) == true) {
				  me.Enter_Registered_Username(array_of_user[0], me.getWave(),me.getVirus_Variant(), me.getVaccine_BOOST(), me.getVaccine_DURABILITY(), me.getVirus_LIFE());
				  value  = me.functiong_of_logic_of_ALL(viruslife, me.getINJECT(), me.getEFFECT(), me.getEXIT(), 4, vaccinedurability, min, max, me.getVirus_Variant(), 8, me.getVaccine_BOOST(), me.getWave());
				  if(value <= 0) {
					  j = j + 1;
				  }
				  else if(value>=10000000) {
					  j = 5;
				  }
				  else {
					  break;
				  }
				  //i = i + 1;
			  
			  }
			  else {
				  me.Patient_not_found();
			  }
		  }
		  //me.Enter_Registered_Username(array_of_user[0], me.getWave(),me.getVirus_Variant(), me.getVaccine_BOOST(), me.getVaccine_DURABILITY(), me.getVirus_LIFE(), me.getINJECT(), me.getEFFECT(), me.getEXIT());
	  }
	  }
	  else
	  {
		  continue;
	  }
	  
	  }
	  //me.Well_come_to_the_portal();

	  i++;
	  //System.out.println(i);
}
}
