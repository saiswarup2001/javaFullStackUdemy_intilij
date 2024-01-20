package exe;

import java.util.Comparator;

public class phoneDictory implements Comparable<phoneDictory> {
    private  String contactName;
    private  String contactNumber;

    public phoneDictory(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public int compareTo(phoneDictory o) {
        if(this.contactNumber.compareTo(o.contactNumber) == 0){
            return 0;
        } else if (this.contactNumber.compareTo(o.contactNumber) > 0) {
            return 1;
        }else{
            return -1;
        }




    }
}
