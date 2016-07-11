import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jugraj Singh on 10-07-2016.
 */
public class Main {
    public static void main(String args[]){
        try {
            File input = new File("C:\\Users\\Jugraj Singh\\Documents\\Projects\\input.in");
            Scanner in = new Scanner(input);
            int testcase = Integer.parseInt(in.nextLine());
            //int temp = Integer.parseInt(in.nextLine());
            //new Challenge(in.nextLine());
            for(int i=0;i<testcase;i++){
                int number = Integer.parseInt(in.nextLine());
                List<String> list = new ArrayList<>();
                for(int j=0;j<number;j++){
                    list.add(in.nextLine());
                }
                FileUtils.writeStringToFile(new File("out.out"),"Case #"+(i+1)+": "+new Challenge(list)+"\n",true);
                //System.out.println("Case #"+(i+1)+": "+new Challenge(list));
                //Challenge c = new Challenge(list);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
