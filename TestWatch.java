class Watch{

void time(){ 
System.out.println("shows time");}
void hands()
{
System.out.println("three hands");
}
void designing()
{
System.out.println("analog");}
}
class Smartwatch extends Watch{
void time()
{
System.out.println("showing time");
}
void hands()
{
System.out.println("No hands");
}
void designing()
{
System.out.println("digitally");
}
}
public class TestWatch{
public static void main(String args[]){
Watch w =new Smartwatch();
w.time();
w.hands();
w.designing();
}
}


                                                                                                                                                                                                                                                    