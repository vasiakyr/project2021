import java.util.*;
public class RequestDonationList{
    
    RequestDonation product;
    private List <RequestDonation> rdEntities;
    
    public RequestDonationList(){
        rdEntities=new ArrayList<RequestDonation>();
    }
    
    public Set<RequestDonation>rdEntity;
    public Set<RequestDonation>getEntities(){return this.rdEntity;}
    
    
    public void add(){
    }
    public void reset(){
        rdEntities.remove(product );
    }
    
  
}