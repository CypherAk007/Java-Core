package Lambdas.O4_NameConverterOnCommand;

public class CaseConverter implements ConvertOperations{
    @Override
    public String convert(String name,String command){
        if("upper".equalsIgnoreCase(command)){
            return name.toUpperCase();
        }else if("lower".equalsIgnoreCase(command)){
            return name.toLowerCase();
        }else{
            return name;
        }
    }
}
