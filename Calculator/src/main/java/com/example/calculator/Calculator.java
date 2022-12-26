package com.example.calculator;


public class Calculator {
   protected Object calculation(long a, long b, String operation) {
      double g = (double) a;
      double e = (double) b;

        switch (operation) {
            case "+":
                return g + e;
                case "-":
                    return a - b;
                    case "*":
                        return a * b;
                        case"/":
                        if(e == 0.0) return 0;
                        Double o = g / e;
                         if(g%e == 0){
                             if(g == e){return Long.parseLong(String.valueOf(o).replaceAll("[.0]",""));
                             }
                             String reg = String.valueOf(o);
                             StringBuilder buffer = new StringBuilder(reg);
                             buffer.delete(reg.indexOf("."), reg.length());
                             reg = buffer.toString();
                             return  Long.parseLong(reg);
                         }else{
                             return o;
                         }


        }
        System.out.println("Неизвестный оператор" + operation);
        return 0;

    }

}

