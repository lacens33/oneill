package oneill;


/*Olyan objektum amely z�rt �llapotban �thatolhatatlan viszont nyitott �llapotban a j�t�kos �t tud haladni rajta. 
Minden egyes ilyen Door objektumhoz tartozik egy Scale objektum amely az adott objektumhoz tartoz� scale_ID azonos�t.
Ha az ehhez tartoz� Scale objektumra Box vagy Player objektum ker�l akkor ez a Door objektum nyitva lesz.*/
public class Door  extends Component{
	Location location;
	boolean isOpen;
	int scale_ID;
	int ID;
	char icon;
	
	//A Door oszt�ly konstruktora, ami  l�trehoz egy Door objektumot a megadott f�ggv�nyparam�terekkel
	Door(Location loc, int ID, int SCALE_ID, char icon){
		setLocation(loc);
		setState(false);
		setSteppable(false);				
		setScale_ID(SCALE_ID);
		setIcon(icon);
		
		System.out.println("		Door(Location location, int SCALE_ID) constructor.");
		System.out.println("			x=" +location.getX()+ " y=" +location.getY()+ " SCALE_ID=" +getScale_ID());
	}
	
	public Door() {
		// TODO Auto-generated constructor stub
	}

	//Be�ll�tja egy Door objektum isOpen �rt�k�t a param�terben megadott �rt�kre
	void setState(boolean b){
		isOpen = b;
	 
	}
	
	//Vissza adja az adott objektum isOpen attrib�tum�nak �rt�k�t
	boolean getState(){
		return isOpen;
	}
	
	//Vissza adja az adott Door objektumhoz tartoz� Scale objektum azonos�t� sz�m�t (scale_ID)
	int getScale_ID(){
		return scale_ID;
	}
	
	void setScale_ID(int SCALE_ID){
		scale_ID = SCALE_ID;
	}
	
	Location getLocation(){
		return location;
	}
	
	void setID(int v){
		ID = v;
	}
	
	int getID(){
		return ID;
	}
	
	/*Be�ll�thatjuk egy adott objektum hely�t a k�perny�n*/
	void setLocation(Location loc){
		location = loc;
	}
	
	char getIcon(){
		return icon;
	}
	
	void setIcon(char c){
		icon = c;		
		if (getState())
			icon =' ';
		else icon = c;	
	}
}

