package base.PageObjects;

public class pages {
    //// reverse sttring
//        String value = "stringreverse";
//        String revVal = "";
//        for (int i = 0; i < value.length(); i++){
//            revVal = Character.toString(value.charAt(i)) + revVal;
//        }
//        System.out.println(revVal);
    //// swap two numbers
//        int a = 7;
//        int b = 30;
//
//        a = b + a;//37
//        b = a - b;//7
//        a = a - b;//30
//        System.out.println("a = "+a+" b = "+b);
//        ////vowel is present in string
//        String val = "hello";
//        char [] nam = val.toCharArray();
//        char [] vowels = {'a','e','i','o','u'};
//        boolean flag = false;
//        for (int i = 0; i <= val.length()-1;i++){
//            for(int j = 0; j <= vowels.length-1;j++){
//                System.out.println(nam[i]);
//                if(nam[i] == vowels[j]){
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag){
//                break;
//            }
//        }
//        System.out.println(flag);
//        // print prime number or not 2,3,5,7,11,13
//        Scanner sc = new Scanner(System.in);
//        int val = sc.nextInt();
//        boolean lag = true;
//        for(int i = 2; i< val;i++) {
//            if (val % i == 0) {
//                lag = false;
//            }
//        }
//        if (lag) {
//            System.out.println("prime number only");
//        } else {
//            System.out.println("not prime number");
//        }
    // fabinoki series between 100 1,1,2,3,5,8,13,21
//            int fistval = 1;
//            int secondval = 1;
//            int n = 0;
//            int sumnext;
//            System.out.println(fistval);
//            System.out.println(secondval);
//            for (int i = 0; n<100;i++) {
//                sumnext = fistval + secondval;
//                System.out.println(sumnext);
//                fistval = secondval;
//                secondval = sumnext; //next iterator it will be going sum of the first and second
//                n = sumnext;
//            }
    // given numbers are odd or not
//        int [] n = {2,3,4,6,7,8};
//        for (int i = 0; i< n.length-1;i++) {
//            if(n[i] % 2 != 0) {
//                System.out.println("Odd number " + n[i]);
//            }
//        }
//        // palindrome of a string
//        String  name = "gun";
//        String revVal = "";
//        for (int i = 0; i < name.length(); i++){
//            revVal = name.charAt(i) + revVal;
//        }
//        if (name.equals(revVal)){
//            System.out.println("its palindrome");
//        } else{
//            System.out.println("not palindrome");
//        }
//        // remove white soace on the string
//        String name = "i am a software deveoper";
//        char [] arr = name.toCharArray();
//        String retunn = "";
//        for(char val : arr){
//            if (!Character.isWhitespace(val)){
//                retunn = retunn + Character.toString(val);
//            }
//        }
//        System.out.println(retunn);
    // Reverse in linked list
//        LinkedList<Integer> l1 = new LinkedList<Integer>();
//        l1.add(10);
//        l1.add(20);
//        l1.add(30);
//        int siz = l1.size();
////        System.out.println(l1.get(0));
//        for(int i = siz-1; i >= 0; i--){
//            System.out.println(l1.get(i));
//        }
//        //  second largest number in an array in Java?
//        int [] arr = {4,5,1,10,1,3};
//        int num = Integer.MIN_VALUE;
//        int count = 0;
//        for (int i : arr){
//            if(i > num){
//                num = i;
//                count++;
//            }
//            if(count == 2){
//                System.out.println("Second largest value in the array" + i);
//                break;
//            }
//        }
//        // chage a word in paragraph
//        String val = "i am wod have a 3 word years of experience word so im a developer word";
//        String [] arr= val.split(" ");
//        String finalou = "";
//        for (String wd : arr){
//            if (wd.equals("word")){
//               finalou = finalou + " changed";
//            } else {
//                finalou = finalou + " " + wd;
//            }
//        }
//        System.out.println(finalou);
    // remove duplicate in the string
//       String val = "remoooooveeee";
//       char [] arr = val.toCharArray();
//       String finalval = "";
//       for(char s : arr){
//           if(!finalval.contains(""+s)){
//               finalval = finalval + Character.toString(s);
//           }
//       }
//       System.out.println("String val :" + finalval);
    //given string having how many letters to fibd
//        char [] value = "removeee".toCharArray();
//        String indletter="e";
//        int count = 1;
//        for(int i = 0; i < value.length-1;i++) {
//            if (indletter.contains(""+value[i])){
//                count++;
//            }
//        }
//        System.out.println(count);
//        //armstrong 153 1 cube 5 cube 3 cube
//        int givenint = 153;
//        int lastdigit = 0;
//        int mathh = 0;
//        int armstrong = 0;
//        int temp = givenint;
//        while(temp > 0) {
//            lastdigit = temp % 10;
//            mathh = (int) Math.pow(lastdigit, 3);
//            armstrong = armstrong + mathh;
//            temp = temp/10;
//        }
//        System.out.println(armstrong);
    // print prime number in line 20
//        Boolean flag;
//        for (int i = 2; i < 30; i++){
//             flag = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    flag = false;
//                }
//            }
//            if (flag){
//                System.out.println(i);
//            }
//        }
//        // a2b3c4
//        String givenStr = "a2b5c7";
//        String value = "";
//        String finalvaol = "";
//        char []arr = givenStr.toCharArray();
//        for (int i = 0; i < arr.length;i++){
//            if(Character.isAlphabetic(arr[i])){
//                value = Character.toString(arr[i]);
//            } else {
//                for (int j = 0; j < Integer.parseInt(Character.toString(arr[i])); j++){
//                    finalvaol = finalvaol + value;
//                }
//            }
//        }
//        System.out.println(finalvaol);
//        // how to sort array without using array.sort() function
//        int [] arr = {2, 1, 3,7,6,};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int tmp = 0;
//                if (arr[i] > arr[j]) {
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        for (int i : arr) {
//            System.out.println(i);
//        }
//        //[] array calculation
//            int [] arr = {2,3,4,6,7};
//            int [] arrtwo = new int[arr.length];
//            int val = 0;
//            for (int i =0 ; i < arr.length;i++){
//                for (int j = 0; j<arr.length;j++) {
//                    if(i != j){
//                        val = val + arr[j];
//                    }
//                }
//                arrtwo[i] = val;
//                val = 0;
//            }
//            System.out.println(Arrays.toString(arrtwo));
}
