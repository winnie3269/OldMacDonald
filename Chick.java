class Chick implements Animal 
{     
  private String myType;     
  private String mySound;      
  public Chick(String type, String sound, String other) {         

    myType = type;         
    if (Math.random()<.5)
    {
      mySound=sound;
    } else
    {
      mySound=other; //sound is in the farm class
    }
  }
  public Chick()
  {
    myType="unknown";
    mySound="unknown";
  }
  public String getSound() {
    return mySound;
  }     
  public String getType() {
    return myType;
  }  //your code here
}