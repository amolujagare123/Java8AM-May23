package Inheritance.PolymorphismDemo;

class TvShowroom
{
     void channels()
    {
        System.out.println("Showroom channels");
    }
    void volume()
    {
        System.out.println("Showroom volume");
    }
    void setting()
    {
        System.out.println("Showroom setting");
    }
}

class LG extends TvShowroom
{
    @Override
    void channels()
    {
        System.out.println("LG channels");
    }
    void volume()
    {
        System.out.println("LG volume");
    }
    void setting()
    {
        System.out.println("LG setting");
    }
}

class Samsung extends TvShowroom
{
    void channels()
    {
        System.out.println("Samsung channels");
    }
    void volume()
    {
        System.out.println("Samsung volume");
    }
    void setting()
    {
        System.out.println("Samsung setting");
    }
}

class Onida extends TvShowroom
{
    void channels()
    {
        System.out.println("Onida channels");
    }
    void volume()
    {
        System.out.println("Onida volume");
    }
    void setting()
    {
        System.out.println("Onida setting");
    }
}


public class TestOverriding {

    public static void main(String[] args) {
         TvShowroom tv = new LG();
         tv.channels();
         tv.volume();
         tv.setting();

        tv = new Onida();
        tv.channels();
        tv.volume();
        tv.setting();
    }
}
