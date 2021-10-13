public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();

        //heygfdg

        // in ket qua BMI tra ve void 
        app.voidBMICalc();
        
        // in ket qua BMI tra ve double ko tham so 
        System.out.println("ket qua BMI tra ve double ko tham so: " + app.doubleBMICalc());

        // in ket qua BMI tra ve double co tham so 
        System.out.println("ket qua BMI tra ve double co tham so: " + app.doubleBMICalcWithPara(1.70, 70));

        Person Popo = new Person();
        Popo.name = "Popo";
        Popo.height = 1.56;
        Popo.weight = 53;
        Popo.printBMI();

        Person MoMo = new Person();
        MoMo.name = "Momo";
        MoMo.weight = 79;
        MoMo.height = 1.78;
        MoMo.printBMI();
    }

    public void voidBMICalc(){
        double height = 1.65;
        double weight = 60;
        double BMIResult = weight / (height * height);
        System.out.println("ket qua BMI tra ve void: " + BMIResult);
    }

    public double doubleBMICalc(){
        double height = 1.54;
        double weight = 54;
        return weight / (height * height);
    }

    public double doubleBMICalcWithPara(double height, double weight){
        return weight / (height * height);
    }
}
