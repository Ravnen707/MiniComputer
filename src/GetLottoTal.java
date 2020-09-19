public class GetLottoTal {
        public static void GetLottoTal() {
        int[] tal =  new int[7];
        for (int i = 0; i < 7; i++) {
            int a = (int)(Math.random() * 101);
            tal[i] =  a ;
        }
        System.out.println( "Lotta tallene er " + tal[0] + " + " + tal[1] + " +  "+ tal[2] +" + "+ tal[3] + " + "+ tal[4] + " + "+ tal[5] + " + "+ tal[6]);
    }
    }


