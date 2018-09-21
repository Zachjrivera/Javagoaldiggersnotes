package returndemo;

public class Dog {
    public String breed;
    public int age;
    public String name;
    private int weight;
    protected String heart = "Heart";

    // 2 methods 1 private 2nd public  in side public method  call the private method  then  go into main make and obj access properties call public method





    public Dog (String breed,String name,int age)
    {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public Dog ()
    {
        this.breed = breed;
        this.name = name;
        this.age = age;

    }

    public void  setWeight (int lbs)
    {
          this.weight = lbs;
    }

    public  int getWeight ()
    {
        return weight;
    }



    private String bark()
    {
        return "Bark Bark sukkka";
    }


     public String licknuts ()
     {
         return "the dog has a " + heart +  " and he loves to licks his nuts and says " + bark();
     }


}
