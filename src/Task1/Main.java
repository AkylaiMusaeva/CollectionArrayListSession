package Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>animals=new ArrayList<>(List.of("cat","dog","horse","dog"));
        for(int i=0;i< animals.size();i++){
            for(int j=i+1;j< animals.size();j++){
                if(animals.get(i).equals(animals.get(j))){
                    animals.remove(animals.get(i));
                }
            }

        }
        System.out.println(animals);
    }
}
