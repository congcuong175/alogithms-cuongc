import Entity.Menu;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Bai23printMenu {
    public void printMenu(){
        Gson gs=new Gson();
        Menu[]menus=null;
        try {
            FileReader reader=new FileReader("C:\\Users\\CongCuong\\IdeaProjects\\alogithms-cuong\\src\\menu.json");
            menus=gs.fromJson(reader,Menu[].class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Menu mn:menus){
            if(mn.getParent_id()==0){
                System.out.println(mn.getTitle());
                for (Menu mn2:menus){
                    if(mn2.getParent_id()==mn.getId()){
                        System.out.println("--"+mn2.getTitle());
                        for (Menu mn3:menus){
                            if(mn3.getParent_id()==mn2.getId()){
                                System.out.println("----"+mn2.getTitle());
                            }
                        }
                    }
                }
            }

        }
    }
}
