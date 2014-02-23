/***********************************************************************
 * Module:  Cinema.java
 * Author:  tasnim
 * Purpose: Defines the Class Cinema
 ***********************************************************************/

import java.util.*;

/** @pdOid 21089c42-139e-4f7c-ab6c-1e0dc0b9858f */
public class Cinema {
   /** @pdOid dbd6b156-6dae-4a7d-8e91-dcb2e10ed33c */
   private int idSalle;
   /** @pdOid 8fa099c0-9aec-430b-915a-f49fdd39eb17 */
   private String addresse;
   
   /** @pdOid 3a75c07d-359f-4dde-aa90-c2d0ffaedb98 */
   public String getAddresse() {
      return addresse;
   }
   
   /** @param newAddresse
    * @pdOid b7eb1a80-bc80-48f6-ac12-54d02d7b4545 */
   public void setAddresse(String newAddresse) {
      addresse = newAddresse;
   }
   
   /** @pdOid f7196d89-3e04-4c30-a1cd-be328c6a41ee */
   public int update() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid b8a58591-0cfc-4eb1-b0bc-903427c9ccbd */
   public int create() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid e25c100a-c9c3-4151-a23a-d1232fc60949 */
   public static List<Cinema> read() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid e6106419-8870-48a8-8f3a-f890fedcf299 */
   public int delete() {
      // TODO: implement
      return 0;
   }

}