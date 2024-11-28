public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        int iniInt = 100;

        Integer iniInteger = iniInt;

        long iniLong = iniInteger.longValue();
        byte iniByte = iniInteger.byteValue();

        Byte iniByte2 = iniByte;
    }
}