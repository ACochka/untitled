public class Task3 {
    public static void main(String[] args){

        int [] arr1 = {9, 8, 7, 6};
        int [] arr2 = {4, 4, 3, 1};

        System.out.println("solutions " + solutions(1, 0, 0));
        System.out.println("findZip " + findZip("all zip files are zipped"));
        System.out.println("checkPerfect " + checkPerfect(496));
        System.out.println("flipEndChars " + flipEndChars("Cat, Cdog, and mouse."));
        System.out.println("isValidHexCode " + isValidHexCode("CD5C5C"));
        System.out.println("same " + same(arr1, arr2));
        System.out.println("isKaprekar " + isKaprekar(3));
        System.out.println("longestZero " + longestZero("11111"));
        System.out.println("nextPrime " + nextPrime(24));
        System.out.println("rightTriangle " + rightTriangle(70, 130, 110));




    }



    public static int solutions(int a, int b, int c){
        if (b * b - 4 * a * c > 0){
            return 2;
        } else if (b*b - 4*a*c == 0) {
            return 1;
        } else{
            return 0;
        }
    }

    public static int findZip(String str){

        if (str.indexOf("zip", str.indexOf("zip") + 1) != -1){
            return str.indexOf("zip", str.indexOf("zip") + 1);
        }else {
            return -1;
        }

    }

    public static boolean checkPerfect(int n){
        int sum = 1;
        for (int i = 2; i <= (n/2); i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum == n;

    }

    public static String flipEndChars(String str){
        char[] arraystring = str.toCharArray();
        char temp = arraystring[0];
        arraystring[0] = arraystring[str.length() - 1];
        arraystring[str.length() - 1] = temp;
        return new String(arraystring);
    }


    public static boolean isValidHexCode(String hex){
        boolean flag = false;
        char[] litterals = {'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f'};
        if(hex.charAt(0) == '#' & hex.length() == 7){
            for(char a: hex.toCharArray()){
                if ((a >= '0' && a <= '9') || (a >= 'a' && a <= 'f') || (a >= 'A' && a <= 'F')){
                    flag = true;
                }else {
                    flag = false;
                }
            }
            return flag;
        }
        return false;
    }

    public static boolean same (int [] arr1, int [] arr2){
        int count1=0;
        int count2=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j <arr1.length; j++) {
                if(arr1[i]==arr1[j]){
                    count1++;
                    i=j;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i+1; j <arr2.length; j++) {
                if(arr2[i]==arr2[j]){
                    count2++;
                    i=j;
                }
            }
        }
        return (arr1.length-count1)==(arr2.length-count2);

    }

    public static boolean isKaprekar (int a){

        int n = (int) Math.pow(a,2);
        int length=Integer.toString(n).length();
        if(length==1){
            int left=0;
            double rigth=n;
            return (left+rigth)==a;
        }
        else {
            int c= (int) Math.ceil(length/2.0);
            int left= (int) (n/Math.pow(10,c));
            int rigth=(int) (n%Math.pow(10,c));
            return (left+rigth)==a;
        }
    }


    public static String longestZero(String string){
        int max = 0;
        int count = 0;
        for(int i = 0; i< string.length(); i++){
            if (string.charAt(i) == '0'){
                count += 1;
            }else{
                count = 0;
            }
            if (count > max){
                max = count;
            }
        }

        String result = "";
        for(int i = 0; i < max; i++){
            result += '0';
        }

        if(result != ""){
            return result;
        }else{
            return " \"\"";
        }
    }


    public static int nextPrime(int a){
        int i = a - 1;
        int flag = 1;
        while (flag != 0){
            i++;
            flag = 0;
            for(int j = 2; j < (int) i/2; j++){
                if (i % j == 0){
                    flag = 1;
                    continue;
                }
            }
        }
        return i;
    }


    public static boolean rightTriangle(int x, int y, int z){
        if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2)){
            return true;
        } else if (Math.pow(y, 2) + Math.pow(z, 2) == Math.pow(x, 2)) {
            return true;
        } else if (Math.pow(x, 2) + Math.pow(z, 2) == Math.pow(y, 2)) {
            return true;
        }else {
            return false;
        }
    }

}
