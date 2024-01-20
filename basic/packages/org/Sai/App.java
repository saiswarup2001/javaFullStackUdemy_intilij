package packages.org.Sai;

import packages.org.Sai.blog.Java;

public class App {
    public static void main(String[] args) {
        //good coding
        Java blog = new Java();
        blog.usedFor();

        //Bad Coding
        packages.org.Sai.platform.Java platform = new
                packages.org.Sai.platform.Java();

        platform.usedFor();

    }
}
