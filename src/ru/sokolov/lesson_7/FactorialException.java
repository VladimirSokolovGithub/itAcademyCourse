package ru.sokolov.lesson_7;

//Написание собственных исключений

public class FactorialException extends Exception {
    private int num;

    public int getNum(){
        return num;
    }

    public FactorialException(String msg, int num){
        super(msg);
        this.num = num;
    }
}

class FactorialCalc {
    static int calcFactorial(int n) throws FactorialException {
        int res = 1;

        if(n < 1) {
            throw new FactorialException("Число не может быть меньше 1", n);
        }

        for (int i = 1; i <= n ; i++) {
            res *= i;
        }
        return res;
    }
}

class MainException {
    public static void main(String[] args) {
        try {
            int res = FactorialCalc.calcFactorial(-10);
            System.out.println(res);
        } catch (FactorialException e) {
            e.printStackTrace();
            System.out.println(e.getNum());
            System.out.println(e.getMessage());
        }
    }
}

