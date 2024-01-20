package org.sai.phone;

public class IPhone8 implements phone{
    @Override
    public String processor() {
        return "A11";
    }

    @Override
    public String OS() {
        return "IOS";
    }

    @Override
    public int spaceInGb() {
        return 64;
    }
}
