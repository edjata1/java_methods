/** Computes the volume of a cube. 
*@param sideLength the side length of the cube 
*@return volume
*/

public class Cube3
{

   public static void main(String[] args)
   {   
      double len = 2;  
       
      double result = cubeVolume(len);
         
      System.out.println(result);  
       
      len = 10;   
      result = cubeVolume(len);   
      System.out.println(result);
   }
         public static double cubeVolume(double sideLength)
      {      
         double volume = sideLength * sideLength * sideLength;   
         return volume;
      }
}