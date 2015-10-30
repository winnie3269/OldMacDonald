class namedCow extends Cow
{
  private String myName;
  public namedCow(String type, String name, String sound)
  {
    myType=type;
    mySound=sound;
    myName="Betsy";
  }
  public String getName()
  {
    return myName;
  }
}