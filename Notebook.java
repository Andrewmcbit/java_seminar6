
public class Notebook {
    
    private String model;
    private Integer ram;
    private Integer hdd;
    private String os;
    private String colour;

    // конструктор
    public Notebook(String model, Integer ram, Integer hdd, String os, String colour){ 
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
    }

    @Override
    public String toString(){
        return "Model: " + model + ", Ram: " + ram + " gb, HDD: " + hdd + " gb, OS: " + os + ", Colour: " + colour + ".";
    }

    public void findRam(int inputRam) {
        if (inputRam == ram){
            System.out.println("Model: " + model + ", Ram: " + ram + " gb, HDD: " + hdd + " gb, OS: " + os + ", Colour: " + colour + ".");
        }
    }
    public void findHdd(int inputHdd){
        if (inputHdd == hdd){
            System.out.println("Model: " + model + ", Ram: " + ram + " gb, HDD: " + hdd + " gb, OS: " + os + ", Colour: " + colour + ".");
        }
    }
    public void findOS(String inputOS){
        if (inputOS.equals(os)){
            System.out.println("Model: " + model + ", Ram: " + ram + " gb, HDD: " + hdd + " gb, OS: " + os + ", Colour: " + colour + ".");
        }
    }
    public void findColour(String inputColour){
        if (inputColour.equals(colour)){
            System.out.println("Model: " + model + ", Ram: " + ram + " gb, HDD: " + hdd + " gb, OS: " + os + ", Colour: " + colour + ".");
        }
    }
}
