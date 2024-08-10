public class main {

    public static void main(String[] args) {
        user ur = new user();
        ur.age = 20;
        ur.Name = "pa";
        ur.Gender = "Male";
        System.out.println(ur.age + "  " + ur.Name + "  " + ur.Gender);
        ur.Walk();

        user ap = new user();
        ap.age = 49;
        ap.Name ="xyz";
        ap.Gender="female";
        System.out.println(ap.age+" "+ap.Name+" "+ap.Gender);



        user pa = new user();
        pa.age=20;
        pa.Name="ABc";


    }
}