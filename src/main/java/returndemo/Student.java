package returndemo;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Student {
    public String name;
    public int age;
    private String nickName;
    private long grade;
    public char gender;


    //make get set for all and call shit

    public Student(String name, int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public String getNickName()
    {
        return nickName;
    }

    public void setNickName(String n)
    {
        this.nickName = n;
    }


    public long getGrade ()
    {
        return grade;
    }

    public void setGrade(long x)
    {
        this.grade = x;
    }

    public String writeCode()
    {
        return "Student codes in java";
    }

    public String helpOthers ()
    {
        return name + " Helps Others when he can";
    }


    public String needsToWakeUp (String name)
    {
        return name +" needs to wake the fuck up. ";
    }







}
