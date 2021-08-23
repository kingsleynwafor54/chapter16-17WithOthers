package BimGenerator;

import java.util.Scanner;

public class BimGenerator {

        private String name;
        private int age;
        private String gender;
        private double height;
        private double weight;
        Scanner input = new Scanner(System.in);

        public void setName(String name){
            this.name = name;
            System.out.println("Hello, please Enter your name");
            this.name = input.next();
            System.out.println("Hello" +" " + this.name);
        }

        public String getName() {
            return name;
        }

        public void setAge(int age){
            System.out.println("How old are you?");
            age = input.nextInt();
            this.age = age;
        }

        public void setGender(String gender){
            System.out.println("Enter your gender");
            gender = input.next();
            this.gender = gender;
        }


        public void setHeight(double height){
            this.height = height;
        }



        public double getHeight() {
            return height;
        }
        public double getWeight(){
            return weight;
        }
        public void setWeight(double weight){
            System.out.println("Enter Weight in kilograms");
            weight = input.nextDouble();
            this.weight = weight;
        }

        public void setFullInfo(){
//            setName(name);
//            setAge(age);
//            setGender(gender);
            calculateHeight();
            setWeight(weight);

        }
        public String toString(){
            System.out.println();
            return (name + "\n"+ "Your BMI is " + this.bmi());
        }
        public double bmi() {

            double bmi = getWeight() / (Math.pow(getHeight(), 2));
            System.out.println("Your bim is "+ getHeight());

            if (bmi < 18.5) {
                System.out.println("Underweight");
            }
            if (bmi >= 18.5 && bmi <= 24.5) {
                System.out.println("Normal");
            }
            if (bmi >= 25 && bmi < 30) {
                System.out.println("Underweight");
            } else if (bmi >= 30){
                System.out.println("Obese");
            }
            System.out.println("BMI VALUES");
            System.out.println("Underweight: \tless than 18.5");
            System.out.println("Normal: \tbetween 18.5 and 24.9");
            System.out.println("Overweight: \tbetween 25 and 29.9");
            System.out.println("Obese: \t\t30 or greater");
            return bmi;
        }
        public void calculateHeight(){
            System.out.println("Enter one(1) for Height in meters or two(2) feet");
            int heightInput = input.nextInt();

            switch (heightInput){
                case 1:

                    System.out.println("Enter height in meters");
                    double heightMachine = input.nextDouble();
                    setHeight(heightMachine);
                    System.out.println(getHeight());
break;


                case 2:
                    System.out.println("Enter height in foot");
                   double heightMachine1 = input.nextDouble();
                    double heightMax=heightMachine1*0.0305;
                     setHeight(heightMax);
                    System.out.println(getHeight());
break;
                default:
                    System.out.println();


            }
        }

        public void calculateWeight(){

        }
        public static void main(String[] args) {
            BimGenerator bmiCalculator = new BimGenerator();
            Scanner userInput = new Scanner(System.in);
            int input;
            System.out.println("""
                Welcome to Jay's Bmi calculator
                Best Wishes
                                
                please press 1 to continue or 2 to cancel
                """);
            input = userInput.nextInt();

                switch (input) {
                    case 1 -> {
                        bmiCalculator.setFullInfo();
//                        System.out.println();
           //             System.out.println(bmiCalculator);
                        System.out.println(bmiCalculator.bmi());
                        System.out.println(bmiCalculator);

                    }
                    case 2 -> {
                        input = 1;

                    }


                }
            }

        }


