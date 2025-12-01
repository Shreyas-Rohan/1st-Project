import java.util.Scanner;
import java.util.Random;
public class Project{
static Scanner s=new Scanner(System.in);
public static void main(String[]args){
System.out.print("Entering Nexus Vijaya Mall.\nWhich place you're going first??");
for(int i=1;i<=4;i++){
System.out.println("\n1.Food Court. \n2.Shopping Center. \n3.Fun City. \n4.Exit");
String places=s.next();
switch(places){
case "1":
FoodCourt();
break;
case "2":
Shopping_Center();
break;
case "3":
Fun_city();
break;
case "4":
System.out.print("Over Crowded! Let's Leave");
System.exit(0);
break;
default:
System.out.print("Invalid Option");
}}}
public static void FoodCourt(){
System.out.println("Choose Restaurant:");
for(int i=1;i<=5;i++){
System.out.println("1.KFC. \n2.Mc_Donalds. \n3.Taco_Bell. \n4.Pizza_Hut. \n5.Leave.\nEnter an Option: ");
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
}}}
public static void KFC(){
System.out.println("\n1.Fried_Chicken \n2.Tandoori_Chicken \n3.American_Chicken \n4.American_Barbeque");
System.out.println("What's Your order?");
s.nextLine();
String x=s.nextLine();
if (x.equalsIgnoreCase("Fried Chicken")){
System.out.println("Fried Chicken with Mayo will arrive in 15 minutes");}
if(x.equalsIgnoreCase("Tandoori Chicken")){
System.out.println("Tandoori Chicken with Green Chutney will arrive in 20 minutes");}
if(x.equalsIgnoreCase("American Chicken")){
System.out.println("American Chicken with Salsa Dip will arrive in 25 minutes");}
if(x.equalsIgnoreCase("American Barbeque")){
System.out.println("American Barbeque with Mexican Chutney will arrive in 25 minutes");}}
public static void Mc_Donalds(){
System.out.println("\n1.Cheese_Burger \n2.Chicken_Burger \n3.Egg_Burger \n4.Mexican_Burger");
System.out.println("What's Your order?");
s.nextLine();
String y=s.nextLine();
if (y.equalsIgnoreCase("Cheese Burger")){
System.out.println("Cheese Burger with Mayo and Coke will arrive in 15 minutes");}
if(y.equalsIgnoreCase("Chicken Burger")){
System.out.println("Chicken Burger with Salsa Dip and Pepsi will arrive in 20 minutes");}
if(y.equalsIgnoreCase("Egg Burger")){
System.out.println("Egg Burger with Fries and ketchup will arrive in 25 minutes");}
if(y.equalsIgnoreCase("Mexican Burger")){
System.out.println("Mexican Burger with Mexican sauce and Thumbs_up will arrive in 25 minutes");}
public static void Taco_Bell(){
System.out.println("\n1.American Chilli_Taco \n2.Burrito \n3.Veg_Taco \n4.NonVeg_Taco");
System.out.println("What's Your order?");
s.nextLine();
String z=s.nextLine(); 
if (z.equalsIgnoreCase("American Chilli_Taco ")){
System.out.println("AmericanChilli_Taco with Mexican Dip will arrive in 15 minutes");}
if(z.equalsIgnoreCase("Burrito")){
System.out.println("Burrito with Berry Blast will arrive in 20 minutes");}
if(z.equalsIgnoreCase("Veg Taco ")){
System.out.println("Veg Taco  with Fries and ketchup will arrive in 25 minutes");}
if(z.equalsIgnoreCase("NonVeg Taco")){
System.out.println("NonVeg_Taco with Mexican sauce and Thumbs_up will arrive in 25 minutes");}}
public static void Pizza_Hut(){
System.out.println("\n1.Cheese_Pizza \n2.Margherita_Pizza \n3.Panner_Pizza\n4.Pepperoni_Pizza");
System.out.println("What's Your order?");
s.nextLine();
String v=s.nextLine();
if (v.equalsIgnoreCase("Cheese Pizza ")){
System.out.println("Cheese_Pizza  with chilli flakes will arrive in 15 minutes");}
if(v.equalsIgnoreCase("Margherita Pizza")){
System.out.println("Margherita Pizza with Berry Blast will arrive in 20 minutes");}
if(v.equalsIgnoreCase("Panner Pizza")){
System.out.println("Panner Pizza with Fries and ketchup will arrive in 25 minutes");}
if(v.equalsIgnoreCase("Pepperoni Pizza")){
System.out.println("Pepperoni Pizza with chilli flakes and coke will arrive in 25 minutes");}}
public static void Shopping_Center(){
System.out.println("Which store ");
for(int i=1;i<=4;i++){
System.out.println("\n1.Clothing_store \n2.Electronic_store \n3.Home_appliances \n4.Exit");
String h=s.next();
switch(h){
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
}}}
public static void Clothing_Store(){
System.out.print("\n1.Frock \n2.Lehanga \n3.Jeans \n4.Shirts");
System.out.print("\nDress Chose:");
s.nextLine();
String j=s.nextLine();
if(j.equalsIgnoreCase("Frock")){
System.out.println("Frock is packed ");
}if(j.equalsIgnoreCase("Lehanga")){
System.out.println("Lehanga is packed");}
if(j.equalsIgnoreCase("Jeans")){
System.out.println("Jeans is packed");}
if(j.equalsIgnoreCase("Shirts")){
System.out.println("Shirt is packed");}}
public static void Electronic_Store(){
System.out.println("\n1.Tv \n2.Washing_machine \n3.Ac \n4.Fridge");
System.out.println("Electronic item picked");
s.nextLine();
String k=s.nextLine();
if(k.equalsIgnoreCase("Tv")){
System.out.println("Television is packed");}
if(k.equalsIgnoreCase("Washing machine")){
System.out.println("Washing machine is packed");}
if(k.equalsIgnoreCase("Ac")){
System.out.println("Ac is packed");}
if(k.equalsIgnoreCase("Fridge")){
System.out.println("Fridge is packed");
}}
public static void Home_Appliances(){
System.out.println("\n1.Sofa \n2.Stool \n3.Table \n4.Chair");
System.out.println("Item picked");
s.nextLine();
String l=s.nextLine();
if(l.equalsIgnoreCase("Sofa")){
System.out.println("Sofa is packed");}
if(l.equalsIgnoreCase("Stool")){
System.out.println("Stool is packed");}
if(l.equalsIgnoreCase("Table")){
System.out.println("Table is packed");}
if(l.equalsIgnoreCase("Chair")){
System.out.println("Chair is packed");}}
public static void Fun_city(){
System.out.print("\nDo you have a Play card[Y/N]? ");
String ps=s.next();
while(true){
if(ps.equalsIgnoreCase("Y")){
System.out.print("\nEnter your play points ");
int pp=s.nextInt();}
else if(ps.equalsIgnoreCase("N")){
System.out.print("\nDo you want to buy a new one???[Y/N] ");
String f=s.next();
if(f.equalsIgnoreCase("Y")){
System.out.print("\nNew card costs 100 with 100 playpoints.Do you want to buy it?[Y/N] ");
String g=s.next();
if(g.equalsIgnoreCase("Y")){
System.out.print("\nEnter amount[100]: ");
int er=s.nextInt();
System.out.print("Here is your card");
}else{
return;}
}else{
System.out.print("\nSorry,no games cannot be played without this card");
return;}
}else{
return;}
System.out.print("\nDo you want to add playpoints??[Y/N] ");
String add=s.next();
if(add.equalsIgnoreCase("Y")){
System.out.print("\nEnter the amount to get points: ");
int io=s.nextInt();
System.out.print("\nEntering Game Space");}
else if(add.equalsIgnoreCase("N")){
System.out.print("\nOkay");
System.out.print("\nEntering Game Space");}
else{
System.out.print("\nEnter valid Answer");}
for(int i=1;i<=5;i++){
System.out.print("\n1.Shooting Stars \n2.Lottery \n3.Scary House[Under Development] \n4.Toy Picker[Under Development] \n5.Let's Leave");
System.out.print("\nEnter an option:");
int nb=s.nextInt();
switch(nb){
case 1:
Shooting_Stars();
break;
case 2:
Lottery();
break;
case 5:
System.out.print("\nLeave!");
return;
default:
System.out.print("\nEnter valid option");
}}}}
public static void Shooting_Stars() {
System.out.println("\nEnter your stars[MAX:70]:");
int stars=s.nextInt();
for(int i=1;i<=stars;i++){
for(int j=1;j<=stars-i;j++){
System.out.print("");}
 for (int k = 1; k <= 2 * i - 1; k++){
System.out.print("*");}
System.out.println();}}
public static void Lottery(){
Random r=new Random();{
String[] qo={"Oops,Better luck next time","Not your Day Champ","Hard Luck :)","Congratulations you are the Lucky one!!!!! \nToday's luck is in your hands","Don't lose your hope.\nLuck is not in your hands","Bad luck","You Won! But the cash is 0","Next time Foe","Nope,Sorry Comeback later","You did not catch it up"};
System.out.println("\nEnter your number[1-10] :");
int luck=s.nextInt();
if(luck>=1 && luck<=10){
int quite=r.nextInt(qo.length);
System.out.print(qo[quite]);
}else{
System.out.println("Enter valid number!!!");}}}}
