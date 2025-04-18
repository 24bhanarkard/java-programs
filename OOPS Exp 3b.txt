aim: write a java program for calculator using the concept of inheritance(overriding).


class Operation1{
    int a=10,b=20,c=10;
    
    void showab(){
        System.out.println("a and b:" + a +" "+ b);
    }
}

class Operation2 extends Operation1{
    void add(){
        c=a+b;
        System.out.println("addition is:"+c);
    }
}

class Operation3 extends Operation2{
    void sub(){
        c=a-b;
        System.out.println("subtraction is:"+c);
    }
}

class Operation4 extends Operation3{
    void multiply(){
        c=a*b;
        System.out.println("multiplication is:"+c);
    }
}

class Operation5 extends Operation4{
    void divide(){
        c=a/b;
        System.out.println(" division is:"+c);
    }
}

class Operation6 extends Operation5{
    void modulus(){
        c=a%b;
        System.out.println("  modulus is:"+c);
    }
}

class calculator{
    public static void main(String[] args){
        Operation6 s = new Operation6();
        s.add();
        s.sub();
        s.multiply();
        s.divide();
        s.modulus();
    }
}



output:

addition is:30
subtraction is:-10
multiplication is:200
 division is:0
  modulus is:10

file name: calculator

