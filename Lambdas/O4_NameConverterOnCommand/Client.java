package Lambdas.O4_NameConverterOnCommand;

public class Client {
    public static void main(String[] args) {
//        M1-> create a class implementing interface
        String name = "Abhishek Krishna";
        String command = "upper";
        ConvertOperations caseConverter = new CaseConverter();
        String convertedName = caseConverter.convert(name,command);
        System.out.println(convertedName);

//        M2-> Anonymous class
        ConvertOperations convertOperations1 = new ConvertOperations() {
            @Override
            public String convert(String name, String command) {
                if("upper".equalsIgnoreCase(command)){
                    return name.toUpperCase();
                }else if("lower".equalsIgnoreCase(command)){
                    return name.toLowerCase();
                }else{
                    return name;
                }
            }
        };
        String convertedName2 = convertOperations1.convert(name,command);
        System.out.println(convertedName2);

        //        M3-> Anonymous class with lambda
        ConvertOperations convertOperations3 = (n,c)->{
            if("upper".equalsIgnoreCase(c)){
                return n.toUpperCase();
            }else if("lower".equalsIgnoreCase(c)){
                return n.toLowerCase();
            }else{
                return n;
            }
        };
        String convertedName3 = convertOperations3.convert(name,command);
        System.out.println(convertedName3);

//        M4 ->PASS ANYNOMUS FUNCTION TO A FUNCTION.
        String convertedName4 = print(name, command, new ConvertOperations() {
            @Override
            public String convert(String name, String command) {
                if("upper".equalsIgnoreCase(command)){
                    return name.toUpperCase();
                }else if("lower".equalsIgnoreCase(command)){
                    return name.toLowerCase();
                }else{
                    return name;
                }
            }
        });
        System.out.println(convertedName4);

        //        M5 ->PASS ANYNOMUS FUNCTION TO A FUNCTION. + Lambda
        String convertedName5 = print(name, command,(n, c) ->{
                if("upper".equalsIgnoreCase(c)){
                    return n.toUpperCase();
                }else if("lower".equalsIgnoreCase(c)){
                    return n.toLowerCase();
                }else{
                    return n;
                }
            }
        );

        System.out.println(convertedName5);

        //        M6 ->PASS ANYNOMUS FUNCTION TO A FUNCTION.
        //        Leverage CaseConverter Class as it returns Processed String
        //        Pass the Object of this class.
        String convertedName6 = print(name, command,new CaseConverter());

        System.out.println(convertedName6);



    }




//    M4 ->PASS ANYNOMUS FUNCTION TO A FUNCTION.
    public static String print(String name,String command,ConvertOperations convertOperations){
        return convertOperations.convert(name,command);
    }
}
