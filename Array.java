public class Array {
    public static void main(String[] args) {
        int[] calificacions = new int[4];

        calificacions[0] = 85;
        calificacions[1] = 90;
        calificacions[2] = 70;
        calificacions[3] = 95;
        
        // for(int i = 0; i < calificacions.length;i++){
        //     System.out.println(calificacions[i]);    
        // }

        // for(int calificacion : calificacions) {
        //     System.out.println(calificacion);
        // }

        int[][] matriz = new int[2][3];

        for(int i = 0; i < matriz.length ; i++){
            for(int j = 0;j < matriz[i].length;j++){
                matriz[i][j] = (int)(Math.random() * 100) + 1;
            }
        }

        String cad = "";
        for(int i = 0; i < matriz.length ; i++){
            for(int j = 0;j < matriz[i].length;j++){
                cad = cad + matriz[i][j] + ",";
            }
            cad += "\n";
        }

        System.out.println(cad);
    }
}
