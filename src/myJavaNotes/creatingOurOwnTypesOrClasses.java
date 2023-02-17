package myJavaNotes;

import java.time.LocalDate;
import java.util.Date;

public class creatinOurOunTypesOrClasses {


    //To modify all the instances of a variable in your code press: shift + F6



        public static void main(String[] args){
            Lunch todayLunch = new Lunch();
        }

        static void printlunch(Lunch lunch){
            System.out.println("Lunch price"+ lunch.price);
        }
}
