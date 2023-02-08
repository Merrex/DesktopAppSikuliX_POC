package SampleTest;

import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Automation {

    public static void main(String[] args) throws FindFailed, InterruptedException {

        ImagePath.setBundlePath("/Users/testvagrant/untitled1/src/test/java/imgs");
        Screen s = new Screen();

        s.find("/Users/testvagrant/untitled1/src/test/java/imgs/one_saathi.png");
        s.click();
        s.wait(5000);

    }


}
