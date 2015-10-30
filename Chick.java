class Chick implements Animal 
{     
  private String myType;     
  private String mySound;      
  public Chick(String type, String sound, String otherSound) 
  {         
    myType = type;         
    if (Math.random()<.5)
    {
      mySound=sound;
    } else
    {
      mySound=otherSound; //sound is in the farm class
    }
  }
  public Chick(String type, String sound)
  {
    myType=type;
    mySound=sound;
  }
  public String getSound() {
    return mySound;
  }     
  public String getType() {
    return myType;
  }  //your code here
}