class language
{
    String lan="all language";
    static class tamil
    {
        int people;
        String name="Tamizhan";
         public String returnname()
         {
            return name;
         }
    }
    static class Hindi
    {
        int people;
        String name="Hindi";
         public String returnname()
         {
            return name;
         }
    }
}
public class day10_staticnestedclass {
    public static void main(String[] args) {
        language.tamil t=new language.tamil();
        language.Hindi h=new language.Hindi(); 
        System.out.println(t.returnname());
        System.out.println(h.returnname());

    }
}
