package SampleTest;

import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Automation {

    public static void main(String[] args) throws FindFailed, InterruptedException {


        ImagePath.setBundlePath(System.getProperty("user.dir")+"/src/test/java/imgs");
        Screen s = new Screen();
        Pattern pattern=new Pattern(System.getProperty("user.dir")+"/src/test/java/imgs/AUT_logo.png");
        s.find(pattern);
        s.click();
        s.wait(5000);

    }


}
