public class SString {
    public static void main(String[] args) {
        String name ="Strathmore University";
        System.out.println(name.length());
        System.out.println(name.substring(3, 7));
        System.out.println(name.charAt(10));
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf("th"));

        String s1 = "java";
        String s2 = "Java";
        boolean eq = s1.equals(s2);
        System.out.println(eq);
        String s3 = s1.concat(s2);
        System.out.println(s3);

        StringBuilder brand = new StringBuilder("Nike");
        brand.append(" Carl");
        brand.append(" ");
        brand.append("World");
        System.out.println(brand.toString());

        brand.insert(5,",");
        System.out.println(brand.toString());

        brand.replace(7, 12, "there");
        System.out.println(brand.toString());

        brand.delete(12,brand.length());
        System.out.println(brand);

        

    }
    
}
