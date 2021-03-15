import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.concurrent.TimeUnit;



public class ascii_animation {
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public static void animation() throws FileNotFoundException, InterruptedException{

        // String[] image = {"hellow"," hellow","    hellow","    hellow","    hellow","      hellow","       hellow","        hellow"};
        // for(int i = 0; i<length; i++){
        //     for(int j = 0; j<length; j++){

        //     }
        // }

        File raw_data = new File("D:/Academics/2nd Semester/Software Development/test.txt");
        Scanner s = new Scanner(raw_data);
        String content = s.nextLine();
        int count = 0;
        while(s.hasNextLine()){
            System.out.println(s.nextLine());
            count++;
            if(count%142 == 0 && count != 307430){
                clearScreen();
                Thread.sleep(33);
            }
        }

        System.out.println("COUNT: " + count);
    //     for(int i = 0; i<8;i++){
    //         clearScreen();
    //         System.out.println(content);
    //         try {
    //             Thread.sleep(33);
    //         } catch (InterruptedException e) {
    //             // TODO Auto-generated catch block
    //             e.printStackTrace();
    //         }
    //     }
       }

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        animation();
    }



}
