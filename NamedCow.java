class namedCow extends Cow
{
  String myName;
  public namedCow(String type, String name, String sound)
  {
    myName=name;
  }
  public String getName()
  {
    return myName;
  }
}