import java.util.Locale;

public class phone {

    private int ram;
    private String model;
    private String camera;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(model.equals("nord") || model.equals("9promax")){
            this.model = model;
        }else{
            this.model = "Unkmown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
