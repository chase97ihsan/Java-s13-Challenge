package employeeApp.enums;

public enum Plan {

    CHECKUP("Normal",1000),
    FULLCHECKUP("Full",2000);

     private String packet;
     private int price;
    Plan(String packet,int price){
      this.packet=packet;
      this.price=price;
    }
    public String getPacket() {
        return packet;
    }
    public int getPrice() {
        return price;
    }
}
