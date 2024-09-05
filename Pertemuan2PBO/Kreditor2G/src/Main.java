public class Main {
    public static void main(String[] args) {
        //Membaca input dari parameter
        double hutang = Double.parseDouble(args[0]);
        float bunga = Float.parseFloat(args[1]);
        int jumlahCicilan = Integer.parseInt(args[2]);

        //Tampilkan data input
        System.out.println("Hutang         :"+hutang);
        System.out.println("Bunga          :"+bunga);
        System.out.println("Jumlah Cicilan :"+jumlahCicilan);

        //Menghitung total yang harus dibayar
        double totalBayar = hutang + (hutang * bunga / 100);

        //Jumlah yang harus dibayarkan di tiap cicilan
        double angsuran = totalBayar / jumlahCicilan;

        //Tampilkan data total bayar dan angsuran
        System.out.println("--------------------------");
        System.out.println("Total Bayar :"+totalBayar);
        System.out.println("Angsuran :"+angsuran);

        //Tampilkan header tabel
        System.out.println("+--------------+--------------+---------------+");
        System.out.println("| Angsuran Ke- | Jumlah Bayar | Sisa Pinjaman |");
        System.out.println("+--------------+--------------+---------------+");

        //Tampilkan  isi tabel
        for (int i = 0; i < jumlahCicilan ; i++) {
            totalBayar -= angsuran;
            System.out.printf("|%14d| %13.1f| %14.1f|\n",i+1,angsuran,totalBayar);
            System.out.println("+--------------+--------------+---------------+");
        }
    }
}