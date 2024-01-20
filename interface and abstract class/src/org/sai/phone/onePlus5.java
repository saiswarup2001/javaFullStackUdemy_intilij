package org.sai.phone;

public class onePlus5 implements phone{
    @Override
    public String processor() {
        return "SnapDragon-350";
    }

    @Override
    public String OS() {
        return "OxygenOS";
    }

    @Override
    public int spaceInGb() {
        return 128;
    }
}
