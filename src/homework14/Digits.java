package homework14;

import java.util.ArrayList;
import java.util.List;

public class Digits {

        String[] number0 = {"  $$$$   ", "$$    $$", "$$    $$", "$$    $$", "  $$$$   "};
       String[] number1 = {"  $$  "," $$$  ","$ $$  ","  $$  ","$$$$$$"};
       String[] number2 = {" $$$$ ","$$  $$","   $$ ","  $$  ","$$$$$$"};
   String[] number3 = {" $$$$ ","$$  $$","   $$ ","    $$"," $$$$ "};
      String[] number4 = {"$   $$","$   $$","$$$$$$","    $$","    $$"};
       String[] number5 = {"$$$$$$","$$    ","$$$$$ ","    $$","$$$$$ "};
       String[] number6 = {" $$$$$","$$    ","$$$$$ ","$$  $$"," $$$$ "};
       String[] number7 = {"$$$$$$","   $$ ","  $$  "," $$   ","$$    "};
       String[] number8 = {" $$$$ ","$$  $$"," $$$$ ","$$  $$"," $$$$ "};
       String[] number9 = {" $$$$$","$$  $$"," $$$$$","    $$"," $$$$ "};



    void printNumber(String[]number){
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
