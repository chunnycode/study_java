package PassByReference;

public class PassByReferenceCheck {

    public static void main(String[] args){

        PassByReferenceCheck temp = new PassByReferenceCheck();
        Sugar sugar = new Sugar(9);

        System.out.println(sugar);
        System.out.println(sugar.getValue());

        temp.process(sugar);

        System.out.println(sugar);
        System.out.println(sugar.getValue());
    }

    public void process(Sugar sugar){
        sugar.setValue(10);
        System.out.println(sugar);
        System.out.println(sugar.getValue());

        sugar = new Sugar(15);
        System.out.println(sugar);
        System.out.println(sugar.getValue());
    }

}

class Sugar {
    private int value;

    public Sugar(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

}