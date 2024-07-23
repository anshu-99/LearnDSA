package InheritencePractice;

public class Male extends Human {
    String name;
    String placeOfBirth;

    Male(String name, String placeOfBirth,double height,double weight,String gender){
        this.gender=gender;
        this.height=height;
        this.weight=weight;
        this.name=name;
        this.placeOfBirth=placeOfBirth;
    }
    protected void showDetails(){
        System.out.println("Name is:"+this.name+"\nPlace of Birth is:"+this.placeOfBirth);
        System.out.println("Gender:"+this.gender+"\nHeight:"+this.height+"\nWeight:"+this.weight);
        eating();
        sleeping();
    }
}
