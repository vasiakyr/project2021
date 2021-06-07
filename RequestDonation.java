import java.util.*;
public class RequestDonation {
    Entity entity;
    double quantity; //ποσότητα
    public RequestDonation(){
    this.entity=entity;
    this.quantity=quantity;
}


public Entity getEntity(){return this.entity;}
public double getQuantity(){return this.quantity;}

public int compare(RequestDonation rd1, RequestDonation rd2){
    if(rd1.getEntity().getId()==rd2.getEntity().getId()){
    return 0;
    }
    else{return 1;}
}
public boolean equals(RequestDonation rd){
    if(this.getEntity().getId()==rd.getEntity().getId()){return true;}
    else{return false;}
}
public void addQuantity(double quantity){
this.quantity=quantity;
}
}