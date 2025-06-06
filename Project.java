import java.util.Scanner;
public class Project
{
static Scanner s=new Scanner(System.in);
public static void main(String[]args)
{
System.out.print("Entering Nexus Vijaya Mall");
System.out.print("\nWhich place you're going first??");
for(int i=1;i<=4;i++){
System.out.println("\n1.FoodCourt");
System.out.println("2.Shopping_Center");
System.out.println("3.Over Crowded! Let's Leave");
String places=s.next();
switch(places)
{
case "1":
FoodCourt();
break;
case "2":
Shopping_Center();
break;
case "3":
System.out.print("Over Crowded! Let's Leave");
System.exit(0);
break;
default:
System.out.print("Invalid Option");
}
}
}
public static void FoodCourt()
{
System.out.println("Choose Restaurant:");
for(int i=1;i<=5;i++){
System.out.println("1.KFC");
System.out.println("2.Mc_Donalds");
System.out.println("3.Taco_Bell");
System.out.println("4.Pizza_Hut");
System.out.println("5.Leave");
System.out.println("Enter an Option: ");
String b=s.next();
switch(b){
case "1":
KFC();
break;
case "2":
Mc_Donalds();
break;
case "3":
Taco_Bell();
break;
case "4":
Pizza_Hut();
break;
case "5":
return;
default:
System.out.println("There is no restaurant available");
}
}
}
public static void KFC()
{
System.out.println("\n1.Fried_Chicken \n2.Tandoori_Chicken \n3.American_Chicken \n4.American_Barbeque");
System.out.println("What's Your order?");
s.nextLine();
String x=s.nextLine();
if (x.equalsIgnoreCase("Fried Chicken")){
System.out.println("Fried Chicken with Mayo will arrive in 15 minutes");
}
if(x.equalsIgnoreCase("Tandoori Chicken")){
System.out.println("Tandoori Chicken with Green Chutney will arrive in 20 minutes");
}
if(x.equalsIgnoreCase("American Chicken")){
System.out.println("American Chicken with Salsa Dip will arrive in 25 minutes");
}
if(x.equalsIgnoreCase("American Barbeque")){
System.out.println("American Barbeque with Mexican Chutney will arrive in 25 minutes");
}
}
public static void Mc_Donalds()
{
System.out.println("\n1.Cheese_Burger \n2.Chicken_Burger \n3.Egg_Burger \n4.Mexican_Burger");
System.out.println("What's Your order?");
s.nextLine();
String y=s.nextLine();
if (y.equalsIgnoreCase("Cheese Burger")){
System.out.println("Cheese Burger with Mayo and Coke will arrive in 15 minutes");
}
if(y.equalsIgnoreCase("Chicken Burger")){
System.out.println("Chicken Burger with Salsa Dip and Pepsi will arrive in 20 minutes");
}
if(y.equalsIgnoreCase("Egg Burger")){
System.out.println("Egg Burger with Fries and ketchup will arrive in 25 minutes");
}
if(y.equalsIgnoreCase("Mexican Burger")){
System.out.println("Mexican Burger with Mexican sauce and Thumbs_up will arrive in 25 minutes");
}
}
public static void Taco_Bell()
{
System.out.println("\n1.American Chilli_Taco \n2.Burrito \n3.Veg_Taco \n4.NonVeg_Taco");
System.out.println("What's Your order?");
s.nextLine();
String z=s.nextLine(); 
if (z.equalsIgnoreCase("American Chilli_Taco ")){
System.out.println("AmericanChilli_Taco with Mexican Dip will arrive in 15 minutes");
}
if(z.equalsIgnoreCase("Burrito")){
System.out.println("Burrito with Berry Blast will arrive in 20 minutes");
}
if(z.equalsIgnoreCase("Veg Taco ")){
System.out.println("Veg Taco  with Fries and ketchup will arrive in 25 minutes");
}
if(z.equalsIgnoreCase("NonVeg Taco")){
System.out.println("NonVeg_Taco with Mexican sauce and Thumbs_up will arrive in 25 minutes");
}
}
public static void Pizza_Hut()
{
System.out.println("\n1.Cheese_Pizza \n2.Margherita_Pizza \n3.Panner_Pizza\n4.Pepperoni_Pizza");
System.out.println("What's Your order?");
s.nextLine();
String v=s.nextLine();
if (v.equalsIgnoreCase("Cheese Pizza ")){
System.out.println("Cheese_Pizza  with chilli flakes will arrive in 15 minutes");
}
if(v.equalsIgnoreCase("Margherita Pizza")){
System.out.println("Margherita Pizza with Berry Blast will arrive in 20 minutes");
}
if(v.equalsIgnoreCase("Panner Pizza")){
System.out.println("Panner Pizza with Fries and ketchup will arrive in 25 minutes");
}
if(v.equalsIgnoreCase("Pepperoni Pizza")){
System.out.println("Pepperoni Pizza with chilli flakes and coke will arrive in 25 minutes");
}
}
public static void Shopping_Center()
{
System.out.println("Which store ");
for(int i=1;i<=4;i++){
System.out.println("\n1.Clothing_store \n2.Electronic_store \n3.Home_appliances \n4.Exit");
String h=s.next();
switch(h)
{
case "1":
Clothing_Store();
break;
case "2":
Electronic_Store();
break;
case "3":
Home_Appliances();
break;
case "4":
return;
default:
System.out.println("Invalid Option");
}
}
}
public static void Clothing_Store()
{
System.out.print("\n1.Frock \n2.Lehanga \n3.Jeans \n4.Shirts");
System.out.print("\nDress Chose:");
s.nextLine();
String j=s.nextLine();
if(j.equalsIgnoreCase("Frock")){
System.out.println("Frock is packed ");
}if(j.equalsIgnoreCase("Lehanga")){
System.out.println("Lehanga is packed");
}
if(j.equalsIgnoreCase("Jeans")){
System.out.println("Jeans is packed");
}
if(j.equalsIgnoreCase("Shirts")){
System.out.println("Shirt is packed");
}
}
public static void Electronic_Store()
{
System.out.println("\n1.Tv \n2.Washing_machine \n3.Ac \n4.Fridge");
System.out.println("Electronic item picked");
s.nextLine();
String k=s.nextLine();
if(k.equalsIgnoreCase("Tv")){
System.out.println("Television is packed");
}
if(k.equalsIgnoreCase("Washing machine")){
System.out.println("Washing machine is packed");
}
if(k.equalsIgnoreCase("Ac")){
System.out.println("Ac is packed");
}
if(k.equalsIgnoreCase("Fridge")){
System.out.println("Fridge is packed");
}
}
public static void Home_Appliances()
{
System.out.println("\n1.Sofa \n2.Stool \n3.Table \n4.Chair");
System.out.println("Item picked");
s.nextLine();
String l=s.nextLine();
if(l.equalsIgnoreCase("Sofa")){
System.out.println("Sofa is packed");
}
if(l.equalsIgnoreCase("Stool")){
System.out.println("Stool is packed");
}
if(l.equalsIgnoreCase("Table")){
System.out.println("Table is packed");
}
if(l.equalsIgnoreCase("Chair")){
System.out.println("Chair is packed");
}
}
}

