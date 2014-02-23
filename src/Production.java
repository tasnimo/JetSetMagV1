/***********************************************************************
 * Module:  Production.java
 * Author:  tasnim
 * Purpose: Defines the Class Production
 ***********************************************************************/

import java.util.*;

/** @pdOid 499d7e96-22d3-49e6-9a49-5e3fbbec6e71 */
public class Production {
   /** @pdOid 16977b23-16d4-49ab-8a8c-3f666a4e9d01 */
   private int idProduction;
   /** @pdOid 42006408-f72e-432e-b270-02ca39119144 */
   private String nomProduction;
   
   /** @pdOid ef47b558-efb8-4456-8359-37c7b61c89d6 */
   public String getNomProduction() {
      return nomProduction;
   }
   
   /** @param newNomProduction
    * @pdOid df62a8c2-306d-420f-9927-93fcb95929fd */
   public void setNomProduction(String newNomProduction) {
      nomProduction = newNomProduction;
   }
   
   /** @pdOid b444dd2f-da19-47ad-a1b0-b70ff290c1aa */
   public int create() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid a2b48ffa-a085-41f0-89c2-5c16f944712f */
   public int update() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 0c30c5b5-da95-43e0-959b-91968258e763 */
   public int delete() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 6ba8cb5d-913b-49ea-be0e-18ea366933f1 */
   public static List<Production> read() {
      // TODO: implement
      return null;
   }

}