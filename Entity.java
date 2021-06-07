public abstract class Entity{
   //details for the items
        private String name; 
        private String description;
        private int id;
         
    public void setName(String name){
        this.name =name;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public int getId() {
        return this.id;
    }
    public String getEntityInfo(){
        return "name: " + this.getName()+"description: " + this.getDescription()+ "id: "+ this.getId(); 
    }
   
    
    abstract public String getDetails();
    
    public String toString(){
        return this.getEntityInfo()+this.getDetails();
   }
   abstract public String getType();
}