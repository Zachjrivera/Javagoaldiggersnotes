package returndemo;

import javax.lang.model.element.NestingKind;

public class Demo {

    public String name;
    private String nickName;
    public long grsde;
    public char gender;
   public int age;





   public Demo(String name,int age,char gender)
    {
        this.name = name;
        this.age =age;
        this.gender = gender;
    }


    public String getNickName()
    {
        return nickName;
    }

    public void setNickName(String n)
    {
        this.nickName=n;
    }



    public String writeCode()
    {
        return "Student codes in java";
    }


    public String swipesForFatChicksOnTinder(String name)
    {
        return name +" be lovin fat bitches ";
    }








}
