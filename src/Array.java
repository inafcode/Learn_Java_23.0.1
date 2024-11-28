public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Rheyfatta";
        stringArray[1] = "Ilham";
        stringArray[2] = "Naffi";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        System.out.println(String.join(" ", stringArray));

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7
        };

        long[] arrayLong = {
                10L, 20L, 30L, 40L
        };

//        mengubah data array yang bernilai 0 menjadi 0.
        arrayLong[0] = 0;

        String[] arrayName = {
                "Rheyfatta", "Ilham", "Naffi"
        };

        arrayName[2] = null;

//        Mengetahui panjang array
//        System.out.println(arrayLong.length);


        String[][] members = {
                {"Rheyfatta", "Ilham", "Naffi"},
                {"Muhammad", "Nur"},
                {"Maulana", "Aditya"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
