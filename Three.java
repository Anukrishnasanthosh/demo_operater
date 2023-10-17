package demo_operater;

public class Three {
		    public static void main(String[] args) {
		        int xSize = 3;
		        int ySize = 4;
		        int zSize = 2;
		        int[][][] threeDimArray = new int[xSize][ySize][zSize];
		        for (int x = 0; x < xSize; x++) {
		            for (int y = 0; y < ySize; y++) {
		                for (int z = 0; z < zSize; z++) {
		                    threeDimArray[x][y][z] = x * 100 + y * 10 + z;
		                }
		            }
		        }
		        for (int x = 0; x < xSize; x++) {
		            for (int y = 0; y < ySize; y++) {
		                for (int z = 0; z < zSize; z++) {
		                    System.out.println("threeDimArray[" + x + "][" + y + "][" + z + "] = " + threeDimArray[x][y][z]);
		                }
		            }
		        }

	}

}
