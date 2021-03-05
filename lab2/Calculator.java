class Calculator{

public static void main(String[] args){

int a =Integer.parseInt(args[0]);
String operator=args[1];
int b =Integer.parseInt(args[2]);
int ans=0;

if (operator.equals("+")){
ans=a+b;
}else if (operator.equals("-")){
ans=a-b;
}else if (operator.equals("*")){
ans=a*b;
}else if (operator.equals("/")){
ans=a/b;
}else{
System.out.println("Error");
}
System.out.println(ans);
}
}