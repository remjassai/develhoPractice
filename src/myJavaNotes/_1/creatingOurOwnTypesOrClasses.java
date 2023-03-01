package myJavaNotes._1;

public class creatingOurOwnTypesOrClasses {

    //To modify all the instances of a variable in your code press: shift + F6
    //For the restaurant project I need a scanner a while and switch case to make it interactive
    //to see all the usages of a class, method or variable across the whole project, and quickly navigate to the selected item. Place the caret at a symbol and press option+command+F7


        public static void main(String[] args) {
            lunch todaysLunch = new lunch();
            lunch tomorrowLunch = new lunch();

            todaysLunch.nameOfDayEaten ="Sunday";
            //tomorrowLunch.nameOfDayEaten= "Monday";  //We comment this and handle the null with an if statement under the printLunch method
            printLunch(todaysLunch);
           // printLunch(tomorrowLunch);
            todaysLunch.printLunchPrice();
            tomorrowLunch.printLunchPrice();


            tomorrowLunch.price = 100;
            System.out.println("New price for tomorrows lunch is " + tomorrowLunch.price);
        }

        static void printLunch(lunch lunch) {
            if(lunch.nameOfDayEaten == null){
                System.out.println("Lunch name is null, cannot print");
            }else{
                System.out.println("Lunch price="+lunch.price + ", and the name of the day is " + lunch.nameOfDayEaten.toLowerCase());
            }


        }

}
