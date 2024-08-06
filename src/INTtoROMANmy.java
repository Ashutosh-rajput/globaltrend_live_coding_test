public class INTtoROMANmy {
        public String intToRoman(int num) {
            String res = "";

            while (num >0) {
                if (num - 1000 >= 0) {
                    res = res + "M";
                    num = num - 1000;
                    System.out.println(num);
                }
                else if (num - 100 >= 0) {
                    if (((num % 1000) / 100) >= 9) {
                        res = res + "CM";
                        num = num - 900;
                    }else if(((num % 1000) / 100) >= 5) {
                        res = res + "D";
                        num = num - 500;
                    } else if (((num % 1000) / 100) >= 4) {
                        res = res + "CD";
                        num = num - 400;
                    }  else if(((num % 1000) / 100) < 4) {
                        res = res + "C";
                        num = num - 100;
                    }
                    System.out.println(num);
                } else if (num - 10 >= 0) {
                    if (((num % 100) / 10) >= 9) {
                        res = res + "XC";
                        num = num - 90;
                    }else if (((num % 100) / 10) >= 5) {
                        res = res + "L";
                        num = num - 50;
                    }  else if (((num % 100) / 10) >= 4) {
                        res = res + "XL";
                        num = num - 40;
                    }else if (((num % 100) / 10) < 4) {
                        res = res + "X";
                        num = num - 10;
                    }
                    System.out.println(num);
                } else if (num - 1 >= 0) {
                    if ((num % 10) >= 9) {
                        res = res + "IX";
                        num = num - 9;
                    } else if((num % 10) >= 5) {
                        res = res + "V";
                        num = num - 5;
                    }  else if ((num % 10) >= 4) {
                        res = res + "IV";
                        num = num - 4;
                    } else if ((num % 10) < 4) {
                        res = res + "I";
                        num = num - 1;
                    }
                    System.out.println(num);
                }
            }
            return res;
        }

        public static void main(String[] args) {
//            Solution solution = new Solution();
            INTtoROMANmy inTtoROMANmy =new INTtoROMANmy();
            int num = 1487; // Example input
            String roman = inTtoROMANmy.intToRoman(num);
            System.out.println("The Roman numeral for " + num + " is: " + roman);
        }
    }

