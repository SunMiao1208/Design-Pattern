package StrategyPattern;

public class HoliBlade implements ICutFruit {

    public void CutStrategy(String fruitname){
    	System.out.println(fruitname+"一次被切成几片");
    }

}
