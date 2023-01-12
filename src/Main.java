import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
//        List<String> students = new ArrayList<>();

        names.add("Bob");
        names.add("Sarah");
        names.add("Sarah");
        names.add("Sarah2");
        names.add("Sarah3");


//        System.out.println(names);
//        System.out.println(names.size());
//        names.clear();

//        System.out.println(names.get(0));

//        names.remove("Sarah");
//        System.out.println(names);
//        System.out.println(names.size());

//        System.out.println(names.indexOf("Bob"));
//
//
//        for(int i =0; i < names.size(); i++){
//            System.out.println(names.get(i));
//        }

        Map<String, String> emailList = new HashMap<>();
        emailList.put("Peter Parker", "peter@parker.com");
        emailList.put("Bruce Banner", "bruce@banner.com");
        emailList.put("Stephen Strange", "stephen@strange.com");

        System.out.println(emailList.get("Peter Parker"));
        System.out.println(emailList.containsKey("Banner"));
        System.out.println(emailList.containsValue("stephen@strange.com"));

    }

}