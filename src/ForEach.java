public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Ilham ", "Naffi ", "Gemar ", "Mengoding"
        };


//        contoh menggunakan perulangan tanpa for each, bisa dibilang bertele-tele
//        for (var i = 0; i < name.length; i++){
//            System.out.println(name[i]);
//        };

//        contoh penggunaan for each yang benar
        for (var name : names){
            System.out.println(name);
        }
    }
}
