public class string{
    public static void main(String[] args) {
        String  name="maha";// and other way to create string object is new String("maha")
        System.out.println("Name:"+name);
        //string is immutable
        String name1="maha";
        System.out.println("Name:"+name);
        System.out.println(name == name1); //true because both name and name1 are pointing to the same string literal in the string pool
    }
}